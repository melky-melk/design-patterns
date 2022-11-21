
The originator must be the one to restore everything

Memento has only one responsibility - act as snapshot, Restore is part of Originator's job. Originator generates memento object, which safely stored in the caretaker. Caretaker would send back the saved memento object when Originator want to restore its state.

purpose is to have a way to restore states

Participants
- Originator
	- class can produce snapshots of its own state, as well as restore its state from snapshots when needed.
	- This is the one that actually does the restoration, the memento just holds things
- Memento 
	- is a value object that acts as a snapshot of the originator’s state. It’s a common practice to make the memento immutable and pass it the data only once, via the constructor.
	- The actual snapshot the originator creates
- Caretaker
	- knows not only “when” and “why” to capture the originator’s state, but also when the state should be restored.
	- The caretaker just stores the memento, and does nothing else. 

The Memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object. Hence, instead of other objects trying to copy the editor’s state from the “outside,” the editor class itself can make the snapshot since it has full access to its own state.

The memento is created inside of the class

The memento pattern also has a caretaker which does the restoring of the mementos. This is done so that nothing else ever touches the memento and the information isnt changed

The caretaker is given the mementoW