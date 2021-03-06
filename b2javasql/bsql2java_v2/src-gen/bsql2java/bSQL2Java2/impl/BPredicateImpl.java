/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2.impl;

import bsql2java.bSQL2Java2.BPredicate;
import bsql2java.bSQL2Java2.BSQL2Java2Package;
import bsql2java.bSQL2Java2.SQLCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPredicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BPredicateImpl#getPLeft <em>PLeft</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BPredicateImpl#getPRight <em>PRight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPredicateImpl extends MinimalEObjectImpl.Container implements BPredicate
{
  /**
   * The cached value of the '{@link #getPLeft() <em>PLeft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPLeft()
   * @generated
   * @ordered
   */
  protected SQLCall pLeft;

  /**
   * The default value of the '{@link #getPRight() <em>PRight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPRight()
   * @generated
   * @ordered
   */
  protected static final String PRIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPRight() <em>PRight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPRight()
   * @generated
   * @ordered
   */
  protected String pRight = PRIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BPredicateImpl()
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
    return BSQL2Java2Package.Literals.BPREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQLCall getPLeft()
  {
    return pLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPLeft(SQLCall newPLeft, NotificationChain msgs)
  {
    SQLCall oldPLeft = pLeft;
    pLeft = newPLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPREDICATE__PLEFT, oldPLeft, newPLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPLeft(SQLCall newPLeft)
  {
    if (newPLeft != pLeft)
    {
      NotificationChain msgs = null;
      if (pLeft != null)
        msgs = ((InternalEObject)pLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BPREDICATE__PLEFT, null, msgs);
      if (newPLeft != null)
        msgs = ((InternalEObject)newPLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BPREDICATE__PLEFT, null, msgs);
      msgs = basicSetPLeft(newPLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPREDICATE__PLEFT, newPLeft, newPLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPRight()
  {
    return pRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPRight(String newPRight)
  {
    String oldPRight = pRight;
    pRight = newPRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPREDICATE__PRIGHT, oldPRight, pRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BSQL2Java2Package.BPREDICATE__PLEFT:
        return basicSetPLeft(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BSQL2Java2Package.BPREDICATE__PLEFT:
        return getPLeft();
      case BSQL2Java2Package.BPREDICATE__PRIGHT:
        return getPRight();
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
      case BSQL2Java2Package.BPREDICATE__PLEFT:
        setPLeft((SQLCall)newValue);
        return;
      case BSQL2Java2Package.BPREDICATE__PRIGHT:
        setPRight((String)newValue);
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
      case BSQL2Java2Package.BPREDICATE__PLEFT:
        setPLeft((SQLCall)null);
        return;
      case BSQL2Java2Package.BPREDICATE__PRIGHT:
        setPRight(PRIGHT_EDEFAULT);
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
      case BSQL2Java2Package.BPREDICATE__PLEFT:
        return pLeft != null;
      case BSQL2Java2Package.BPREDICATE__PRIGHT:
        return PRIGHT_EDEFAULT == null ? pRight != null : !PRIGHT_EDEFAULT.equals(pRight);
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
    result.append(" (PRight: ");
    result.append(pRight);
    result.append(')');
    return result.toString();
  }

} //BPredicateImpl
