import java.util.*;

class Exception1
{
    public static void main(String arg[])
    {
        int ans = 0; int no1 = 0; int no2 = 0;
       Scanner sobj = new Scanner(System.in);

       System.out.println("Please enter first number: ");
       no1 = sobj.nextInt();

       System.out.println("Please enter second number: ");
       no2 = sobj.nextInt();

       try
       {
        ans = no1 / no2;
       }
       catch(ArithmeticException obj)
       {
           System.out.println("Exception occured as : "+obj);
       }
       
       System.out.println("Divisoni is :"+ans);
       sobj.close();
    }
}

