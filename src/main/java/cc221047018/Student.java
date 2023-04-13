package cc221047018;

public class Student
{
	private String sname,age,gender,subject,phone;

	public Student() {
		super();
	}

	public Student(String sname, String age, String gender,String subject,String phone) {
		super();
		this.sname = sname;
		this.age= age;
		this.gender = gender;
		this.subject = subject;
		this.phone = phone;
		
		
	}

	public String getSname() {
		return sname;
	}

	public void setUname(String sname) {
		this.sname = sname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

