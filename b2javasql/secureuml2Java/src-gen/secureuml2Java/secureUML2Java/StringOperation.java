/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getRes1 <em>Res1</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getOp_name <em>Op name</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getPList <em>PList</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getParams <em>Params</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getPres1 <em>Pres1</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getPres2 <em>Pres2</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getSubif <em>Subif</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getSubelse2 <em>Subelse2</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.StringOperation#getSubelse1 <em>Subelse1</em>}</li>
 * </ul>
 *
 * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation()
 * @model
 * @generated
 */
public interface StringOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Res1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res1</em>' attribute.
   * @see #setRes1(String)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Res1()
   * @model
   * @generated
   */
  String getRes1();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.StringOperation#getRes1 <em>Res1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res1</em>' attribute.
   * @see #getRes1()
   * @generated
   */
  void setRes1(String value);

  /**
   * Returns the value of the '<em><b>Op name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op name</em>' attribute.
   * @see #setOp_name(String)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Op_name()
   * @model
   * @generated
   */
  String getOp_name();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.StringOperation#getOp_name <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op name</em>' attribute.
   * @see #getOp_name()
   * @generated
   */
  void setOp_name(String value);

  /**
   * Returns the value of the '<em><b>PList</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PList</em>' attribute list.
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_PList()
   * @model unique="false"
   * @generated
   */
  EList<String> getPList();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link secureuml2Java.secureUML2Java.BParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<BParameter> getParams();

  /**
   * Returns the value of the '<em><b>Pres1</b></em>' containment reference list.
   * The list contents are of type {@link secureuml2Java.secureUML2Java.BPredicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pres1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pres1</em>' containment reference list.
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Pres1()
   * @model containment="true"
   * @generated
   */
  EList<BPredicate> getPres1();

  /**
   * Returns the value of the '<em><b>Pres2</b></em>' containment reference list.
   * The list contents are of type {@link secureuml2Java.secureUML2Java.BPredicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pres2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pres2</em>' containment reference list.
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Pres2()
   * @model containment="true"
   * @generated
   */
  EList<BPredicate> getPres2();

  /**
   * Returns the value of the '<em><b>Subif</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subif</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subif</em>' containment reference.
   * @see #setSubif(BSubstitution)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Subif()
   * @model containment="true"
   * @generated
   */
  BSubstitution getSubif();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.StringOperation#getSubif <em>Subif</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subif</em>' containment reference.
   * @see #getSubif()
   * @generated
   */
  void setSubif(BSubstitution value);

  /**
   * Returns the value of the '<em><b>Subelse2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subelse2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subelse2</em>' containment reference.
   * @see #setSubelse2(BSubstitution)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Subelse2()
   * @model containment="true"
   * @generated
   */
  BSubstitution getSubelse2();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.StringOperation#getSubelse2 <em>Subelse2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subelse2</em>' containment reference.
   * @see #getSubelse2()
   * @generated
   */
  void setSubelse2(BSubstitution value);

  /**
   * Returns the value of the '<em><b>Subelse1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subelse1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subelse1</em>' containment reference.
   * @see #setSubelse1(BSubstitution)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getStringOperation_Subelse1()
   * @model containment="true"
   * @generated
   */
  BSubstitution getSubelse1();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.StringOperation#getSubelse1 <em>Subelse1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subelse1</em>' containment reference.
   * @see #getSubelse1()
   * @generated
   */
  void setSubelse1(BSubstitution value);

} // StringOperation
