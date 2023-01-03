package ArraysBegin;
import java.util.Random;
public class SecondSmallestElement {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(200);
            System.out.println(arr[i]);
        }
        int small=arr[0],secondsmall;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small)
                small=arr[i];
        }
        secondsmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=small && arr[i]<secondsmall)
            secondsmall=arr[i];
        }
        System.out.println("\n"+secondsmall);
    }
}
