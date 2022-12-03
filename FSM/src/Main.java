public class Main {
	
	public static void main(String[] args) {	

        State opened = new State("open door");
        State closed = new State("close door");
        Fsm door = new Fsm(closed);
        State broken = new State("broken door");
        Transition open = new Transition(closed, opened);
        closed.addTransition("on", open);
        Transition close = new Transition(opened, closed);
        opened.addTransition("off", close);
        Transition b1 = new Transition(opened, broken);
        opened.addTransition("warning", b1);
        Transition b2 = new Transition(closed, broken);
        closed.addTransition("warning", b2);
        door.start();
	}
}