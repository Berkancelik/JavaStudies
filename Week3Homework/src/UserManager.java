
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"  "+"adl� kullan�c� giri� yapt�");
	}
	
	public void exit(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"  "+"adl� kullan�c� ��k��  yapt�");
	}
	
	public void printUserInfo(User user) {
		System.out.println(user);
	}

}
