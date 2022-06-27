import java.lang.*;
class Final3
{
    public static void main(String a[])
    {
      Derived dobj = new Derived();
      dobj.bobj.fun();
      dobj.gun();
    }
}
/*final class Base
{
}*/
final class Base 
{
    public void fun()
    {
        System.out.println("Inside fun");
    }
}
class Derived 
{
    public Base  bobj = new Base();

    public void gun()
    {
        System.out.println("Derived gun");
    }
}
   