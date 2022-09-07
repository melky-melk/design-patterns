// a common interface/abstract class/concrete class that these classes must share
interface Shape{
	public void draw();
}

class Circle implements Shape{
	public void draw()	{System.out.println("I am drawing a circle");};
}

class Rectangle implements Shape{
	public void draw()	{System.out.println("I am drawing a rectangle");};
}

public class ShapeCreator {
	// the creator would take a string that the creator would need to create
	// it would return the common interface, but with the shape specified in the string  
	public Shape create(String type){
		Shape shape = null;
		switch (type){
			case "circle":
				shape = new Circle();
				break;
			case "rectangle":
				shape = new Rectangle();
				break;
		}
		
		return shape;
	}

	public static void main(String[] args){
		ShapeCreator creator = new ShapeCreator();
		Shape shape = creator.create("circle");
		shape.draw();
	}
}