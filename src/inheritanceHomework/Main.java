package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.id = 2;
		user1.firstName="Engin";
		user1.lastName="Demiroğ";
		user1.email="engindemirog@gmai.com";
		user1.password="987654";
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.delete(user1);
		userManager.update(user1);

		System.out.println("----------");

		Instructor instructor1 = new Instructor();
		instructor1.id = 2;
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroğ";
		instructor1.email="engindemirog@gmai.com";
		instructor1.password="987654";
		instructor1.instructorId=1;		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);

		System.out.println("----------");

		Student student1 = new Student();
		student1.id = 3;
		student1.firstName = "Can";
		student1.lastName = "Ercan";
		student1.email = "canercan@gmail.com";
		student1.studentId = 1;
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);

	}

}
