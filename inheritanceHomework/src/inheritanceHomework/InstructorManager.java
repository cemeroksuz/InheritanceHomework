package inheritanceHomework;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " �simli E�itmen Eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " �simli E�itmen Silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " �simli E�itmen G�llendi");
	}
}
