

public class SingleTon {
	
	private SingleTon() {
		System.out.println("This is private constructor");
	}
	private static SingleTon obj = new SingleTon();
	
	static SingleTon getInstance() {
		return obj;
	}
	
	public void invokeMethod() {
		System.out.println("Method is invoked");
	}
	
	public static void main(String[]args) {
		
		SingleTon ton =SingleTon.getInstance();
		ton.invokeMethod();
	}

}

