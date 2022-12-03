package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspectInterpretor {
  @Step
  public static void fire(final Transition _self) {
    final org.xtext.example.mydsl.generator.TransitionAspectInterpretorTransitionAspectProperties _self_ = org.xtext.example.mydsl.generator.TransitionAspectInterpretorTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fire()
    if (_self instanceof fr.ice.fsm.model.fsm.Transition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.xtext.example.mydsl.generator.TransitionAspectInterpretor._privk3_fire(_self_, (fr.ice.fsm.model.fsm.Transition)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Transition", "fire");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_fire(final TransitionAspectInterpretorTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    String _name_1 = _self.getEnd_state().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
  }
}
