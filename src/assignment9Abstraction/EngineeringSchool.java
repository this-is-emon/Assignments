package assignment9Abstraction;

// Abstract Class: EngineeringSchool
public abstract class EngineeringSchool {
	// 2 methods: abstract(mechanicalLab) and non-abstract(computerLab)
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("Non-abstract method named 'computerLab' from abstract class 'EngineeringSchool'");
	}
}
