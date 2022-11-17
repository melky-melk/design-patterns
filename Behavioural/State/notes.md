State Design Pattern
- Purpose/Intent
	- Allow an object to change its behaviour when its internal state changes
	- The object will appear to change its class when the state changes
	- We can use subtypes of classes with different functionality to represent different states, such as for a TCP connection with Established, Listening, Closed as states
- Known as
	- Objects for States

![](2022-09-07-14-36-08.png)

State Pattern - Participants
- Context
	- Defines the interface of interest to clients
	- Maintains an instance of a ConcreteState subclass that defines the current state
- State
	- Defines an interface for encapsulating the behaviour associated with a certain state of the Context
- ConcreteState subclasses
	- Each subclass implements a behaviour associated with a state of the Context

State Design Pattern
- Applicability
	- Any time you need to change behaviours dynamically, i.e., the state of an object drives its behavior and change its behavior dynamically at run-time
	- There are multi-part checks of an object’s state to determine its behaviour, i.e., operations have large, multipart conditional statements that depend on the object’s state
- Benefits
	- Removes case or if/else statements depending on state, and replaces them with function calls; makes the state transitions explicit; permits states to be shared
- Limitations
	- Does require that all the states have to have their own objects


internally, the client doesnt trigger which state the object is in, and
also in states the state can change between

the state changes what the behaviour is, like a stratgy