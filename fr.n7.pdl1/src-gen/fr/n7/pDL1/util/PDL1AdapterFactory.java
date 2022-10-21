/**
 * generated by Xtext 2.28.0
 */
package fr.n7.pDL1.util;

import fr.n7.pDL1.Guidance;
import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.ProcessElement;
import fr.n7.pDL1.WorkDefinition;
import fr.n7.pDL1.WorkSequence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.pDL1.PDL1Package
 * @generated
 */
public class PDL1AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PDL1Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL1AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PDL1Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDL1Switch<Adapter> modelSwitch =
    new PDL1Switch<Adapter>()
    {
      @Override
      public Adapter caseProcess(fr.n7.pDL1.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessElement(ProcessElement object)
      {
        return createProcessElementAdapter();
      }
      @Override
      public Adapter caseWorkDefinition(WorkDefinition object)
      {
        return createWorkDefinitionAdapter();
      }
      @Override
      public Adapter caseWorkSequence(WorkSequence object)
      {
        return createWorkSequenceAdapter();
      }
      @Override
      public Adapter caseGuidance(Guidance object)
      {
        return createGuidanceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.n7.pDL1.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.n7.pDL1.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.n7.pDL1.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.n7.pDL1.ProcessElement
   * @generated
   */
  public Adapter createProcessElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.n7.pDL1.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.n7.pDL1.WorkDefinition
   * @generated
   */
  public Adapter createWorkDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.n7.pDL1.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.n7.pDL1.WorkSequence
   * @generated
   */
  public Adapter createWorkSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.n7.pDL1.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.n7.pDL1.Guidance
   * @generated
   */
  public Adapter createGuidanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PDL1AdapterFactory
