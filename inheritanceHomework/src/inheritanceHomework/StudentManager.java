package inheritanceHomework;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getFirstName()+ " İsimli Öğrenci Eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+ " İsimli Öğrenci Silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+ " İsimli Öğrenci Güllendi");
	}
}
