// subsystem
// These are some of the classes of a complex resturant framework. 
// We don't control that code, therefore can't simplify it.
public class Waiter{
	createOrder();
	serveFood();
	takeBill(); 
}

public class Cooker{
// ...}

public class Order{
// ...}

public class Food{
// ...}

public class Dishes{
// ...}

// Facade
public class ResturantFacade{ 
	// it holds all of things inside
	private Waiter waiter; 
	private Order order; 
	private Cooker cooker; 
	//...
    
	public ResturantFacade(){};
	
	// calls all of the other functions inside, hiding all of the back end code
    public void orderFood() {
        System.out.println("A series of interdependent calls on various subsystems"); 
        waiter.writeOrder();
        waiter.sendToKitchen();
        order.prepareFood();
		food.cook();
        waiter.serveCustomer();
        kitchen.washDishes();
		dishes.clean();
    }
}

// Client
public class Main{

	public static void main(String[] args) { 
		ResturantFacade facade = new ResturantFacade();  
		facade.orderFood();
	}
}