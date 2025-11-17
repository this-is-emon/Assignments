package assignment9Abstraction;

public interface College {
	public abstract void commonRoom();
	default void laboratory() {
		System.out.println("A default method inside Interface named 'College'");
	};
	static void languageClub() {
		System.out.println("A Static method inside Interface named 'College'");
	};
}
