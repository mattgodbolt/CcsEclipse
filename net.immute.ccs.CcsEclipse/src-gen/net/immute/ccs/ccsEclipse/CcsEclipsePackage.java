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
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
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
   * The feature id for the '<em><b>Selector</b></em>' attribute.
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
   * Returns the meta object for the attribute list '{@link net.immute.ccs.ccsEclipse.RuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see net.immute.ccs.ccsEclipse.RuleSet#getRules()
   * @see #getRuleSet()
   * @generated
   */
  EAttribute getRuleSet_Rules();

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
   * Returns the meta object for the attribute '{@link net.immute.ccs.ccsEclipse.Context#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selector</em>'.
   * @see net.immute.ccs.ccsEclipse.Context#getSelector()
   * @see #getContext()
   * @generated
   */
  EAttribute getContext_Selector();

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
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

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
     * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT__SELECTOR = eINSTANCE.getContext_Selector();

  }

} //CcsEclipsePackage
