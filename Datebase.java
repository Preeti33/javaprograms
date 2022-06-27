import java.lang.*;
import java.sql.*;

class Datebase 
{
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysqul.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc::mysqual://localhost:3306/marvllous","root","root");

            Statement stmt = con.createStatement();

            Datebase rs = Datebase.executeQuery("Select* from student");

            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) +" " + getInt(3)+ " " + rs.getString(4));
            }
            con.close();
        }
        catch(Exception obj)
        {
            System.out.print("Exception occured : "+obj);
        }    
    }
    
}

