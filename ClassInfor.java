
class ClassInfor
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();

        Class cref = obj.getClass();
        System.out.println("Class name of obj is :"+cref.getName());

        String str = "Marvellous";
        Class cref1 = obj.getClass();
        System.out.println("Class name is string: "+cref1.getName());
    }
}

class Demo
{

}
