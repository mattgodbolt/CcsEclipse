/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.Nested#getSelector <em>Selector</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Nested#getImport <em>Import</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Nested#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Nested#getProperty <em>Property</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Nested#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested()
 * @model
 * @generated
 */
public interface Nested extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(Selector)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested_Selector()
   * @model containment="true"
   * @generated
   */
  Selector getSelector();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Nested#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(Selector value);

  /**
   * Returns the value of the '<em><b>Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import</em>' containment reference.
   * @see #setImport(Import)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested_Import()
   * @model containment="true"
   * @generated
   */
  Import getImport();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Nested#getImport <em>Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import</em>' containment reference.
   * @see #getImport()
   * @generated
   */
  void setImport(Import value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Nested#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Nested#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link net.immute.ccs.ccsEclipse.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getNested_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Nested
