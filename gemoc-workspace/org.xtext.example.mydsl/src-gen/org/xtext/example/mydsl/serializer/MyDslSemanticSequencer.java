/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.FsmPackage;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FsmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FsmPackage.FSM:
				sequence_FSM(context, (FSM) semanticObject); 
				return; 
			case FsmPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case FsmPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FSM returns FSM
	 *
	 * Constraint:
	 *     (name=EString transitions+=Transition* states+=State (states+=State | transitions+=Transition)*)
	 */
	protected void sequence_FSM(ISerializationContext context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (init_state?='init'? name=EString output_text=EString)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=EString start_state=[State|EString] end_state=[State|EString] input_text=EString)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FsmPackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FsmPackage.Literals.TRANSITION__NAME));
			if (transientValues.isValueTransient(semanticObject, FsmPackage.Literals.TRANSITION__START_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FsmPackage.Literals.TRANSITION__START_STATE));
			if (transientValues.isValueTransient(semanticObject, FsmPackage.Literals.TRANSITION__END_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FsmPackage.Literals.TRANSITION__END_STATE));
			if (transientValues.isValueTransient(semanticObject, FsmPackage.Literals.TRANSITION__INPUT_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FsmPackage.Literals.TRANSITION__INPUT_TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getStart_stateStateEStringParserRuleCall_2_0_1(), semanticObject.eGet(FsmPackage.Literals.TRANSITION__START_STATE, false));
		feeder.accept(grammarAccess.getTransitionAccess().getEnd_stateStateEStringParserRuleCall_4_0_1(), semanticObject.eGet(FsmPackage.Literals.TRANSITION__END_STATE, false));
		feeder.accept(grammarAccess.getTransitionAccess().getInput_textEStringParserRuleCall_6_0(), semanticObject.getInput_text());
		feeder.finish();
	}
	
	
}
