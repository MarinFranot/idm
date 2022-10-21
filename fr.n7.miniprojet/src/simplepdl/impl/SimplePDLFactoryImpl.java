/**
 */
package simplepdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplepdl.Guidance;
import simplepdl.Ressource;
import simplepdl.RessourceUtilisation;
import simplepdl.SimplePDLFactory;
import simplepdl.SimplePDLPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplePDLFactoryImpl extends EFactoryImpl implements SimplePDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplePDLFactory init() {
		try {
			SimplePDLFactory theSimplePDLFactory = (SimplePDLFactory)EPackage.Registry.INSTANCE.getEFactory(SimplePDLPackage.eNS_URI);
			if (theSimplePDLFactory != null) {
				return theSimplePDLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplePDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePDLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplePDLPackage.PROCESS: return createProcess();
			case SimplePDLPackage.WORK_DEFINITION: return createWorkDefinition();
			case SimplePDLPackage.WORK_SEQUENCE: return createWorkSequence();
			case SimplePDLPackage.GUIDANCE: return createGuidance();
			case SimplePDLPackage.RESSOURCE: return createRessource();
			case SimplePDLPackage.RESSOURCE_UTILISATION: return createRessourceUtilisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimplePDLPackage.WORK_SEQUENCE_TYPE:
				return createWorkSequenceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimplePDLPackage.WORK_SEQUENCE_TYPE:
				return convertWorkSequenceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplepdl.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition createWorkDefinition() {
		WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequence createWorkSequence() {
		WorkSequenceImpl workSequence = new WorkSequenceImpl();
		return workSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guidance createGuidance() {
		GuidanceImpl guidance = new GuidanceImpl();
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceUtilisation createRessourceUtilisation() {
		RessourceUtilisationImpl ressourceUtilisation = new RessourceUtilisationImpl();
		return ressourceUtilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequenceType createWorkSequenceTypeFromString(EDataType eDataType, String initialValue) {
		WorkSequenceType result = WorkSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePDLPackage getSimplePDLPackage() {
		return (SimplePDLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplePDLPackage getPackage() {
		return SimplePDLPackage.eINSTANCE;
	}

} //SimplePDLFactoryImpl
