package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("eMail g�nderildi : " + message);
	}

}
