package regexPrograms;

import java.util.*;
import java.util.regex.*;

public class RegexUC5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patternP = "[a-zA-Z0-9]{8,}$";
		System.out.println("Enter the Password for Validation!");
		String password = sc.next();

		Pattern pP = Pattern.compile(patternP);
		Matcher mP = pP.matcher(password);
		boolean b = mP.matches();
		if (b) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password!");
		}
		sc.close();
	}

}
