package ArraysBegin;

import java.util.Random;

public class Smallestelementinanarray {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Random random= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(1000);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Smallest  Number In Array Is :"+small);
    }
}
