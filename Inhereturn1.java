import java.lang.*;

class Inhereturn1
{
    static
    {
        System.out.println("Inside static block");
    }

    public static void main(String a[])
    {
        System.out.println("Inside main ");
        Derived dobj = new Derived();
        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();
    }
}

class Base 
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
    }

    public void fun()
    {
        System.out.println("base fun");
    }

    public void fun(int x)
    {
        System.out.println("base fun with argument");
    }

    public void gun()
    {
        System.out.println("inside base gun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;

    public Derived()
    {
        System.out.println("inside devived constructor");
    }

    public void sun()
    {
        System.out.println("Inside devired sun");
    }
}
