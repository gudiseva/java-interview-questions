package nag.arvind.gudiseva.interfaces;

public class MyInterfaceAImpl implements MyInterfaceA {

	public MyInterfaceAImpl() {}

	public static void main(String[] args) {
		
		// Interface variable are public static final or in other word, a constant ... we can access it in a static way
		System.out.println("Interface Variable: " + MyInterfaceAImpl.id);
	}

}
