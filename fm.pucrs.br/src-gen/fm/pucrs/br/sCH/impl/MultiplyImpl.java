/**
 * generated by Xtext 2.12.0
 */
package fm.pucrs.br.sCH.impl;

import fm.pucrs.br.sCH.Multiply;
import fm.pucrs.br.sCH.SCHPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fm.pucrs.br.sCH.impl.MultiplyImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplyImpl extends OperatorImpl implements Multiply
{
  /**
   * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected static final String TIMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected String times = TIMES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplyImpl()
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
    return SCHPackage.Literals.MULTIPLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimes(String newTimes)
  {
    String oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCHPackage.MULTIPLY__TIMES, oldTimes, times));
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
      case SCHPackage.MULTIPLY__TIMES:
        return getTimes();
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
      case SCHPackage.MULTIPLY__TIMES:
        setTimes((String)newValue);
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
      case SCHPackage.MULTIPLY__TIMES:
        setTimes(TIMES_EDEFAULT);
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
      case SCHPackage.MULTIPLY__TIMES:
        return TIMES_EDEFAULT == null ? times != null : !TIMES_EDEFAULT.equals(times);
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
    result.append(" (times: ");
    result.append(times);
    result.append(')');
    return result.toString();
  }

} //MultiplyImpl
