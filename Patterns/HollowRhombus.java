package Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");

            if(i==1 || i==n){
                for(int j=1;j<=n;j++)
                    System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int j=1;j<=n-2;j++)
                    System.out.print(" ");
                    System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
