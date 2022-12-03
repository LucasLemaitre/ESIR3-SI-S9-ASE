import java.util.Scanner;

public class Fsm {

	private State state;
	
	public Fsm(State initState) {
		this.state = initState;	
	}
	
	public void enterAction(String a) {
		Transition t = this.state.useTransition(a);
		if(null != t) {
			this.state = t.getEnd_state();
			System.out.println(t.getEnd_state().getOutput());
		} else {
			System.out.println("Action non-reconnue.");
		}
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		String action = "";
		System.out.println(this.state.getOutput());
		System.out.println("Entrer une action : ");
        action = scanner.nextLine();

		while(action.compareTo("stopPgr") != 0) {
	        enterAction(action);
	        System.out.println("Entrer une action : ");
	        action = scanner.nextLine();
		}
		
		System.out.println("Arrêt du programme.");
		scanner.close();
	}
	
	
}
