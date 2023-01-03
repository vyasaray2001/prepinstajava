package GettingStarted;

public class PlaindromeNumber {
    public static void main(String[] args) {
        int num=121,reverse=0,rem;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10 +rem;
            num=num/10;
        }
        num=121;
        System.out.println(reverse);
        if(num!=reverse){
            System.out.println("It Is Not aPalindrome");
        }
        else
        System.out.println("It Is Palindrome");

    }
}
