Prototype 
	- Declares an interface for cloning itself 
ConcretePrototype 
	- Implements an operation for cloning itself. 
- Client 
	- Creates a new object by asking a prototype to clone itself
	- The actual thing that uses the prototype

Making a deep copy, by using the function clone, and implementing an interface, Prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

Say you have an object, and you want to create an exact copy of it. How would you do it? First, you have to create a new object of the same class. Then you have to go through all the fields of the original object and copy their values over to the new object.

How to make a duplicate of an object that contains all of the information, without making all of the attributes public

You do it inside of the class. The class itself will duplicate itself. way of making deep copies 