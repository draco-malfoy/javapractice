class TestAccess {
    private int privateVariable;
    public int publicVariable;
 
    private void privateMethod() {
        System.out.println("I am private to this class only");
    }
 
    public void publicMethod() {
        System.out.println("Can't reach me from outside");
    }
 
    public void accessPrivateMember() {
        System.out.println("privateVariable inside privateMethod = " + privateVariable);
        privateMethod();
    }
}
 
public class AccessControlDemo {
 
    public static void main(String s[]) {
        TestAccess ob = new TestAccess();
        ob.publicVariable = 100;
        System.out.println(ob.publicVariable);
        ob.publicMethod();
 
        /*
        This will not even compile as privateVariable is declared
        private inside TestAccess class
        */
 
        //ob.privateVariable = 200;
 
        /*
        This will not even compile as privateMethod is declared
        private inside TestAccess class
        */
 
        //ob.privateMethod();
 
        ob.accessPrivateMember();
    }
}