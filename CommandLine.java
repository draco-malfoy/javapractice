// Display all command-line arguments.
class CommandLine {
	public static void main(String army[]) {
		for(int i=0; i<army.length; i++)
			System.out.println("args[" + i + "]: " +
			army[i]);
	}
}