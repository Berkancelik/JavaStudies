
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"  "+"adlý kullanýcý giriþ yaptý");
	}
	
	public void exit(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"  "+"adlý kullanýcý çýkýþ  yaptý");
	}
	
	public void printUserInfo(User user) {
		System.out.println(user);
	}

}
