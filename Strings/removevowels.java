package Strings;

public class removevowels {
    public static void main(String[] args) {
        String s = "vyasaaaray";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String before removing vowel : "+s); 
        System.out.println("String after removing vowel : "+s1); 
    }
}
