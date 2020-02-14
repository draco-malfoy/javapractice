import java.util.*;

class primeInBetween {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		
		int num1 = sc.nextInt();
		System.out.print("Enter second number:");
		int num2 = sc.nextInt();

		for (int i=num1+1; i<num2; i++ ) {  //i = checking number
			int a = (int)i/2;				//a = half of original number
			for (int j = 2;i<a;j++){
				if (i%j==0){
					continue;
					
				}
				else {
										System.out.print("aa");


					System.out.print(i + " ");
					break;
				}	
			}
		}
	}
}