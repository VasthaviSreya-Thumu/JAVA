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
        System.out.println(s5.trim()); //Hello World (removes spaces from front and rear ends of the string)
    }
}