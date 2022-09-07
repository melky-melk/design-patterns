Strategy
– Declares an interface common to all supported algorithms
– Used by context to call the algorithm defined by ConcereteStrategy

ConcereteStrategy
– Implements the algorithm using the Strategy interface

Context
– Is configured with a ConcereteStrategy object
– Maintains a reference to a Strategy object
– May define an interface that lets Strategy access its data 

![](2022-09-07-14-15-59.png)

the strategy is an interface that has the algorithms that need to be adapted

the context will create a strategy based on the concrete strategy given

![[Pasted image 20220907141910.png]]

Strategy – Applicability 
- Many related classes differ only in their behavior 
- You need different variant of an algorithm 
- An algorithm uses data that should be hidden from its clients 
- A class defines many behaviors that appear as multiple statements in its operations

![[Pasted image 20220907143304.png]]

Strategy – Consequences
- Benefits
	- Family of related algorithms (behaviors) for context to reuse
	- Alternative to sub-classing
	- Strategies eliminate conditional statements
	- Provide choice of different implementation of the same behavior
- Drawbacks
	- Clients must be aware of different strategies
	- Communicate overhead between Strategy and Context
	- Increased number of objects in an application 