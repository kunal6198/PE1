import java.lang.*; 
import java.io.*; 
import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0, sumeven=0;
        int c = sc.nextInt();
        int a=c;

        while(a>0)
		{   			
			sum=(sum*10)+a%10;  
			a=a/10;
        }
        if(sum==c) { 
            System.out.println("Yes, Its a Palindrome!");
            while(c>0)
            {
                if((c%10)%2==0) sumeven+=c%10;
                c=c/10;
            }
            if(sumeven>25) System.out.println("More than 25");
            else System.out.println("less than or equal to 25");
         }
        else System.out.println("Not a Palindrome!");
        sc.close();
    }
}