
import java.util.Arrays;

public class stringsMethods {
    public static void main (String[] Args) {
        String s1 = "Hello"; //stored in string pool (direct assignment)
        String s2Obj = new String("Hello"); //stored in java heaps (object formation)
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = "HELLO";
        String s5 = " Hello World ";
        System.out.println(s1 == s2Obj); //False (checks memory address)
        System.out.println(s1.startsWith("He")); //true
        System.out.println(s2.endsWith("llo")); //true
        System.out.println(s2.contains("el")); //true
        System.out.println(s1.equalsIgnoreCase(s4)); //true
        System.out.println(s1.equals(s2)); // True (checks data);
        System.out.println(s3.toUpperCase()); // HELLO
        System.out.println(s4.toLowerCase()); //hello
        char[] a = s1.toCharArray(); //a = ["H","e","l","l","o"]
        System.out.println(a); //Hello
        System.out.println(s1.toCharArray()); // Hello
        System.out.println(s5.trim()); //Hello World (removes spaces from front and rear ends of the string)\
        System.out.println(s2.indexOf("l")); //  (returns first occurrence)
        System.out.println(s2.indexOf("8")); // -1
        System.out.println(s2.lastIndexOf("l")); // (returns last occurrence)
        System.out.println(s1.substring(2)); // llo
        System.out.println(s1.substring(2,5)); // llo
        System.out.println(Arrays.toString(s5.split(" "))); // [, Hello, World]
        System.out.println(Arrays.toString(s5.split("\\^"))); // use \\ when we have special characters
        System.out.println(s1.charAt(4)); // o
        System.out.println(s1.replace("o", "z")); //Hellz
        System.out.println(s5.replace("World", "guys")); // Hello guys
        String s6 = "15";
        System.out.println(Integer.valueOf(s6)); // 15
        //String s7; // not initialized
        String s8 = "  ";
        //s7.isEmpty(); // string is not initialized error
        System.out.println(s8.isEmpty()); // false
        System.out.println(s8.isBlank()); // true
    }
}