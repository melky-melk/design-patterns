package PoolGame;
import java.util.TimerTask;
import java.util.Timer;

public class PoolTimer extends TimerTask{
	// singleton functionality
	private static PoolTimer singleton = null;

	// actual attributes inside the poolTimer
	private int secondsPassed = 0;
	private Timer timer;
	
	public PoolTimer(Timer timer){
		this.timer = timer;
	}

	/*
	 * returns the only instance of poolTimer. if the pooltimer has not been instanciated yet, then it will create a new one. If it has already been created, then return the existing instance
	 */
	public static PoolTimer getInstance() {
		if(singleton == null) {
			Timer timer = new Timer();
			singleton = new PoolTimer(timer);
			//makes the poolTimer increases 1 seconds every time
			timer.scheduleAtFixedRate(singleton, 0, 1000);
		}
		return singleton;
	}

	/**every second the timer is incremented upwards and is displayed on the screen**/
	public void run() {
		this.secondsPassed++;
	}

	public int getSecondsPassed() {return this.secondsPassed;}
	public void setSecondsPassed(int seconds) {this.secondsPassed = seconds;}
	
	/*
	 * pauses the timer to ensure there isnt a freezing when the program tries to exit
	 */
	public static void cancelAll(){
		singleton.timer.cancel();
		singleton.cancel();
	}
}
