package Patterns;

import java.util.Scanner;

public class SolidRhombus10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        s.close();
    }
}
