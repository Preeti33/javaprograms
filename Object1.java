class Object1 
{
    public static void main(String a[])
    {
        Employee eobj= new Employee("Priti", 11000);
        System.out.println(eobj.toString());
    }
}

class Employee
{
    public String name;
    public int Salary;

    public Employee(String str, int no)
    {
        this.name = str;
        this.Salary = no;
    }

    public String toString()
    {
        return "Employe name is:" +name+"->"havaing salary : "+Salary;  
        //return should be string
    }
}
