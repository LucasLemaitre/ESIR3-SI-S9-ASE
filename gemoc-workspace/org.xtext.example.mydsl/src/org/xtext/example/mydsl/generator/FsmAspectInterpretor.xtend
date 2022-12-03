package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.State
import java.util.Map
import java.util.HashMap
import fr.ice.fsm.model.fsm.FSM
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Scanner
import fr.ice.fsm.model.fsm.Transition

class FsmAspectInterpretor {
	
	public State currentState;
	
	// Dictionnaire associant les clés entrés utilisateur à leur transition
	public Map<String, Transition> dict = new HashMap<String, Transition>();
	
	def void run(FSM f){
		
		var transitions = f.transitions;
		var states = f.states;
		
		for (s : states) {
			if(s.init_state){
				currentState = s;
			}
		}
		
		for (t : transitions) {
			dict.put(t.getInput_text(), t);
		}
		
		var scanner = new Scanner(System.in);
		var action = "";
		println(currentState.output_text);
		println("Entrer une action : ");
        action = scanner.nextLine();

		while(action.compareTo("stopPgr") != 0) {
	        step(action);
	        println("Entrer une action : ");
	        action = scanner.nextLine();
		}
		
		println("Arrêt du programme.");
		scanner.close();
	}
	
	@Step
	def void step(String inputString) {
		
		val validTransition = dict.get(inputString);
		
		if(null === validTransition){
			println("Action non-valide pour cet état.");
			return;
		} else if(validTransition.start_state === currentState) {
			validTransition.fire();
		} else {
			println("Action non-reconnue.");
			return;
		}
	}
	
	@Step
	def void fire(Transition t){
		println("Firing " + t.name + " and entering " + t.end_state.name);
		currentState = t.end_state;
		println(t.end_state.output_text);
	}
	
	
}