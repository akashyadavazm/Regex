package regexPrograms;

import java.util.regex.*;

public class RegexUC3 {

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("[A-Za-z0-9]+@(.+)");
		Matcher m1 = p1.matcher("Akashyadavazm123@bridgelabz.xyz");
		boolean b = m1.matches();

		if (b) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Invalid Email!");
		}
	}

}
