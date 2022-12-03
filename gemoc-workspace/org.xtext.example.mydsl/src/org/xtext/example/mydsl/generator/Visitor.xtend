package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.FSM
import fr.ice.fsm.model.fsm.State
import fr.ice.fsm.model.fsm.Transition

class Visitor {
	
	var indent = "        ";
	
	def void visitFSM(FSM f, StringBuilder builder){
		var name = f.getName();
		var states = f.getStates();
		var transitions = f.getTransitions();
		
		for (s : states) {
			s.accept(this, builder, name);
		}
		
		for (t : transitions) {
			t.accept(this, builder);
		}
		
		builder.append("\r\n" + indent + name + ".start();");
	}
	
	def void accept(State s, Visitor v, StringBuilder sb, String fsmName){
		v.visitState(s, sb, fsmName);
	}
	
	def void accept(Transition t, Visitor v, StringBuilder sb){
		v.visitTransition(t, sb);
	}
	
	def void visitState(State s, StringBuilder sb, String fsmName){
		var name = s.getName();
		var output = s.getOutput_text();
		var isInit = s.isInit_state();
		
		sb.append("\r\n" + indent + "State " + name + ' = new State("' + output + '");');
		if(isInit) {
			sb.append("\r\n" + indent + "Fsm " + fsmName + " = new Fsm("+ name + ");");
		}
	}
	
	def void visitTransition(Transition t, StringBuilder sb){
		var name = t.getName();
		var input = t.getInput_text();
		var startState = t.getStart_state().getName();
		var endState = t.getEnd_state().getName();
		
		sb.append("\r\n" + indent + "Transition " + name + ' = new Transition(' + startState + ', ' + endState + ');');
		sb.append("\r\n" + indent + startState + '.addTransition("' + input + '", ' + name + ');');
	}
}