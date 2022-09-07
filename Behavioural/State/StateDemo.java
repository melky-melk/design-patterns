interface State{
	void writeName(StateContext context, String name);
}

class LowerCaseState implements State{
	@Override
	public void writeName(StateContext context, String name){
		System.out.println(name.toLowerCase());
		context.setState(new MultipleUpperCaseState());
	}
}

class MultipleUpperCaseState implements State{
	private int count = 0;

	@Override
	public void writeName(StateContext context, String name){
		System.out.println(name.toUpperCase());

		if (++count > 1){
			context.setState(new LowerCaseState());
		}
	}
}

class StateContext{
	private String state;

	public StateContext(){
		state = new LowerCaseState();
	}

	void SetState(State newState){
		this.state = newState;
	}

	public void writeName(String name){
		state.writeName(this, name);
	}
}

public class StateDemo{
	public static void main(String[] args){
		var context = new StateContext();

		context.writeName("Monday");
		context.writeName("Tuesday");
		context.writeName("Wednesday");
	}
}