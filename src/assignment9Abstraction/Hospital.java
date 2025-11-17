package assignment9Abstraction;

public interface Hospital {
	public abstract void emergencyRoom();
	default void cafeteria() {
		System.out.println("A default method inside Interface named 'Hospital'");
	};
	static void surgeryRoom() {
		System.out.println("A Static method inside Interface named 'Hospital'");
	};
	
}
