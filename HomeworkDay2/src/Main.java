
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"JAVA-REACT","Engin Demiroð");
		Course course2 = new Course(2,"C#-ANGULAR","Engin Demiroð");
		Course course3 = new Course(3,"Proramlamaya Giriþ","Engin Demiroð");
		
		Course[] courses = {course1, course2, course3}; 
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollCourse(course3);

	}

}
