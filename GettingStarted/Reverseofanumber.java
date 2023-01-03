package GettingStarted;

public class Reverseofanumber {
    public static void main(String[] args) {
        int numb=1234,reverse=0,rem;
        String numbers=String.valueOf(numb);

        //using int
        while(numb!=0){
            rem=numb%10;
            reverse=reverse*10+rem;
            numb=numb/10;
        }
        System.out.println(reverse);

        for(int i=numbers.length()-1;i>=0;i--){
            System.out.print(numbers.charAt(i));
        }
    }
}
