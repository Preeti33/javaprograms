import java.util.*;
import java.lang.Exception;
class AgeInvaid extends Exception
{
    public AgeInvaid(String str)
    {
        super(str);
    }
    
}
class Exception5
{
    public static void main(String a[])
    {
        Scanner  sobj = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sobj.nextInt();

        try
        {

            if(age < 18)
            {
            
            }
            
        }


    }
}