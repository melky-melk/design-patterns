# design-patterns
the design pattern notes im taking for the soft2201 class. i might expand this to be all of the code covered in soft2201

unlike my other repos these are not in order of when they were taught, its just going to be sorted by the kind of design smell

The participants are just the classes that are inside of the class. the ones that are using the design pattern

For UML arrows just look at this website
https://www.gleek.io/blog/class-diagram-arrows.html

also make sure to turn off any code highlighting or squiggly lines, as all of the python files are just pseudocode ripped from refactor guru.
Dont expect any of the code to actually run...

good to check out https://refactoring.guru/design-patterns/

https://refactoring.guru/design-patterns/<pattern>

can use this template
- E.g., Describe pattern/principle X and compare it to p/p Y 
	- X is a design pattern that … 
	- X is generally useful because …, although it has the drawbacks … 
	- Y is a design pattern that … 
	- Y is generally useful because …, although it has the drawbacks … 
	- X differs from Y because...

- E.g., Describe the key classes you would like to use in the design pattern and map the participants of the design pattern to the classes 
	- The classes I would like to use is X, Y, Z, … 
	- Class X is … (refer to participant name) of pattern … 
	- Class X is used for/to … (specific roles) in pattern … 
	- Class Y is … 
	- Class Z is …

- E.g., Apply a design pattern to solve problem Y 
	- I will use X 
	- X is a design pattern that … 
	- X is generally useful because …, although it has the drawbacks … 
	- X is specifically applicable to Y because … 
	- … implementation … (if asked for)

- E.g., Given the following code, state the pattern has been used on it. Map the participants to the classes in the code and explain the roles of participants in the pattern. 
	- The pattern has been used in the code is … 
	- Class X is … (refer to participant name) of pattern … 
	- Class X is used for/to … (specific roles) in pattern … in the given code

- E.g., List all classifier names together with attributes and operations of the UML class diagram of system S. Identify the relationships among these classifiers. 
	- Class X 
		- Attributes: + variableName : String 
		- Operations: + methodName (par: Z): double 
	- Interface Y 
		- Operations: + methodName (par: Z): double 
	- Relationship: 
		- Class X implements interface Y 
		- Y is dependent on Z