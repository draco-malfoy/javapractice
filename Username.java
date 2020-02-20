import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;

class Username{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String regex = "^[a-zA-Z]\\w{7,29}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		if(input.matches(regex))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}
}