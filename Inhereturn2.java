import java.lang.*;

class Inhereturn2
{
    static
    {
        System.out.println("Inside static block");
    }

    public static void main(String a[])
    {
        System.out.println("Inside main ");
        Derived dobj = new Derived();

    }
}

class Base 
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
        this.i = 10;
        this.j = 20;
    }

    public Base(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
    public void fun()
    {
        System.out.println("base fun");
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
        System.out.println("super.i");  //2
        super.fun();         //2
    }
}
