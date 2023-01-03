package ArraysBegin;

import java.util.Random;

public class Sumofelements {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int sum=0;
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(500);
            System.out.println(arr[i]);
            sum+=arr[i];

        }
        System.out.println("Sum Is :"+sum);

        
        
    }
}
