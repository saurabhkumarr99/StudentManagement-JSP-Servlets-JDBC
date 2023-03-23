package POJO_Classes;

public class Student {

	private int id;
	private String StudentName;
	private String fatherName;
	private String motherName;
	private String gender;
	private int age;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String studentName, String fatherName, String motherName, String gender, int age,
			String address) {
		super();
		this.id = id;
		StudentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}

}
