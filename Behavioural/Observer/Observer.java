interface Observer {
    void update();
}

public class ObserverImpl implements Observer {
    private final Subject subject;
    private final String name;
    private double speed;
    private int fuel;
    private int occupancy;

    public ObserverImpl(Subject subject) {
        this.subject = subject;
        this.name = subject.getName();
        this.speed = subject.getSpeed();
        this.fuel = subject.getFuel();
        this.occupancy = subject.getOccupancy();
    }

    @Override
    public void update() {
        this.speed = subject.getSpeed();
        this.fuel = subject.getFuel();
        this.occupancy = subject.getOccupancy();
    }

    public String getName() { return this.name; }
    public double getSpeed() { return this.speed; }
    public int getFuel() { return this.fuel; }
    public int getOccupancy() { return this.occupancy; }
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

public class Vehicle implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;

    private Random r = new Random();
    private double speed = 220 * r.nextDouble();;
    private int fuel = r.nextInt(100);
    private int occupancy = r.nextInt((5 - 1) + 1) + 1;

    public Vehicle(String name) { this.name = name; }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) 
            observer.update();
    }

    public void updateVehicleStatus() {
        speed = 220 * r.nextDouble();;
        fuel = r.nextInt(100);
        occupancy = r.nextInt((5 - 1) + 1) + 1;
        notifyObservers();
    }

    public String getName() { return this.name; }
    public double getSpeed() { return this.speed; }
    public int getFuel() { return this.fuel; }
    public int getOccupancy() { return this.occupancy; }
}

public class Main{
	public static void main(String[] args) throws InterruptedException {

        List<Vehicle> vehicles = new ArrayList<>();
        List<Observer> observers = new ArrayList<>();

        for (int i = 0; i < N_VEHICLES; i++) {
            Vehicle vehicle = new Vehicle(String.format("BOT %d", i));
            vehicles.add(vehicle);
            Observer observer = new ObserverImpl(vehicle);
            observers.add(observer);

            vehicle.attach(observer);
        }

        // Every 1 second, print the stats of the vehicle
        // Every 5 seconds, randomise the stats of the vehicle
        while (true) {
            Thread.sleep(1000);
            tick++;
            if(tick % 5 == 0) {
                vehicles.forEach((vehicle) -> vehicle.updateVehicleStatus());
            }
            observers.forEach((observer) -> displayObserver(observer));
        }
    }
}