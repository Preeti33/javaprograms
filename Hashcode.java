class Hashcode
{
    public static void main(String a[])
    {
        String str1 = "Marvellous";
        String str2 = "Marvellous";
        String str3 = "Infosystems";
        Demo dobj = new Demo();

        System.out.println("Hashcode of str1 :"+str1.hashCode());
        System.out.println("Hashcode of str1 :"+str2.hashCode());
        System.out.println("Hashcode of str1 :"+str3.hashCode());
        System.out.println("Hashcode of str1 :"+dobj.hashCode());
        //System.out.println();
        //System.out.println();
    }
}

class Demo
{}