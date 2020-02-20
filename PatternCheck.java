import java.util.regex.Pattern;

class PatternCheck{
	public static void main(String []args){
	String content= "h[llo";
	String regex = "h\\[llo";
	boolean result = Pattern.matches(regex, content);
	System.out.print(result);
// 		String text    =
//         "This is the text to be searched " +
//         "for occurrences of the http:// pattern.";

// String regex = ".*http://.*";

// boolean matches = Pattern.matches(regex, text);

// System.out.println("matches = " + matches);

}
}

