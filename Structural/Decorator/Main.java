// Componenet Interface
// The interface Coffee defines the functionality of Coffee implemented by decorator
interface Coffee {
    public double getCost(); // Returns the cost of the coffee
    public String getIngredients(); // Returns the ingredients of the coffee
}

// Decorator
// Abstract decorator class - note that it implements Coffee interface. This holds the content of the wrapper. Then future implementations will extend this
// the decorator contains the actual item inside of it, but extends it further
// its kind of like a middle ground for extention
abstract class CoffeeDecorator implements Coffee {
    private final Coffee c;

    public CoffeeDecorator(Coffee c) {
        this.c = c;
    }

    @Override
    public double getCost() { // Implementing methods of the interface
        return c.getCost();
    }

    @Override
    public String getIngredients() {
        return c.getIngredients();
    }
}

// ConcreteDecorator
// Decorator WithExtraShot added extra shot to coffee
class WithExtraShot extends CoffeeDecorator {
    public WithExtraShot(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", One Extra Shot";
    }
}

// ConcreteDecorator
// Decorator WithMilk mixes milk into coffee.
class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}

// ConcreteComponent
// Extension of a simple coffee without any extra ingredients
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}

// Client - sample usage 
public class Main {
    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        printInfo(c);

        c = new WithMilk(c);
        printInfo(c);

        c = new WithExtraShot(c);
        printInfo(c);
		
		Coffee c1 = new WithExtraShot(new WithMilk(new SimpleCoffee()));
		Coffee c2 = new WithMilk(new SimpleCoffee());
		
    }
}