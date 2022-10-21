package pdl2petrinet.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.PetriNetFactory;
import petrinet.PetriNetPackage;

public class petriNetCreator {

	public static void main(String[] args) {
		
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		PetriNetPackage packageInstance = PetriNetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURI = URI.createURI("models/Petri.xmi");
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
		PetriNetFactory myFactory = PetriNetFactory.eINSTANCE;
	    
		
		
		
		// Sauver la ressource
	    try {
	    	resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
