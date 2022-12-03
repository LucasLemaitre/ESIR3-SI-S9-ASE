package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import java.util.Map;

@SuppressWarnings("all")
public class TransitionAspectInterpretorTransitionAspectContext {
  public static final TransitionAspectInterpretorTransitionAspectContext INSTANCE = new TransitionAspectInterpretorTransitionAspectContext();
  
  public static TransitionAspectInterpretorTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.example.mydsl.generator.TransitionAspectInterpretorTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectInterpretorTransitionAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.fsm.Transition, org.xtext.example.mydsl.generator.TransitionAspectInterpretorTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectInterpretorTransitionAspectProperties> getMap() {
    return map;
  }
}
