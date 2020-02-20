import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class StringMatcher {
    public static String str = "1";

    public static void main(String []args){
        boolean boo = str.matches("[^0-9]* [12]? [0-9]{1,2} [^0-9]*");
        System.out.println(boo);
    }

 }

0*(?:[1-9][0-9]?|100)

   (?:            # Match the regular expression below
                  # Match either the regular expression below (attempting the next alternative only if this one fails)
         [1-9]    # Match a single character in the range between “1” and “9”
         [0-9]    # Match a single character in the range between “0” and “9”
            ?     # Between zero and one times, as many times as possible, giving back as needed (greedy)
