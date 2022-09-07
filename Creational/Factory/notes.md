Factory Method Pattern
– Purpose/Intent 
	– Define an interface for creating an object
	– Let subclasses decide which class to instantiate. 
	– Let a class defer instantiation to subclasses

Applicability 
	– A class cannot anticipate the class objects it must create
	– A class wants its subclasses to specify the objects it creates 
	– Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate 
– Benefits
	– Flexibility: subclasses get a hook for providing an extension to an object; connects parallel class hierarchies 
– Limitations
	– Can require subclassing just to get an implementation

the main purpose is to avoid constantly checking a certain condition when making an object to decide which object to make. Instead the factory will handle all of the checking logic and just return what is needed by the user.

Its to seperate the logic more as well