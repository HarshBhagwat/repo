package factory;

public class MainClass {

	public static void main(String[] args) {
		Factory  f= new Factory ();
		Booking b1=f.obj("silver");
		b1.ticket();

	}

}
