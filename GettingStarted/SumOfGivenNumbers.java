package GettingStarted;
public class SumOfGivenNumbers {
    public static void main(String[] args) {
        int num=1234,sum=0,sum2=0;
        String numb=String.valueOf(num);
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        System.out.println(sum);
        for(int i=0;i<numb.length();i++){
            sum2+=numb.charAt(i)-48;
            
        }
        System.out.println(sum2);

    }
}
