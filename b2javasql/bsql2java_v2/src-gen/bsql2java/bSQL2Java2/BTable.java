/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.BTable#getTable_name <em>Table name</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BTable#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBTable()
 * @model
 * @generated
 */
public interface BTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Table name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table name</em>' attribute.
   * @see #setTable_name(String)
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBTable_Table_name()
   * @model
   * @generated
   */
  String getTable_name();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java2.BTable#getTable_name <em>Table name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table name</em>' attribute.
   * @see #getTable_name()
   * @generated
   */
  void setTable_name(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link bsql2java.bSQL2Java2.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBTable_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // BTable
