import java.util.*;

public class  OddEven{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        if(num>=20 && num<=30)
        {
            if(num%2==0)
            {
                System.out.println("Jerry");            
            }
            else System.out.println("Tom");
        }
        else System.out.println("No condition satisfied");
        
    }
}