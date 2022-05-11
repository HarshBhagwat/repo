package factory;

public class Factory {
public Booking obj(String s) {
	if(s.equals("silver")) {
		return new Silver();
	}
	else if(s.equals("gold")) {
		return new Golden();
	}
	else {
		return new Platinum();
	}
}

}
