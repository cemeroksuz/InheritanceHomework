package inheritanceHomework;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+ " �simli Kullan�c� Eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " �simli Kullan�c� Silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+ " �simli Kullan�c� G�llendi");
	}
}
