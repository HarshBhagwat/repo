package sinletonDemo;

public class MainClass {

	public static void main(String[] args) {
		Singl s1=Singl.obj();
		System.out.println(s1.hashCode());
		Singl s2=Singl.obj();
		System.out.println(s2.hashCode());
		Singl s3=Singl.obj();
		System.out.println(s3.hashCode());
	}

}
