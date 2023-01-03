package ArraysBegin;
import java.util.*;
public class BubleSort {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int temp,n=arr.length;
        Random random=new Random();
        System.out.println(n);
        for(int i=0;i<n;i++){
            arr[i]=random.nextInt(7000);
            System.out.println(arr[i]);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;i<n-i-1;j++ ){

                if (arr[j] > arr[j + 1]){
                
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
