package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import java.util.Map;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public static final TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.example.mydsl.generator.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.fsm.Transition, org.xtext.example.mydsl.generator.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
