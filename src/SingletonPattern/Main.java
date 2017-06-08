package SingletonPattern;

public class Main {

	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		instance1.call();
		instance2.call();

	}

}
