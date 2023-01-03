package ArraysBegin;

import java.util.Random;

public class Largestelementinanarray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Random random=new Random();
        for(int i=0;i<5;i++)
            arr[i]=random.nextInt(60);
        for(int i=0;i<5;i++)
            System.out.println(arr[i]);
        int greatest=-1;
        
        //Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        System.out.println("Greatest Number In Array Is :"+greatest);

    }
}
