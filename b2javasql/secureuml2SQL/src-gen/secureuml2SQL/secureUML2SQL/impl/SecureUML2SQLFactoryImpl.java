/**
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.secureUML2SQL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import secureuml2SQL.secureUML2SQL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecureUML2SQLFactoryImpl extends EFactoryImpl implements SecureUML2SQLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SecureUML2SQLFactory init()
  {
    try
    {
      SecureUML2SQLFactory theSecureUML2SQLFactory = (SecureUML2SQLFactory)EPackage.Registry.INSTANCE.getEFactory(SecureUML2SQLPackage.eNS_URI);
      if (theSecureUML2SQLFactory != null)
      {
        return theSecureUML2SQLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SecureUML2SQLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecureUML2SQLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SecureUML2SQLPackage.SECURE_UML2SQL: return createSecureUML2SQL();
      case SecureUML2SQLPackage.BMACHINE: return createBMachine();
      case SecureUML2SQLPackage.BPROPERTIES: return createBProperties();
      case SecureUML2SQLPackage.BTUPLE: return createBTuple();
      case SecureUML2SQLPackage.BSET: return createBSet();
      case SecureUML2SQLPackage.BE_SET: return createBESet();
      case SecureUML2SQLPackage.BSET_VALUE: return createBSetValue();
      case SecureUML2SQLPackage.BCONSTANT: return createBConstant();
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
public SecureUML2SQL createSecureUML2SQL()
  {
    SecureUML2SQLImpl secureUML2SQL = new SecureUML2SQLImpl();
    return secureUML2SQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BMachine createBMachine()
  {
    BMachineImpl bMachine = new BMachineImpl();
    return bMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BProperties createBProperties()
  {
    BPropertiesImpl bProperties = new BPropertiesImpl();
    return bProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BTuple createBTuple()
  {
    BTupleImpl bTuple = new BTupleImpl();
    return bTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BSet createBSet()
  {
    BSetImpl bSet = new BSetImpl();
    return bSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BESet createBESet()
  {
    BESetImpl beSet = new BESetImpl();
    return beSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BSetValue createBSetValue()
  {
    BSetValueImpl bSetValue = new BSetValueImpl();
    return bSetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public BConstant createBConstant()
  {
    BConstantImpl bConstant = new BConstantImpl();
    return bConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public SecureUML2SQLPackage getSecureUML2SQLPackage()
  {
    return (SecureUML2SQLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SecureUML2SQLPackage getPackage()
  {
    return SecureUML2SQLPackage.eINSTANCE;
  }

} //SecureUML2SQLFactoryImpl