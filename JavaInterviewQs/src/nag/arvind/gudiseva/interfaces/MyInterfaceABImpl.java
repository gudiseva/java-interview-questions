package nag.arvind.gudiseva.interfaces;

public class MyInterfaceABImpl implements MyInterfaceA, MyInterfaceB {

	public MyInterfaceABImpl() {}

	public static void main(String[] args) {
		
		// If Class implements 2 interfaces, both the variables will be inherited. But due to same variable name, Compiler gets confused and gives error that variable is ambiguous.
		// System.out.println("Interface Variable: " + MyInterfaceABDemo.id); // Compile time error: The field MyInterfaceABDemo.id is ambiguous
		
		// Access the variable by using the interface name
		System.out.println(MyInterfaceA.id);
		System.out.println(MyInterfaceB.id);

	}

}
