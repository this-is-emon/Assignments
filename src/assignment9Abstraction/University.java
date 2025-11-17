package assignment9Abstraction;

// Interface
public interface University {
	
	/*
	 * Interface can not have constructors because:
	 * A Class is a blue print to create objects, so constructor assists Class to allocate memory, initialize memory etc.
	 * An Interface is not for creating object, rather it's used as set of rules for classes. So Interfaces doesn't need constructors
	 */
//	public University() {
//		
//	};
	
	
	public abstract void classSize();
	public abstract void playGround();
	public abstract void teacher();
}