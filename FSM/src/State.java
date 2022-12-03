import java.util.HashMap;
import java.util.Map;

public class State {
	
	private String output;
	private Map<String, Transition> transitions;
	
	public State(String o) {
		this.output = o;
		this.transitions = new HashMap<String, Transition>();
	}
	
	public Transition useTransition(String input) {
		for (Map.Entry<String, Transition> entry : transitions.entrySet()) {
			if(input.compareTo(entry.getKey()) == 0) {
				return entry.getValue();
			}
	    }
		return null;
	}
	
	public void addTransition(String action, Transition t) {
		this.transitions.put(action, t);
	}

	public String getOutput() {
		return output;
	}

	public Map<String, Transition> getTransitions() {
		return transitions;
	}
}
