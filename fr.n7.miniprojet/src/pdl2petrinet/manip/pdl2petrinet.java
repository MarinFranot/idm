package pdl2petrinet.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.impl.SimplePDLPackageImpl;
import simplepdl.impl.WorkDefinitionImpl;
import simplepdl.*;
import simplepdl.WorkSequenceType;

import petrinet.*;

public class pdl2petrinet {

	public static void main(String[] args) {
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplePDLPackage packageInstance = SimplePDLPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resPDL = new ResourceSetImpl();
		ResourceSet resPetri = new ResourceSetImpl();

		// Charger la ressource (notre modÃ¨le)
		URI modelURIpdl = URI.createURI("models/SimplePDL.xmi");
		Resource resourcePDL = resPDL.getResource(modelURIpdl, true);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resourcePDL.getContents().get(0);
		
		URI modelURIpetri = URI.createURI("models/PetriNet_" + process.getName() + ".xmi");
		Resource resourcePetri = resPetri.createResource(modelURIpetri);
		System.out.println("Ressource created: " + resourcePetri);
		
		PetriNetFactory petriFactory = PetriNetFactory.eINSTANCE;
		
		PetriNet petrinet = petriFactory.createPetriNet();
		petrinet.setName(process.getName());
		EList<Node> nodes = petrinet.getNodes();
		EList<Arc> arcs = petrinet.getArcs();
		
		resourcePetri.getContents().add(petrinet);
		
		
		// On crée d'abord les places pour toutes les WorkDefinition
		for (Object obj : process.getProcessElements()) {
			
			System.out.println(obj.getClass().toString());
			
			if (obj instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) obj;
				
				System.out.println("wd : " + wd);
				
				Place p_ready = petriFactory.createPlace();
				p_ready.setName(wd.getName() + "_ready");
				p_ready.setNumber(1);
				nodes.add(p_ready);
				
				Place p_started = petriFactory.createPlace();
				p_started.setName(wd.getName() + "_started");
				p_started.setNumber(0);
				nodes.add(p_started);
				
				Place p_finished = petriFactory.createPlace();
				p_finished.setName(wd.getName() + "_finished");
				p_finished.setNumber(0);
				nodes.add(p_finished);
				
				Place p_running = petriFactory.createPlace();
				p_running.setName(wd.getName() + "_running");
				p_running.setNumber(0);
				nodes.add(p_running);
						
				Transition t_starts = petriFactory.createTransition();
				t_starts.setName(wd.getName()+ "_starts");
				nodes.add(t_starts);
				
				Transition t_finishes = petriFactory.createTransition();
				t_finishes.setName(wd.getName()+ "_finishes");	
				nodes.add(t_finishes);
								
				Arc a_r2s = petriFactory.createArc();
				a_r2s.setSource(p_ready);
				a_r2s.setTarget(t_starts);
				a_r2s.setWeight(1);
				arcs.add(a_r2s);
				
				Arc a_s2sd = petriFactory.createArc();
				a_s2sd.setSource(t_starts);
				a_s2sd.setTarget(p_started);
				a_s2sd.setWeight(1);
				arcs.add(a_s2sd);
				
				Arc a_s2ru = petriFactory.createArc();
				a_s2ru.setSource(t_starts);
				a_s2ru.setTarget(p_running);
				a_s2ru.setWeight(1);
				arcs.add(a_s2ru);
				
				Arc a_ru2f = petriFactory.createArc();
				a_ru2f.setSource(p_running);
				a_ru2f.setTarget(t_finishes);
				a_ru2f.setWeight(1);
				arcs.add(a_ru2f);
				
				Arc a_f2fd = petriFactory.createArc();
				a_f2fd.setSource(t_finishes);
				a_f2fd.setTarget(p_finished);
				a_f2fd.setWeight(1);
				arcs.add(a_f2fd);
			}
		}
		
		// Puis on traite les WorkSequence
		for (Object obj : process.getProcessElements()) {
			if (obj instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) obj;
				Arc a_s2s = petriFactory.createArc();
				a_s2s.setName(ws.getPredecessor().getName() + "to" + ws.getSuccessor().getName());
				if (ws.getLinkType() == WorkSequenceType.START_TO_START) {
					Place p;
					Transition t;
					p = (Place) getNode(nodes, ws, "_started", true);
					t = (Transition) getNode(nodes, ws, "_starts", false);
					a_s2s.setSource(p);
					a_s2s.setTarget(t);
					a_s2s.setWeight(1);
					arcs.add(a_s2s);
				}
			}
		}
		
		// Puis on traite les Ressource
		for (Object obj : process.getProcessElements()) {
			 if (obj instanceof Ressource) {
				Ressource ressource = (Ressource) obj;
				Place p_ressource = petriFactory.createPlace();
				p_ressource.setName(ressource.getName() + "_ressource");
				p_ressource.setNumber(ressource.getQuantity());
				nodes.add(p_ressource);
			}
		}
		
		// Puis on traite les RessourceUtilisation
		for (Object obj : process.getProcessElements()) {
			 if (obj instanceof RessourceUtilisation) {
				RessourceUtilisation ressourceUtilisation = (RessourceUtilisation) obj;
				Ressource ressource = ressourceUtilisation.getRessource();
				
			}
		}
		
	    try {
	    	resourcePetri.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Node getNode (EList<Node> nodes, WorkSequence ws, String suffixe, Boolean place) {
		Node p = null;
		for (Node n: nodes) {
			System.out.println("node : " + n);
			if (place && n instanceof Place & n.getName().compareTo(ws.getPredecessor().getName() + suffixe) == 0) {
				p = n;
			} else if (!place && n instanceof Transition & n.getName().compareTo(ws.getPredecessor().getName() + suffixe) == 0) {
				p = n;
			}
		}
		System.out.println("p: " + p);
		return p;
	}

}
