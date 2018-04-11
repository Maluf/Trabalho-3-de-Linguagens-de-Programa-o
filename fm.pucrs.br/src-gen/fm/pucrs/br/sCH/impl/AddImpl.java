/**
 * generated by Xtext 2.12.0
 */
package fm.pucrs.br.sCH.impl;

import fm.pucrs.br.sCH.Add;
import fm.pucrs.br.sCH.SCHPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fm.pucrs.br.sCH.impl.AddImpl#getPlus <em>Plus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddImpl extends OperatorImpl implements Add
{
  /**
   * The default value of the '{@link #getPlus() <em>Plus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlus()
   * @generated
   * @ordered
   */
  protected static final String PLUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlus() <em>Plus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlus()
   * @generated
   * @ordered
   */
  protected String plus = PLUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddImpl()
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
    return SCHPackage.Literals.ADD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlus()
  {
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlus(String newPlus)
  {
    String oldPlus = plus;
    plus = newPlus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCHPackage.ADD__PLUS, oldPlus, plus));
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
      case SCHPackage.ADD__PLUS:
        return getPlus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SCHPackage.ADD__PLUS:
        setPlus((String)newValue);
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
      case SCHPackage.ADD__PLUS:
        setPlus(PLUS_EDEFAULT);
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
      case SCHPackage.ADD__PLUS:
        return PLUS_EDEFAULT == null ? plus != null : !PLUS_EDEFAULT.equals(plus);
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
    result.append(" (plus: ");
    result.append(plus);
    result.append(')');
    return result.toString();
  }

} //AddImpl
