import java.util.*;

class primeNumber {
	public static void main (String args[]) {
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		double a = num/2;
		for (int i = 2;i<a;i++){
			if (num%i==0){
				System.out.print("number is not prime");break;


			}


			else {
				System.out.print("number is prime");break;

		}
	}
}