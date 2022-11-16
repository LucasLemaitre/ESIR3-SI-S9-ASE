/**
 */
package fr.ice.fsm.model.fsm.impl;

import fr.ice.fsm.model.fsm.FsmPackage;
import fr.ice.fsm.model.fsm.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.StateImpl#getOutput_text <em>Output text</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.StateImpl#isInit_state <em>Init state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_text() <em>Output text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_text()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_text() <em>Output text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_text()
	 * @generated
	 * @ordered
	 */
	protected String output_text = OUTPUT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit_state() <em>Init state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit_state()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit_state() <em>Init state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit_state()
	 * @generated
	 * @ordered
	 */
	protected boolean init_state = INIT_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_text() {
		return output_text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_text(String newOutput_text) {
		String oldOutput_text = output_text;
		output_text = newOutput_text;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__OUTPUT_TEXT, oldOutput_text,
					output_text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit_state() {
		return init_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit_state(boolean newInit_state) {
		boolean oldInit_state = init_state;
		init_state = newInit_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__INIT_STATE, oldInit_state,
					init_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FsmPackage.STATE__NAME:
			return getName();
		case FsmPackage.STATE__OUTPUT_TEXT:
			return getOutput_text();
		case FsmPackage.STATE__INIT_STATE:
			return isInit_state();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FsmPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case FsmPackage.STATE__OUTPUT_TEXT:
			setOutput_text((String) newValue);
			return;
		case FsmPackage.STATE__INIT_STATE:
			setInit_state((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case FsmPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FsmPackage.STATE__OUTPUT_TEXT:
			setOutput_text(OUTPUT_TEXT_EDEFAULT);
			return;
		case FsmPackage.STATE__INIT_STATE:
			setInit_state(INIT_STATE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FsmPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FsmPackage.STATE__OUTPUT_TEXT:
			return OUTPUT_TEXT_EDEFAULT == null ? output_text != null : !OUTPUT_TEXT_EDEFAULT.equals(output_text);
		case FsmPackage.STATE__INIT_STATE:
			return init_state != INIT_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", output_text: ");
		result.append(output_text);
		result.append(", init_state: ");
		result.append(init_state);
		result.append(')');
		return result.toString();
	}

} //StateImpl
