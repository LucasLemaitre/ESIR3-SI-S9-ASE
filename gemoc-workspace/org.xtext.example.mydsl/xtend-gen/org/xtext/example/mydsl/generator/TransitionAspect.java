package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void accept(final Transition _self, final Visitor v, final StringBuilder sb) {
    final org.xtext.example.mydsl.generator.TransitionAspectTransitionAspectProperties _self_ = org.xtext.example.mydsl.generator.TransitionAspectTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void accept(Visitor,StringBuilder)
    if (_self instanceof fr.ice.fsm.model.fsm.Transition){
    	org.xtext.example.mydsl.generator.TransitionAspect._privk3_accept(_self_, (fr.ice.fsm.model.fsm.Transition)_self,v,sb);
    };
  }
  
  protected static void _privk3_accept(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Visitor v, final StringBuilder sb) {
    v.visitTransition(_self, sb);
  }
}
