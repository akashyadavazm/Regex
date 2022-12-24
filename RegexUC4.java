package regexPrograms;

import java.util.*;
import java.util.regex.*;

public class RegexUC4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String patternM = "[[91]{1}+ [0-9]{1}[0-9]{9}]";
		System.out.println("Enter the MoblieNo for Validation!");
		String mobileNo = sc.next();

		Pattern pM = Pattern.compile(patternM);
		Matcher mM = pM.matcher(mobileNo);
		if (mM.find()) {
			System.out.println("MobileNo is valid");
		} else {
			System.out.println("Invalid MobileNo!");
		}
		sc.close();
	}

}
