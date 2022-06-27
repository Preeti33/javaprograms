import java.util.*;
import java.lang.Exception;
class Demo
{
    public int Division(int no1, int no2) //throws ArithematicException
    {
        return no1/no2;
    }
}
class Exception4
{
    public static void main(String a[])
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first the number");
        int no1 = sobj.nextInt();
        System.out.println("Enter second the number");
        int no2 = sobj.nextInt();

        Demo dobj = new Demo();

        try
        {
            System.out.println("Inside try");
            System.out.println();
        }

        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch");
            System.out.println(obj);
        }

        catch(Exception obj)
        {
            System.out.println(obj);
        }
 
        finally
        {
            System.out.println("Inside finally");
            sobj.close();
        }
        
        System.out.println("End of application");

        sobj.close();
        
    }
}