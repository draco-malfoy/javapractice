import java.util.*;
import java.lang.*;

class palindrome {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		String num = sc.nextLine();

		char[] numarr = num.toCharArray();
		char[] org = new char[num.length()];

		for (int i = 0;i<num.length();i++) {
			org[i] = numarr[num.length()-(i+1)];

		}

		System.out.println(numarr);
		System.out.println(org);


		if (Arrays.equals(numarr,org))
			System.out.println("palindrome!");
		else
			System.out.println("not palindrome!");

	}
}
