package GettingStarted;

public class AmstrongNumber {
    public static void main(String[] args) {
        int order=4,number=1635,res=0;
        while(number!=0){
            res+=Math.pow(number%10, order);
            number=number/10;
        }
        number=1635;
        if(res==number){
            System.out.println(number+":Is a Armstrong Number");
        }
        else    
            System.out.println(number+":Is a Not Armstrong Number");
    }
}
