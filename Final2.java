import java.lang.*;

class Final2
{
    public static void main(String a[])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
    }
}

class Base
{
    public void fun()
    {
        System.out.println("Base fun");

    }

    public final void gun()
    {
        System.out.println("Base gun");//Base gun
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");//Derived fun
    }

    /*public void gun()
    {
        System.out.println("Derived gun");
    }*/
}