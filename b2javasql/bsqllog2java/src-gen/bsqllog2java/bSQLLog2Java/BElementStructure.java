/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java;

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
 *   <li>{@link bsqllog2java.bSQLLog2Java.BElementStructure#getE <em>E</em>}</li>
 * </ul>
 *
 * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBElementStructure()
 * @model
 * @generated
 */
public interface BElementStructure extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link bsqllog2java.bSQLLog2Java.BElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBElementStructure_E()
   * @model containment="true"
   * @generated
   */
  EList<BElement> getE();

} // BElementStructure
