package nag.arvind.gudiseva.interfaces;

public class MyInterfaceCDImpl implements MyInterfaceC, MyInterfaceD {

	public MyInterfaceCDImpl() {}

	@Override
	public void printMe() {
		System.out.println("Class: MyInterfaceCDImpl | Method: printMe() |");
	}

	public static void main(String[] args) {

		MyInterfaceCDImpl myInterfaceImpl = new MyInterfaceCDImpl();
		myInterfaceImpl.printMe();
		
		MyInterfaceC myInterfaceC = new MyInterfaceCDImpl();
		myInterfaceC.printMe();
		
		MyInterfaceD myInterfaceD = new MyInterfaceCDImpl();
		myInterfaceD.printMe();

		System.out.println("----------------------------------------------");
		MyInterfaceCD myInterfaceCD = new MyInterfaceCD() {

			@Override
			public void printMe() {
				System.out.println("Interface: MyInterfaceCD | Method: printMe() |");
			}
			
		};
		
		myInterfaceCD.printMe();
		
		((MyInterfaceC) myInterfaceCD).printMe();
		((MyInterfaceD) myInterfaceCD).printMe();  
		
		MyInterfaceC myInterfaceCD1 = (MyInterfaceC) myInterfaceCD;
		myInterfaceCD1.printMe();
		
		MyInterfaceD myInterfaceCD2 = (MyInterfaceD) myInterfaceCD;
		myInterfaceCD2.printMe();
	}

}
