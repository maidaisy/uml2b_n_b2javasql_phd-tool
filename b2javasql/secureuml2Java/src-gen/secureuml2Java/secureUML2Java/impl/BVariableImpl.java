/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secureuml2Java.secureUML2Java.BVariable;
import secureuml2Java.secureUML2Java.SecureUML2JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BVariable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BVariableImpl#getVar_name <em>Var name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BVariableImpl extends MinimalEObjectImpl.Container implements BVariable
{
  /**
   * The default value of the '{@link #getVar_name() <em>Var name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_name()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar_name() <em>Var name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_name()
   * @generated
   * @ordered
   */
  protected String var_name = VAR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BVariableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SecureUML2JavaPackage.Literals.BVARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar_name()
  {
    return var_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar_name(String newVar_name)
  {
    String oldVar_name = var_name;
    var_name = newVar_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BVARIABLE__VAR_NAME, oldVar_name, var_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SecureUML2JavaPackage.BVARIABLE__VAR_NAME:
        return getVar_name();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecureUML2JavaPackage.BVARIABLE__VAR_NAME:
        setVar_name((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SecureUML2JavaPackage.BVARIABLE__VAR_NAME:
        setVar_name(VAR_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SecureUML2JavaPackage.BVARIABLE__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? var_name != null : !VAR_NAME_EDEFAULT.equals(var_name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (var_name: ");
    result.append(var_name);
    result.append(')');
    return result.toString();
  }

} //BVariableImpl