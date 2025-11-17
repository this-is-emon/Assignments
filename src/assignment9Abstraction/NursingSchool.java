package assignment9Abstraction;

// Abstract Class : 'NursingSchool'
public abstract class NursingSchool {
	
	// 2 methods: abstract(hygiene) and non-abstract(caring)
	public abstract void hygiene();
	public void caring() {
		System.out.println("Non-abstract method named 'caring' from abstract class 'NursingSchool'");
	}
}
