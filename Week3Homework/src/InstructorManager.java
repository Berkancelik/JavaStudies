
public class InstructorManager extends User {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+ " kursu ekledi");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+ " kursu sildi");
		
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+ " kursu güncelledi");
	}
	
	

}
