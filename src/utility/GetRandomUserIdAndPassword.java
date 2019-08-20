package utility;

import java.util.Random;

public class GetRandomUserIdAndPassword {
	static Random rand = new Random();

	public static String Credintialdata = "!+=/><?|,.ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%^&*()_-+=/><?|,. abcdefghijklmnopqrstuvxyz0123456789!@$%^&*()_-+=/><?|,.";
	
	public static void getUserId() {
		String userName = "";
		for (int i = 0; i < 12; i++) {
			userName += Credintialdata.charAt(rand.nextInt(122));

		}
		System.out.println("User:  " + userName);
	}

	public static void getPassword() {
		String password = "";
		for (int i = 0; i < 12; i++) {
			password += Credintialdata.charAt(rand.nextInt(122));

		}
		System.out.println("password:  " + password);

	}

	public static void main(String[] args) {
		System.out.println("Legth of the string : "+Credintialdata.length());
		getUserId();
		getPassword();
		getUserId();
		getPassword();
		getUserId();
		getPassword();
		getUserId();
		getPassword();
		getUserId();
		getPassword();
	}

}
