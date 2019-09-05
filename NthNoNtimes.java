import java.lang.*; 
import java.io.*; 
import java.util.*;

public class NthNoNtimes {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a no.: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int t=i;
            for(int j=1;j<=t;j++)
            {
                System.out.print(t + " ");
            }
        }
        sc.close();
    }
}