Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

The observer must have attach() and detach() methods for the subscriptions

Main purpose is to eliminate many to many relationships, and instead establish a one-to-many relationship

Subject/Publisher (Interface)
- Knows its observers. Any number of observer objects may observe a subject. Provides an interface for attaching and detaching observer objects
- Is like the subscriber? interface that is implemented. It does the attaching and detaching for the observers
Observer/Subscriber (Interface)
- Defines an updating interface for objects that should be notified of changes in a subject
Concrete Subject/Publisher
- Stores state of interest to ConcreteObserver objects Sends notifications to its observers when its state changes
- Is the one that actually implements the subject
ConcreteObserver/Subscribe
- Maintains a reference to a ConcreteSubject object 
- Stores state that should stay consistent with the subject’s. 
- Implements the observer’s updating interface to keep its state consistent

