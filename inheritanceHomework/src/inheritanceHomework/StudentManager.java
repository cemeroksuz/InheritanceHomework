package inheritanceHomework;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getFirstName()+ " �simli ��renci Eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+ " �simli ��renci Silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+ " �simli ��renci G�llendi");
	}
}
