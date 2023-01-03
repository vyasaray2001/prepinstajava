package ArraysBegin;
import java.util.Random;

class ReverseOfArray{
    public static void main(String[] args) {
        int arr[]=new int[5];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(500);
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}