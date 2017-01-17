/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secureuml2Java.secureUML2Java.BFunction;
import secureuml2Java.secureUML2Java.SecureUML2JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BFunctionImpl#getRan <em>Ran</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BFunctionImpl#getDom <em>Dom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BFunctionImpl extends MinimalEObjectImpl.Container implements BFunction
{
  /**
   * The default value of the '{@link #getRan() <em>Ran</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRan()
   * @generated
   * @ordered
   */
  protected static final String RAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRan() <em>Ran</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRan()
   * @generated
   * @ordered
   */
  protected String ran = RAN_EDEFAULT;

  /**
   * The default value of the '{@link #getDom() <em>Dom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDom()
   * @generated
   * @ordered
   */
  protected static final String DOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDom() <em>Dom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDom()
   * @generated
   * @ordered
   */
  protected String dom = DOM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BFunctionImpl()
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
    return SecureUML2JavaPackage.Literals.BFUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRan()
  {
    return ran;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRan(String newRan)
  {
    String oldRan = ran;
    ran = newRan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BFUNCTION__RAN, oldRan, ran));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDom()
  {
    return dom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDom(String newDom)
  {
    String oldDom = dom;
    dom = newDom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BFUNCTION__DOM, oldDom, dom));
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
      case SecureUML2JavaPackage.BFUNCTION__RAN:
        return getRan();
      case SecureUML2JavaPackage.BFUNCTION__DOM:
        return getDom();
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
      case SecureUML2JavaPackage.BFUNCTION__RAN:
        setRan((String)newValue);
        return;
      case SecureUML2JavaPackage.BFUNCTION__DOM:
        setDom((String)newValue);
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
      case SecureUML2JavaPackage.BFUNCTION__RAN:
        setRan(RAN_EDEFAULT);
        return;
      case SecureUML2JavaPackage.BFUNCTION__DOM:
        setDom(DOM_EDEFAULT);
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
      case SecureUML2JavaPackage.BFUNCTION__RAN:
        return RAN_EDEFAULT == null ? ran != null : !RAN_EDEFAULT.equals(ran);
      case SecureUML2JavaPackage.BFUNCTION__DOM:
        return DOM_EDEFAULT == null ? dom != null : !DOM_EDEFAULT.equals(dom);
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
    result.append(" (ran: ");
    result.append(ran);
    result.append(", dom: ");
    result.append(dom);
    result.append(')');
    return result.toString();
  }

} //BFunctionImpl