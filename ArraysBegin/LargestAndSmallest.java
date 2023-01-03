package ArraysBegin;

import java.util.Random;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(200);
            System.out.println(arr[i]);
        }
        int small=arr[0],greatest=arr[0];
        //Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small)
                small=arr[i];
            else if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        System.out.println("Greatest Number is:"+greatest);
        System.out.println("Smallest Number is:"+small);
    }
    
}
