// Demo package p1.
package p1;
// Instantiate the various classes in p1.
 class Protection {
	int n= 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;

	 Protection() {
		System.out.println("base constructor");
		System.out.println("n= " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}

public class DemoPack {
	public static void main(String args[]) {
		Protection ob1 = new Protection();
		
	}
}