package nag.arvind.gudiseva.singleton;

public class SingletonClone implements Cloneable {

	private static SingletonClone instance = null;
	
	// Note: Constructor is Private
	private SingletonClone() {}

	public static SingletonClone getInstance() {
		 
        if (instance == null) {
            instance = new SingletonClone();
            return instance;
        }
        return instance;
    }
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
        // Forcibly throw the exception to prevent cloning
        throw new CloneNotSupportedException();
		//return super.clone();
	}
    

	@Override
	public String toString() {
		return "SingeltonClone [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {

		SingletonClone singletonInstance = SingletonClone.getInstance();
		System.out.println("Singleton Instance: " + singletonInstance);
		try{
			SingletonClone singletonClone = (SingletonClone) singletonInstance.clone();
			System.out.println("Singleton Clone: " + singletonClone);
		} catch (CloneNotSupportedException exception){
			exception.printStackTrace();
		}
		
	}

}
