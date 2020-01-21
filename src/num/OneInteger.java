package num;
 
public class OneInteger {
    int hour, min;

    public String toString() {
        return hour + ":" + min;
    }  
    static String str(String s){
        return s + s;
    }

public static void main (String [] args){
	System.out.println(OneInteger.str("Test"));
}}