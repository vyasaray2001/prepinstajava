package GettingStarted;
public class PrefectNumber {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=145;
        int temp=num,dig=0,result=0;
        while(temp!=0){
            dig=temp%10;
            result+=factorial(dig);
            temp=temp/10;
        }
        System.out.println(result);
        if(num==result){
            System.out.println("Valid Strong Number");
        }
        else
            System.out.println("InValid Strong Number");

        
    }
    
}
