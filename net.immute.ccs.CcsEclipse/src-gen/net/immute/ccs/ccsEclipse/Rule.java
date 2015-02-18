/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.Rule#getImport <em>Import</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Rule#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Rule#getProperty <em>Property</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.Rule#getNested <em>Nested</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
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
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRule_Import()
   * @model containment="true"
   * @generated
   */
  Import getImport();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Rule#getImport <em>Import</em>}' containment reference.
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
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRule_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Rule#getConstraint <em>Constraint</em>}' attribute.
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
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRule_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Rule#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference.
   * @see #setNested(Nested)
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#getRule_Nested()
   * @model containment="true"
   * @generated
   */
  Nested getNested();

  /**
   * Sets the value of the '{@link net.immute.ccs.ccsEclipse.Rule#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(Nested value);

} // Rule
