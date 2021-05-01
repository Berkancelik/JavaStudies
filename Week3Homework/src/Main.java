
public class Main {
	public static void main(String[]args) {
		
		Instructor instructor = new Instructor("java",1,"Engin","Demiroğ",38,"engindemirog","4545545");
	
		
		
		
		Student student = new Student("354545",3,"berkan","çelik",22,"berkan@amöçsdmkds","322565");
	

		
		UserManager userManager = new UserManager();
		userManager.login(student);
		UserManager userManager2=new UserManager();
		userManager2.exit(instructor);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.completedCourse(student);
		
		InstructorManager instructorManager=new InstructorManager();
				
		instructorManager.addCourse(instructor);
		instructorManager.deleteCourse(instructor);
		instructorManager.updateCourse(instructor);
		
		
		
		
		
		
		
		
	}
	

}
