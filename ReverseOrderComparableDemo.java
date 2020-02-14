import java.util.Arrays;
import java.util.Collections;

public class User implements Comparable<User>  {
        private String name;
        public User(String name) {
                this.name = name;
        }
        public String getName() {
		return name;
        }
	@Override
	public int compareTo(User o) {
		return name.compareTo(o.getName());
	}
} 

public class ReverseOrderComparableDemo {
    public static void main(String[] args) {
        User u1 = new User("Mohan");
        User u2 = new User("Sohan");
        User u3 = new User("Rahim");
        User[] users = {u1, u2, u3};
        System.out.println("...Natural Order...");
        Arrays.sort(users);
        for(User u: users){
            System.out.print(u.getName()+" ");
        }
        System.out.println("\n...Reverse Order...");
        Arrays.sort(users, Collections.reverseOrder());
        for(User u: users){
        	System.out.print(u.getName()+" ");
        }
    }
} 