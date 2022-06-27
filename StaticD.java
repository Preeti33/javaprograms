import java.lang.*;

class StaticD
{
    public static void main(String a[])
    {
        D.gun();

        D obj;
        obj = new D();
        /*obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j);*/
    }
}

class D
{
    public int i;
    public int j;
    public static int k;

    static
    {
        System.out.println("Inside static block");
        k = 11;
    }

    public D()
    {
        System.out.println("Inside constructor");
        this.i = 0;
        this.j = 0;
    }

    public void fun()
    {
        System.out.println("Inside non static fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k); 
    }

    public static void gun()
    {
        System.out.println("Inside stastic gun");
        System.out.println(k);
    
    }

}