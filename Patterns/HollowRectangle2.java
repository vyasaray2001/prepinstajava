package Patterns;

public class HollowRectangle2 {
    public static void main(String[] args) {
        int n=4;//Number of Rows
        int m=5;//Number Of Columns
        for(int i=1;i<=n;i++)
        
        {
            for(int j=1;j<=m;j++)
            {

                if(i==1|| j==1 || i==n || j==m)//Print *
                {
                    System.out.print("*");
                    
                }
                else //Print Hollow Space
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
