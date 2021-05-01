package inheritanceHomework;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+ " Ýsimli Kullanýcý Eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " Ýsimli Kullanýcý Silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+ " Ýsimli Kullanýcý Güllendi");
	}
}
