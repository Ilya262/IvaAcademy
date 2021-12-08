package lesson4;

public class Student extends Human {

	private Integer id;

	private String University;

	public Student(String name, String lastName, int age, int hight, Integer id, String university) {
		super(name, lastName, age, hight);
		this.id = id;
		this.University = university;
	}

	public Student(Integer id, String university) {
		super("Ivan", "Popovych", 22, 180);
		this.id = id;
		University = university;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", University=" + University + ", getName()=" + getName() + ", getLastName()="
				+ getLastName() + ", getAge()=" + getAge() + ", getHight()=" + getHight() + "]";
	}

	
	
	
	
	

}
