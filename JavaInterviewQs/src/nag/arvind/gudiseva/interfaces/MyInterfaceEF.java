package nag.arvind.gudiseva.interfaces;

public interface MyInterfaceEF { // extends MyInterfaceE, MyInterfaceF {

	// Compilation Error:
	// The return types are incompatible for the inherited methods MyInterfaceE.isPresent(), MyInterfaceF.isPresent()
	// Both the Interfaces define isPresent(), but with unrelated return types

}
