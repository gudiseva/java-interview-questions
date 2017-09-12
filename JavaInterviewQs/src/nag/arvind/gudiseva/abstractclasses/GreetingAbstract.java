package nag.arvind.gudiseva.abstractclasses;

public abstract class GreetingAbstract {

	String name;
	
	public GreetingAbstract() {
		System.out.println("Abstract Class Default Constructor: " + this.getClass().getName());
	}
	
	public GreetingAbstract(String name) {
		this.name = name;
		System.out.println("Abstract Class Parameter Constructor: " + this.getClass().getName());
	}
	
	public String hello(String salutation) {
		return salutation + "." + name;
	}
	
}
