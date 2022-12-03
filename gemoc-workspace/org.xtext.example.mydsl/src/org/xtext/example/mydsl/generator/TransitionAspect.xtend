package org.xtext.example.mydsl.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.ice.fsm.model.fsm.Transition

@Aspect(className=Transition)
class TransitionAspect {
	def void accept(Visitor v, StringBuilder sb){
		v.visitTransition(_self, sb);
	}
}