package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.State;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void accept(final State _self, final Visitor v, final StringBuilder sb, final String fsmName) {
    final org.xtext.example.mydsl.generator.StateAspectStateAspectProperties _self_ = org.xtext.example.mydsl.generator.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void accept(Visitor,StringBuilder,String)
    if (_self instanceof fr.ice.fsm.model.fsm.State){
    	org.xtext.example.mydsl.generator.StateAspect._privk3_accept(_self_, (fr.ice.fsm.model.fsm.State)_self,v,sb,fsmName);
    };
  }
  
  protected static void _privk3_accept(final StateAspectStateAspectProperties _self_, final State _self, final Visitor v, final StringBuilder sb, final String fsmName) {
    v.visitState(_self, sb, fsmName);
  }
}
