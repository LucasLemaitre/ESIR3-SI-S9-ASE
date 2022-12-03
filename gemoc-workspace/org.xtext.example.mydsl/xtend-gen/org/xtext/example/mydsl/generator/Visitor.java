package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class Visitor {
  private String indent = "        ";
  
  public void visitFSM(final FSM f, final StringBuilder builder) {
    String name = f.getName();
    EList<State> states = f.getStates();
    EList<Transition> transitions = f.getTransitions();
    for (final State s : states) {
      this.accept(s, this, builder, name);
    }
    for (final Transition t : transitions) {
      this.accept(t, this, builder);
    }
    builder.append(((("\r\n" + this.indent) + name) + ".start();"));
  }
  
  public void accept(final State s, final Visitor v, final StringBuilder sb, final String fsmName) {
    v.visitState(s, sb, fsmName);
  }
  
  public void accept(final Transition t, final Visitor v, final StringBuilder sb) {
    v.visitTransition(t, sb);
  }
  
  public void visitState(final State s, final StringBuilder sb, final String fsmName) {
    String name = s.getName();
    String output = s.getOutput_text();
    boolean isInit = s.isInit_state();
    sb.append((((((("\r\n" + this.indent) + "State ") + name) + " = new State(\"") + output) + "\");"));
    if (isInit) {
      sb.append((((((("\r\n" + this.indent) + "Fsm ") + fsmName) + " = new Fsm(") + name) + ");"));
    }
  }
  
  public void visitTransition(final Transition t, final StringBuilder sb) {
    String name = t.getName();
    String input = t.getInput_text();
    String startState = t.getStart_state().getName();
    String endState = t.getEnd_state().getName();
    sb.append((((((((("\r\n" + this.indent) + "Transition ") + name) + " = new Transition(") + startState) + ", ") + endState) + ");"));
    sb.append(((((((("\r\n" + this.indent) + startState) + ".addTransition(\"") + input) + "\", ") + name) + ");"));
  }
}
