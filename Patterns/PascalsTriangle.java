package Patterns;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Eneter The Nummber");
        int n= s.nextInt();
        // 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
                int C=1;
                for (int j = 1; j <= i; j++) {
 
                    // The first value in a line is always 1
                    System.out.print(C + " ");
                    C = C * (i - j) / j;
                }
                System.out.println();
        }
        s.close();

    }
}
