package SingletonPattern;

public class Singleton {

	private static Singleton singleton = null;
	
	private int callTime;
	
	private Singleton(){
		this.callTime = 0;
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		
		return singleton;
	}
	
	public void call(){
		String timeString = this.callTime++ == 0 ? " time" : " times";
		System.out.println("call " + String.valueOf(this.callTime) + timeString);
	}
}
