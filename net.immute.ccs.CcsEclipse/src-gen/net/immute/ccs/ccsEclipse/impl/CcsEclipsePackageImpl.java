/**
 */
package net.immute.ccs.ccsEclipse.impl;

import net.immute.ccs.ccsEclipse.CcsEclipseFactory;
import net.immute.ccs.ccsEclipse.CcsEclipsePackage;
import net.immute.ccs.ccsEclipse.Context;
import net.immute.ccs.ccsEclipse.RuleSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CcsEclipsePackageImpl extends EPackageImpl implements CcsEclipsePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.immute.ccs.ccsEclipse.CcsEclipsePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CcsEclipsePackageImpl()
  {
    super(eNS_URI, CcsEclipseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CcsEclipsePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CcsEclipsePackage init()
  {
    if (isInited) return (CcsEclipsePackage)EPackage.Registry.INSTANCE.getEPackage(CcsEclipsePackage.eNS_URI);

    // Obtain or create and register package
    CcsEclipsePackageImpl theCcsEclipsePackage = (CcsEclipsePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CcsEclipsePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CcsEclipsePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCcsEclipsePackage.createPackageContents();

    // Initialize created meta-data
    theCcsEclipsePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCcsEclipsePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CcsEclipsePackage.eNS_URI, theCcsEclipsePackage);
    return theCcsEclipsePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleSet()
  {
    return ruleSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Context()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleSet_Rules()
  {
    return (EAttribute)ruleSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContext_Selector()
  {
    return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CcsEclipseFactory getCcsEclipseFactory()
  {
    return (CcsEclipseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ruleSetEClass = createEClass(RULE_SET);
    createEReference(ruleSetEClass, RULE_SET__CONTEXT);
    createEAttribute(ruleSetEClass, RULE_SET__RULES);

    contextEClass = createEClass(CONTEXT);
    createEAttribute(contextEClass, CONTEXT__SELECTOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleSet_Context(), this.getContext(), null, "context", null, 0, 1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleSet_Rules(), ecorePackage.getEString(), "rules", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContext_Selector(), ecorePackage.getEString(), "selector", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CcsEclipsePackageImpl
