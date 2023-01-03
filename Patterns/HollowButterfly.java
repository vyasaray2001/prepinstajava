package Patterns;
import java.util.*;

public class HollowButterfly {
    public static void main(String[] args) {
        System.out.println("Eneter The Number");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        
        //UpperPart 1 to n
        for(int i=1;i<=n;i++){
            if(i<=2){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=(n-i)*2;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            
            }
            //Printing HollowsIn B/w
            else{
                
                System.out.print("*");
                
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                
                System.out.print("*");

                for(int j=1;j<=(n-i)*2;j++){
                    System.out.print(" ");
                }


                System.out.print("*");
                
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                
                System.out.print("*");
            }
            System.out.println();
        }


        //LowwerPart n to 1
        for(int i=n;i>=1;i--){
            if(i<=2){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=(n-i)*2;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            
            }
            else{
                
                System.out.print("*");
                
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                
                System.out.print("*");

                for(int j=1;j<=(n-i)*2;j++){
                    System.out.print(" ");
                }


                System.out.print("*");
                
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
