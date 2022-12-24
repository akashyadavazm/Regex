package regexPrograms;

import java.util.*;
import java.util.regex.*;

public class RegexUC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patternL = "[[A-Z]{1}+[a-z]{2,}]";
		System.out.println("Enter the Last Name for Validation!");
		String lName = sc.next();

		Pattern pL = Pattern.compile(patternL);
		Matcher mL = pL.matcher(lName);
		if (mL.find()) {
			System.out.println("Valid Last Name");
		} else {
			System.out.println("Invalid Last Name!");
		}
		sc.close();

	}

}
