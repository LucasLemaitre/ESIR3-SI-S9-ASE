
public class Transition {
	
	private State start_state;
	private State end_state;
	
	public Transition(State s_state, State e_state) {
		this.start_state = s_state;
		this.end_state = e_state;
	}

	public State getStart_state() {
		return start_state;
	}

	public State getEnd_state() {
		return end_state;
	}
}
