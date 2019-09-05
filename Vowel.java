import java.lang.*; 
import java.io.*; 
import java.util.*;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
            {
                System.out.print("vowel ");
            }
            else System.out.print("consonant ");
        }
        
    }
   

}