/**
 */
package net.immute.ccs.ccsEclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.immute.ccs.ccsEclipse.CcsEclipseFactory
 * @model kind="package"
 * @generated
 */
public interface CcsEclipsePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ccsEclipse";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.immute.net/ccs/CcsEclipse";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ccsEclipse";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CcsEclipsePackage eINSTANCE = net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl.init();

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.RuleSetImpl <em>Rule Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.RuleSetImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getRuleSet()
   * @generated
   */
  int RULE_SET = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__RULES = 1;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.ContextImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__SELECTOR = 0;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.SelectorImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 2;

  /**
   * The feature id for the '<em><b>Sum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SUM = 0;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.RuleImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getRule()
   * @generated
   */
  int RULE = 3;

  /**
   * The feature id for the '<em><b>Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__IMPORT = 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NESTED = 3;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.NestedImpl <em>Nested</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.NestedImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getNested()
   * @generated
   */
  int NESTED = 4;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED__SELECTOR = 0;

  /**
   * The feature id for the '<em><b>Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED__IMPORT = 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED__CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED__PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED__RULES = 4;

  /**
   * The number of structural features of the '<em>Nested</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.ModifierImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 5;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__OVERRIDE = 0;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.PropertyImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.immute.ccs.ccsEclipse.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.immute.ccs.ccsEclipse.impl.ImportImpl
   * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Set</em>'.
   * @see net.immute.ccs.ccsEclipse.RuleSet
   * @generated
   */
  EClass getRuleSet();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.RuleSet#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see net.immute.ccs.ccsEclipse.RuleSet#getContext()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Context();

  /**
   * Returns the meta object for the containment reference list '{@link net.immute.ccs.ccsEclipse.RuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see net.immute.ccs.ccsEclipse.RuleSet#getRules()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Rules();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see net.immute.ccs.ccsEclipse.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Context#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see net.immute.ccs.ccsEclipse.Context#getSelector()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Selector();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see net.immute.ccs.ccsEclipse.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Selector#getSum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sum</em>'.
   * @see net.immute.ccs.ccsEclipse.Selector#getSum()
   * @see #getSelector()
   * @generated
   */
  EAttribute getSelector_Sum();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see net.immute.ccs.ccsEclipse.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Rule#getImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import</em>'.
   * @see net.immute.ccs.ccsEclipse.Rule#getImport()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Import();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Rule#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see net.immute.ccs.ccsEclipse.Rule#getConstraint()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Rule#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see net.immute.ccs.ccsEclipse.Rule#getProperty()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Property();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Rule#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see net.immute.ccs.ccsEclipse.Rule#getNested()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Nested();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Nested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested
   * @generated
   */
  EClass getNested();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Nested#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested#getSelector()
   * @see #getNested()
   * @generated
   */
  EReference getNested_Selector();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Nested#getImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested#getImport()
   * @see #getNested()
   * @generated
   */
  EReference getNested_Import();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Nested#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested#getConstraint()
   * @see #getNested()
   * @generated
   */
  EAttribute getNested_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link net.immute.ccs.ccsEclipse.Nested#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested#getProperty()
   * @see #getNested()
   * @generated
   */
  EReference getNested_Property();

  /**
   * Returns the meta object for the containment reference list '{@link net.immute.ccs.ccsEclipse.Nested#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see net.immute.ccs.ccsEclipse.Nested#getRules()
   * @see #getNested()
   * @generated
   */
  EReference getNested_Rules();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see net.immute.ccs.ccsEclipse.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Modifier#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see net.immute.ccs.ccsEclipse.Modifier#isOverride()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Override();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see net.immute.ccs.ccsEclipse.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference list '{@link net.immute.ccs.ccsEclipse.Property#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see net.immute.ccs.ccsEclipse.Property#getModifiers()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.immute.ccs.ccsEclipse.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.immute.ccs.ccsEclipse.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Value();

  /**
   * Returns the meta object for class '{@link net.immute.ccs.ccsEclipse.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see net.immute.ccs.ccsEclipse.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.immute.ccs.ccsEclipse.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CcsEclipseFactory getCcsEclipseFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.RuleSetImpl <em>Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.RuleSetImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getRuleSet()
     * @generated
     */
    EClass RULE_SET = eINSTANCE.getRuleSet();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__CONTEXT = eINSTANCE.getRuleSet_Context();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.ContextImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__SELECTOR = eINSTANCE.getContext_Selector();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.SelectorImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__SUM = eINSTANCE.getSelector_Sum();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.RuleImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__IMPORT = eINSTANCE.getRule_Import();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__CONSTRAINT = eINSTANCE.getRule_Constraint();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__PROPERTY = eINSTANCE.getRule_Property();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__NESTED = eINSTANCE.getRule_Nested();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.NestedImpl <em>Nested</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.NestedImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getNested()
     * @generated
     */
    EClass NESTED = eINSTANCE.getNested();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED__SELECTOR = eINSTANCE.getNested_Selector();

    /**
     * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED__IMPORT = eINSTANCE.getNested_Import();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NESTED__CONSTRAINT = eINSTANCE.getNested_Constraint();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED__PROPERTY = eINSTANCE.getNested_Property();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED__RULES = eINSTANCE.getNested_Rules();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.ModifierImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__OVERRIDE = eINSTANCE.getModifier_Override();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.PropertyImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__MODIFIERS = eINSTANCE.getProperty_Modifiers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link net.immute.ccs.ccsEclipse.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.immute.ccs.ccsEclipse.impl.ImportImpl
     * @see net.immute.ccs.ccsEclipse.impl.CcsEclipsePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

  }

} //CcsEclipsePackage
