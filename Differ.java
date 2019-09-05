import java.io.*;
import java.util.Scanner; 
class Differ 
{ 
    public static void main(String args[])     { 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        while(n!= 0)
        {
            total+= n;
            n=sc.nextInt();
        }
        System.out.print("Program Exited with total equal to: ");
        System.out.println(total);

        sc.close();
    }
       
} 