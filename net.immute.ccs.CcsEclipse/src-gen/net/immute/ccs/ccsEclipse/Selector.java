/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.Selector#getSum <em>Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Sum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' attribute.
   * @see #setSum(String)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getSelector_Sum()
   * @model
   * @generated
   */
  String getSum();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Selector#getSum <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' attribute.
   * @see #getSum()
   * @generated
   */
  void setSum(String value);

} // Selector
