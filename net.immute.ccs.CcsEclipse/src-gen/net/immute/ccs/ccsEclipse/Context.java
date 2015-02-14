/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.Context#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' attribute.
   * @see #setSelector(String)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getContext_Selector()
   * @model
   * @generated
   */
  String getSelector();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Context#getSelector <em>Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' attribute.
   * @see #getSelector()
   * @generated
   */
  void setSelector(String value);

} // Context
