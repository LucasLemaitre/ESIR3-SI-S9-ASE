/**
 */
package fr.ice.fsm.model.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.fsm.Transition#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.Transition#getInput_text <em>Input text</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.Transition#getStart_state <em>Start state</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.Transition#getEnd_state <em>End state</em>}</li>
 * </ul>
 *
 * @see fr.ice.fsm.model.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input text</em>' attribute.
	 * @see #setInput_text(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getTransition_Input_text()
	 * @model
	 * @generated
	 */
	String getInput_text();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.Transition#getInput_text <em>Input text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input text</em>' attribute.
	 * @see #getInput_text()
	 * @generated
	 */
	void setInput_text(String value);

	/**
	 * Returns the value of the '<em><b>Start state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start state</em>' reference.
	 * @see #setStart_state(State)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getTransition_Start_state()
	 * @model required="true"
	 * @generated
	 */
	State getStart_state();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.Transition#getStart_state <em>Start state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start state</em>' reference.
	 * @see #getStart_state()
	 * @generated
	 */
	void setStart_state(State value);

	/**
	 * Returns the value of the '<em><b>End state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End state</em>' reference.
	 * @see #setEnd_state(State)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getTransition_End_state()
	 * @model required="true"
	 * @generated
	 */
	State getEnd_state();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.Transition#getEnd_state <em>End state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End state</em>' reference.
	 * @see #getEnd_state()
	 * @generated
	 */
	void setEnd_state(State value);

} // Transition
