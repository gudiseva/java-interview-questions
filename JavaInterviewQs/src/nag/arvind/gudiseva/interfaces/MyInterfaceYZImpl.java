package nag.arvind.gudiseva.interfaces;

public class MyInterfaceYZImpl implements MyInterfaceY, MyInterfaceZ {

	public MyInterfaceYZImpl() { }

	public void display() { 
		MyInterfaceY.super.display();       
	}
	
	public static void main(String[] args) {
		
		MyInterfaceYZImpl myInterfaceYZImpl = new MyInterfaceYZImpl();
		myInterfaceYZImpl.display();
		
	}
}
