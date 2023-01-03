package Patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        System.out.println("Eneter The Number");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        //UpperPart
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



         //LowwerPart
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
