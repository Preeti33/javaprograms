import java.lang.*;

class Marvellous 
{
    public static void main(String arr[])
    {
        System.out.println("Inside main");
        Demo obj = new Demo();
        obj.fun();
        obj.gun();
        System.out.println(obj.i);
    }
}

class Demo
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }
}

