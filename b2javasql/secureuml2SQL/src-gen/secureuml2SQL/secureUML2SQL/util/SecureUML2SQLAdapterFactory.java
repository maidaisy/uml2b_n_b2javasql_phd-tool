/**
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.secureUML2SQL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import secureuml2SQL.secureUML2SQL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see secureuml2SQL.secureUML2SQL.SecureUML2SQLPackage
 * @generated
 */
public class SecureUML2SQLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SecureUML2SQLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecureUML2SQLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SecureUML2SQLPackage.eINSTANCE;
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
  protected SecureUML2SQLSwitch<Adapter> modelSwitch =
    new SecureUML2SQLSwitch<Adapter>()
    {
      @Override
      public Adapter caseSecureUML2SQL(SecureUML2SQL object)
      {
        return createSecureUML2SQLAdapter();
      }
      @Override
      public Adapter caseBMachine(BMachine object)
      {
        return createBMachineAdapter();
      }
      @Override
      public Adapter caseBProperties(BProperties object)
      {
        return createBPropertiesAdapter();
      }
      @Override
      public Adapter caseBTuple(BTuple object)
      {
        return createBTupleAdapter();
      }
      @Override
      public Adapter caseBSet(BSet object)
      {
        return createBSetAdapter();
      }
      @Override
      public Adapter caseBESet(BESet object)
      {
        return createBESetAdapter();
      }
      @Override
      public Adapter caseBSetValue(BSetValue object)
      {
        return createBSetValueAdapter();
      }
      @Override
      public Adapter caseBConstant(BConstant object)
      {
        return createBConstantAdapter();
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
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.SecureUML2SQL <em>Secure UML2SQL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.SecureUML2SQL
   * @generated
   */
  public Adapter createSecureUML2SQLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BMachine <em>BMachine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BMachine
   * @generated
   */
  public Adapter createBMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BProperties <em>BProperties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BProperties
   * @generated
   */
  public Adapter createBPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BTuple <em>BTuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BTuple
   * @generated
   */
  public Adapter createBTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BSet <em>BSet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BSet
   * @generated
   */
  public Adapter createBSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BESet <em>BE Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BESet
   * @generated
   */
  public Adapter createBESetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BSetValue <em>BSet Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BSetValue
   * @generated
   */
  public Adapter createBSetValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link secureuml2SQL.secureUML2SQL.BConstant <em>BConstant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see secureuml2SQL.secureUML2SQL.BConstant
   * @generated
   */
  public Adapter createBConstantAdapter()
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

} //SecureUML2SQLAdapterFactory
