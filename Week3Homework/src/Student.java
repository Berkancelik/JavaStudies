
public class Student extends User {

	 private String studentNo;
	 	

	public Student() {
		 
		 
	 }
	

	 public Student(String studentNo, int id, String firstName, String lastName, int age, String eMail, String password) {
			super( id,  firstName,  lastName,  age,  eMail,  password);
			this.studentNo = studentNo;
		}
	 
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	 
	 
	 
}
	

	
	


