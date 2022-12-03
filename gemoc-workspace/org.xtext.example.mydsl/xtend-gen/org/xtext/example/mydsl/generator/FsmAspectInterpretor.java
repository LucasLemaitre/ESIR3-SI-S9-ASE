package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FsmAspectInterpretor {
  public State currentState;
  
  public Map<String, Transition> dict = new HashMap<String, Transition>();
  
  public void run(final FSM f) {
    EList<Transition> transitions = f.getTransitions();
    EList<State> states = f.getStates();
    for (final State s : states) {
      boolean _isInit_state = s.isInit_state();
      if (_isInit_state) {
        this.currentState = s;
      }
    }
    for (final Transition t : transitions) {
      this.dict.put(t.getInput_text(), t);
    }
    Scanner scanner = new Scanner(System.in);
    String action = "";
    InputOutput.<String>println(this.currentState.getOutput_text());
    InputOutput.<String>println("Entrer une action : ");
    action = scanner.nextLine();
    while ((action.compareTo("stopPgr") != 0)) {
      {
        this.step(action);
        InputOutput.<String>println("Entrer une action : ");
        action = scanner.nextLine();
      }
    }
    InputOutput.<String>println("Arrêt du programme.");
    scanner.close();
  }
  
  @Step
  public void step(final String inputString) {
    InputOutput.<Map<String, Transition>>println(this.dict);
    final Transition validTransition = this.dict.get(inputString);
    if ((null == validTransition)) {
      InputOutput.<String>println("Action non-valide pour cet état.");
      return;
    } else {
      State _start_state = validTransition.getStart_state();
      boolean _tripleEquals = (_start_state == this.currentState);
      if (_tripleEquals) {
        this.fire(validTransition);
      } else {
        InputOutput.<String>println("Action non-reconnue.");
        return;
      }
    }
  }
  
  @Step
  public void fire(final Transition t) {
    String _name = t.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    String _name_1 = t.getEnd_state().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    this.currentState = t.getEnd_state();
    InputOutput.<String>println(t.getEnd_state().getOutput_text());
  }
}
