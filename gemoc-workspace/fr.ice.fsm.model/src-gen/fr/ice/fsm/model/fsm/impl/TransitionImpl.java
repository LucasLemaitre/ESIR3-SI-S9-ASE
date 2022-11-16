/**
 */
package fr.ice.fsm.model.fsm.impl;

import fr.ice.fsm.model.fsm.FsmPackage;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.TransitionImpl#getInput_text <em>Input text</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.TransitionImpl#getStart_state <em>Start state</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.impl.TransitionImpl#getEnd_state <em>End state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The default value of the '{@link #getInput_text() <em>Input text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_text()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_text() <em>Input text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_text()
	 * @generated
	 * @ordered
	 */
	protected String input_text = INPUT_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStart_state() <em>Start state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_state()
	 * @generated
	 * @ordered
	 */
	protected State start_state;

	/**
	 * The cached value of the '{@link #getEnd_state() <em>End state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_state()
	 * @generated
	 * @ordered
	 */
	protected State end_state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_text() {
		return input_text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_text(String newInput_text) {
		String oldInput_text = input_text;
		input_text = newInput_text;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__INPUT_TEXT, oldInput_text,
					input_text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStart_state() {
		if (start_state != null && start_state.eIsProxy()) {
			InternalEObject oldStart_state = (InternalEObject) start_state;
			start_state = (State) eResolveProxy(oldStart_state);
			if (start_state != oldStart_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__START_STATE,
							oldStart_state, start_state));
			}
		}
		return start_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStart_state() {
		return start_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_state(State newStart_state) {
		State oldStart_state = start_state;
		start_state = newStart_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__START_STATE, oldStart_state,
					start_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEnd_state() {
		if (end_state != null && end_state.eIsProxy()) {
			InternalEObject oldEnd_state = (InternalEObject) end_state;
			end_state = (State) eResolveProxy(oldEnd_state);
			if (end_state != oldEnd_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__END_STATE,
							oldEnd_state, end_state));
			}
		}
		return end_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEnd_state() {
		return end_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_state(State newEnd_state) {
		State oldEnd_state = end_state;
		end_state = newEnd_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__END_STATE, oldEnd_state,
					end_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FsmPackage.TRANSITION__NAME:
			return getName();
		case FsmPackage.TRANSITION__INPUT_TEXT:
			return getInput_text();
		case FsmPackage.TRANSITION__START_STATE:
			if (resolve)
				return getStart_state();
			return basicGetStart_state();
		case FsmPackage.TRANSITION__END_STATE:
			if (resolve)
				return getEnd_state();
			return basicGetEnd_state();
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
		case FsmPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case FsmPackage.TRANSITION__INPUT_TEXT:
			setInput_text((String) newValue);
			return;
		case FsmPackage.TRANSITION__START_STATE:
			setStart_state((State) newValue);
			return;
		case FsmPackage.TRANSITION__END_STATE:
			setEnd_state((State) newValue);
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
		case FsmPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FsmPackage.TRANSITION__INPUT_TEXT:
			setInput_text(INPUT_TEXT_EDEFAULT);
			return;
		case FsmPackage.TRANSITION__START_STATE:
			setStart_state((State) null);
			return;
		case FsmPackage.TRANSITION__END_STATE:
			setEnd_state((State) null);
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
		case FsmPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FsmPackage.TRANSITION__INPUT_TEXT:
			return INPUT_TEXT_EDEFAULT == null ? input_text != null : !INPUT_TEXT_EDEFAULT.equals(input_text);
		case FsmPackage.TRANSITION__START_STATE:
			return start_state != null;
		case FsmPackage.TRANSITION__END_STATE:
			return end_state != null;
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
		result.append(", input_text: ");
		result.append(input_text);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
