import java.util.*;

class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N:");
		int n  = sc.nextInt();

		int n1=0,n2=1,n3=n1+n2;


		if (n==1)
			System.out.println("0");
		else if (n==2)
			System.out.println("1");
		else {
			System.out.print(n1 + " " +n2 + " ");
			for (int i = 3;i<=n;i++){
				System.out.print(n3 + " ");
				n1=n2;
				n2=n3;
				n3=n1+n2;
			}



		}


	}
}