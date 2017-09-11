package nag.arvind.gudiseva.interfaces;

public class MyInterfaceCDDemo implements MyInterfaceC, MyInterfaceD {

	public MyInterfaceCDDemo() {}

	@Override
	public void printMe() {
		System.out.println("Class: MyInterfaceCDDemo | Method: printMe() |");
	}

	public static void main(String[] args) {

		MyInterfaceCDDemo myInterfaceDemo = new MyInterfaceCDDemo();
		myInterfaceDemo.printMe();
		
		MyInterfaceC myInterfaceC = new MyInterfaceCDDemo();
		myInterfaceC.printMe();
		
		MyInterfaceD myInterfaceD = new MyInterfaceCDDemo();
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
