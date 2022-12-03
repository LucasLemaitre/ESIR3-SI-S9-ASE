package org.xtext.example.mydsl.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.ice.fsm.model.fsm.State

@Aspect(className=State)
class StateAspect {
	def void accept(Visitor v, StringBuilder sb, String fsmName){
		v.visitState(_self, sb, fsmName);
	}
}