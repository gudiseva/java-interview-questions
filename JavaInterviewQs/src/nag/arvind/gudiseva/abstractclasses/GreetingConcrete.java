package nag.arvind.gudiseva.abstractclasses;

public class GreetingConcrete extends GreetingAbstract {

	public GreetingConcrete() {
		super();
	}

	public GreetingConcrete(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		
		GreetingConcrete greetDefault = new GreetingConcrete();
		System.out.println(greetDefault.hello("Mrs"));
		
		GreetingConcrete greetParam = new GreetingConcrete("Gudiseva");
		System.out.println(greetParam.hello("Mr"));
		
		// GreetingAbstract greet = new GreetingAbstract();  // Cannot instantiate Abstract Class

		GreetingAbstract greet = new GreetingConcrete("Arvind");
		System.out.println(greet.hello("Hi"));

		
	}

}
