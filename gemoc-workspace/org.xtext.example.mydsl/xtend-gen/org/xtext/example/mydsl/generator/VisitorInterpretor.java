package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.ice.fsm.model.fsm.State;
import fr.ice.fsm.model.fsm.Transition;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class VisitorInterpretor {
  private Map<State, Map<String, State>> dict = new HashMap<State, Map<String, State>>();
  
  public void visitFSM(final FSM f) {
    EList<Transition> transitions = f.getTransitions();
    for (final Transition t : transitions) {
      {
        Map<String, State> map = new HashMap<String, State>();
        map.put(t.getInput_text(), t.getEnd_state());
        this.dict.put(t.getStart_state(), map);
      }
    }
  }
  
  public void accept(final State s, final Visitor v, final StringBuilder sb, final String fsmName) {
    v.visitState(s, sb, fsmName);
  }
  
  public void accept(final Transition t, final Visitor v, final StringBuilder sb) {
    v.visitTransition(t, sb);
  }
  
  public void visitState(final State s, final StringBuilder sb, final String fsmName) {
  }
  
  public void visitTransition(final Transition t, final StringBuilder sb) {
  }
}
