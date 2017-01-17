/**
 * generated by Xtext 2.10.0
 */
package b2sql.b2SQL2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BElement Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link b2sql.b2SQL2.BElementStructure#getE <em>E</em>}</li>
 * </ul>
 *
 * @see b2sql.b2SQL2.B2SQL2Package#getBElementStructure()
 * @model
 * @generated
 */
public interface BElementStructure extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link b2sql.b2SQL2.BElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see b2sql.b2SQL2.B2SQL2Package#getBElementStructure_E()
   * @model containment="true"
   * @generated
   */
  EList<BElement> getE();

} // BElementStructure