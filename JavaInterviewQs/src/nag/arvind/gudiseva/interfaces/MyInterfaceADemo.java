package nag.arvind.gudiseva.interfaces;

public class MyInterfaceADemo implements MyInterfaceA {

	public MyInterfaceADemo() {}

	public static void main(String[] args) {
		
		// Interface variable are public static final or in other word, a constant ... we can access it in a static way
		System.out.println("Interface Variable: " + MyInterfaceADemo.id);
	}

}
