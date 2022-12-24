package regexPrograms;

import java.util.*;
import java.util.regex.*;

public class RegexUC1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patternF = "[[A-Z]{1}+[a-z]{2,}]";
		System.out.println("Enter the First Name for Validation!");
		String fName = sc.next();

		Pattern pF = Pattern.compile(patternF);
		Matcher mf = pF.matcher(fName);
		if (mf.find()) {
			System.out.println("Valid First Name");
		} else {
			System.out.println("Invalid First Name!");
		}
		sc.close();
	}

}
