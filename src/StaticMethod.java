
public class StaticMethod {

	public static void DemoStaticMethod() {

		System.out.println("we are into Static Method");
	}

	public static void main(String[] args) {

		// Here, call the static method without using Obj

		StaticMethod.DemoStaticMethod();
	}

}
