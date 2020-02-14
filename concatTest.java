public class concatTest{  
    public static String concatWithString(){  
        String t = "Java";  
        for (int i=0; i<10000; i++){  
            t = t + "Tpoint";  
        }  

        return t;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer();  
        sb = Java;
        for (int i=0; i<10000; i++){  
            sb = sb + "Tpoint";  
        }  
        return sb;  
    }  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");


    }  
}  