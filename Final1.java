import java.lang.*;

class Final1
{
    public static void main(String arg[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i); //i+//11
        System.out.println(obj1.j); //20
        System.out.println(obj1.k); //30

        Demo obj2 = new Demo(11,21);
        obj2.fun();
        System.out.println(obj2.i); //11+//12
        System.out.println(obj2.j); //20
        System.out.println(obj2.k); //21 parameterice b = 21
    }
}

class Demo
{
    public int i;
    public final int j = 20;
    public final int k;

    public Demo()
    {
        this.i = 10;
        this.k = 30;

    }

    public Demo(int a, int b)
    {
        this.i = a;
        this.k = b;
    }

    public void fun()
    {
        i++;
        //j++;
       // k++;
    }
}