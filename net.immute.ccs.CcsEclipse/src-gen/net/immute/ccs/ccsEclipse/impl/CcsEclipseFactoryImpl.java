/**
 */
package net.immute.ccs.ccsEclipse.impl;

import net.immute.ccs.ccsEclipse.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CcsEclipseFactoryImpl extends EFactoryImpl implements CcsEclipseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CcsEclipseFactory init()
  {
    try
    {
      CcsEclipseFactory theCcsEclipseFactory = (CcsEclipseFactory)EPackage.Registry.INSTANCE.getEFactory(CcsEclipsePackage.eNS_URI);
      if (theCcsEclipseFactory != null)
      {
        return theCcsEclipseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CcsEclipseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CcsEclipseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CcsEclipsePackage.RULE_SET: return createRuleSet();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet createRuleSet()
  {
    RuleSetImpl ruleSet = new RuleSetImpl();
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CcsEclipsePackage getCcsEclipsePackage()
  {
    return (CcsEclipsePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CcsEclipsePackage getPackage()
  {
    return CcsEclipsePackage.eINSTANCE;
  }

} //CcsEclipseFactoryImpl
