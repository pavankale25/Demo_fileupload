
public class Demo {
	
	public static void main(String [] args) {
		System.out.println("Hello IPS");
		Demo.a();
		Demo d = new Demo();
		d.nonStaticMethod();
	}
	
	public static void a() {
		System.out.println("This is static method");
		System.out.println("Practice for static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("This is non static method");
		System.out.println("This method related to non static");
	}

}
