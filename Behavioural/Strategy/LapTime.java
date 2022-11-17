interface Display{
	public double getTime();
}

class DisplayContext{
	private Display context;

	public DisplayContext(Display context){
		this.context = context;
	}

	public double getTime(){
		return this.context.getTime();
	}
}

class FastestLapTime implements Display{
	public double getTime(){
		return 1.00;
	}
}

class FastestRaceTime implements Display{
	public double getTime(){
		return 0.01;
	}
}

class SlowestRaceTime implements Display{
	public double getTime(){
		return 5.0;
	}
}

public class LapTime{
	public static void main(String[] args){
		// first creates a sale pricing, with the specific kind of sale pricing afterwards
		Display type = new FastestRaceTime();

		// then making the context using the specific salePricing set
		DisplayContext context = new DisplayContext(type);

		// this will use the normal sale pricing
		double total = context.getTime();
		System.out.println("The time is " + total);
	}
}