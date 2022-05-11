package builder;

public class StudentBuld {
	private String name;
	private int id;
	
	public StudentBuld setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuld setId(int id) {
		this.id = id;
		return this;
	}
	public Student getobj() {
		return new Student( name,  id);
	}
	
}
