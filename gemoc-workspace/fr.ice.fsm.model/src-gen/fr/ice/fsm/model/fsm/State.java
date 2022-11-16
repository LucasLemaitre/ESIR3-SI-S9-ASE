/**
 */
package fr.ice.fsm.model.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.State#getOutput_text <em>Output text</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.State#isInit_state <em>Init state</em>}</li>
 * </ul>
 *
 * @see fr.ice.fsm.model.fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Output text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output text</em>' attribute.
	 * @see #setOutput_text(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_Output_text()
	 * @model
	 * @generated
	 */
	String getOutput_text();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#getOutput_text <em>Output text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output text</em>' attribute.
	 * @see #getOutput_text()
	 * @generated
	 */
	void setOutput_text(String value);

	/**
	 * Returns the value of the '<em><b>Init state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init state</em>' attribute.
	 * @see #setInit_state(boolean)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_Init_state()
	 * @model
	 * @generated
	 */
	boolean isInit_state();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#isInit_state <em>Init state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init state</em>' attribute.
	 * @see #isInit_state()
	 * @generated
	 */
	void setInit_state(boolean value);

} // State
