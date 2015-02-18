/**
 */
package net.immute.ccs.ccsEclipse.impl;

import java.util.Collection;

import net.immute.ccs.ccsEclipse.CcsEclipsePackage;
import net.immute.ccs.ccsEclipse.Import;
import net.immute.ccs.ccsEclipse.Nested;
import net.immute.ccs.ccsEclipse.Property;
import net.immute.ccs.ccsEclipse.Rule;
import net.immute.ccs.ccsEclipse.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.immute.ccs.ccsEclipse.impl.NestedImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.impl.NestedImpl#getImport <em>Import</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.impl.NestedImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.impl.NestedImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.immute.ccs.ccsEclipse.impl.NestedImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedImpl extends MinimalEObjectImpl.Container implements Nested
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected Selector selector;

  /**
   * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport()
   * @generated
   * @ordered
   */
  protected Import import_;

  /**
   * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected String constraint = CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CcsEclipsePackage.Literals.NESTED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(Selector newSelector, NotificationChain msgs)
  {
    Selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(Selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__SELECTOR, newSelector, newSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getImport()
  {
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImport(Import newImport, NotificationChain msgs)
  {
    Import oldImport = import_;
    import_ = newImport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__IMPORT, oldImport, newImport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImport(Import newImport)
  {
    if (newImport != import_)
    {
      NotificationChain msgs = null;
      if (import_ != null)
        msgs = ((InternalEObject)import_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__IMPORT, null, msgs);
      if (newImport != null)
        msgs = ((InternalEObject)newImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__IMPORT, null, msgs);
      msgs = basicSetImport(newImport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__IMPORT, newImport, newImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(String newConstraint)
  {
    String oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcsEclipsePackage.NESTED__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CcsEclipsePackage.NESTED__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, CcsEclipsePackage.NESTED__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CcsEclipsePackage.NESTED__SELECTOR:
        return basicSetSelector(null, msgs);
      case CcsEclipsePackage.NESTED__IMPORT:
        return basicSetImport(null, msgs);
      case CcsEclipsePackage.NESTED__PROPERTY:
        return basicSetProperty(null, msgs);
      case CcsEclipsePackage.NESTED__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CcsEclipsePackage.NESTED__SELECTOR:
        return getSelector();
      case CcsEclipsePackage.NESTED__IMPORT:
        return getImport();
      case CcsEclipsePackage.NESTED__CONSTRAINT:
        return getConstraint();
      case CcsEclipsePackage.NESTED__PROPERTY:
        return getProperty();
      case CcsEclipsePackage.NESTED__RULES:
        return getRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CcsEclipsePackage.NESTED__SELECTOR:
        setSelector((Selector)newValue);
        return;
      case CcsEclipsePackage.NESTED__IMPORT:
        setImport((Import)newValue);
        return;
      case CcsEclipsePackage.NESTED__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case CcsEclipsePackage.NESTED__PROPERTY:
        setProperty((Property)newValue);
        return;
      case CcsEclipsePackage.NESTED__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CcsEclipsePackage.NESTED__SELECTOR:
        setSelector((Selector)null);
        return;
      case CcsEclipsePackage.NESTED__IMPORT:
        setImport((Import)null);
        return;
      case CcsEclipsePackage.NESTED__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case CcsEclipsePackage.NESTED__PROPERTY:
        setProperty((Property)null);
        return;
      case CcsEclipsePackage.NESTED__RULES:
        getRules().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CcsEclipsePackage.NESTED__SELECTOR:
        return selector != null;
      case CcsEclipsePackage.NESTED__IMPORT:
        return import_ != null;
      case CcsEclipsePackage.NESTED__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case CcsEclipsePackage.NESTED__PROPERTY:
        return property != null;
      case CcsEclipsePackage.NESTED__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (constraint: ");
    result.append(constraint);
    result.append(')');
    return result.toString();
  }

} //NestedImpl
