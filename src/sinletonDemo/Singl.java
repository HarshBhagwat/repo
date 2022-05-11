package sinletonDemo;

import java.io.Serializable;

public class Singl implements Serializable,Cloneable{

	
	private static final long serialVersionUID = 1L;
	public static  Singl s;
	private Singl() {
		
	}
	public static Singl obj ()
	{
		synchronized(Singl.class) {
		if(s==null) {
		s=new Singl();
		}
		else {
			return s;
		}
		return s;
	}}
	protected Object clone() {
		return s;
	}
	protected Object readResolve() {
		return s;
	}
	
}
