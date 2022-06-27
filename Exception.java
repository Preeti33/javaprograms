import java.util.*;

class Exception
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Please enter first number: ");
       int no1 = sobj.nextInt();

       System.out.println("Please enter second number: ");
       int no2 = sobj.nextInt();

       int ans = no1 / no2;
       System.out.println("Divisoni is :"+ans);
       sobj.close();
    }
}