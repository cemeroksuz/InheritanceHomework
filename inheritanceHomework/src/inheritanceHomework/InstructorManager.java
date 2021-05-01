package inheritanceHomework;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " Ýsimli Eðitmen Eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " Ýsimli Eðitmen Silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " Ýsimli Eðitmen Güllendi");
	}
}
