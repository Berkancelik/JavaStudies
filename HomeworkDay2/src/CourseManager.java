
public class CourseManager {
	
	public void enrollCourse(Course course) {
		System.out.println("Kursa kayıt olundu"+" "+course.courseName);
	}
	
	public void searchCourse(Course course) {
		System.out.println(course.id);
	}

}
