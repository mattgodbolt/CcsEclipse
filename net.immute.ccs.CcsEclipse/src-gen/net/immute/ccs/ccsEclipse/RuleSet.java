/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.RuleSet#getContext <em>Context</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.RuleSet#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference.
   * @see #setContext(Context)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRuleSet_Context()
   * @model containment="true"
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.RuleSet#getContext <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' containment reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' attribute list.
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRuleSet_Rules()
   * @model unique="false"
   * @generated
   */
  EList<String> getRules();

} // RuleSet
