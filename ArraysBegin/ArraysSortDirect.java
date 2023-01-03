package ArraysBegin;
import java.util.*;

public class ArraysSortDirect {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(7000);
            System.out.println(arr[i]);
        }
        System.out.println();

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        

    }
}
