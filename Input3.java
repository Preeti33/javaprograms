import java.io.*;

class Input3

{
    public static void main(String a[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter string");
        String str = bobj.readLine();
       
        System.out.println("Enter age");
        int no = Integer.parseInt(bobj.readLine());
        
        System.out.println("Enter Marks");
        float f = Float.parseFloat(bobj.readLine());
        
        System.out.println("Enter double");
        double d = Double.parseDouble(bobj.readLine());
        
        System.out.println("Enter your string is : "+str);
        System.out.println("your age : "+no);
        System.out.println("your Marks is : "+f);
        System.out.println("your double is : "+d);
    }
}