import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;

class IPaddress{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		if(regex.matches(input))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}
}