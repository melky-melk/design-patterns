interface Originator {
	public Memento createSnapshot();
}

class PoolTableMemento implements Memento{
	// the memento only needs to remember the balls and the position of the balls
	private PoolTable table;
	private List<BallMemento> balls;
	private int score;
	private int time;

	public PoolTableMemento(PoolTable table, List<BallMemento> prototypes){
		this.table = table;
		this.balls = prototypes;
		this.score = table.getScore();
		this.time = PoolTimer.getInstance().getSecondsPassed();
	}	

	/*
	 * Changes the values inside the table using the previous save
	 */
	public void restore(){
		for (BallMemento memento : balls){
			memento.restore();
		}

		table.setScore(this.score);
		PoolTimer.getInstance().setSecondsPassed(time);
	}
}

class MementoCaretaker {
	public ArrayList<Memento> previousState = new ArrayList<>();

	/** goes through the lists of previous saves and restores them, also removes that from the list */
	public void restore(){
		if (previousState.size() == 0){
			System.out.println("No more saves");
			return;
		}
		// restores the most recent previous state
		previousState.remove(previousState.size() - 1).restore();
	}

	/**adds the memento to the class */
	public void addMemento(Memento memento){
		previousState.add(memento);
	}
}

public class Pool {
	private MementoCaretaker caretaker;

	public static void main(String[] args){
		PoolTable pool = new PoolTable();
	}
}