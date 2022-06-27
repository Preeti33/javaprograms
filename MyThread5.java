import java.lang.Exception;

class MyThread5 
{
    public static void main(String arg[]) throws Exception
    {
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1, "First");//new state
        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2 , "Second");//new state

        t1.start();//Runnable state 

        t1.join();

        t2.start();//Runnable state
        //Dead state
    }
}

class Demo extends Thread
{
    public void run() //Running state
    {
        for(int i = 0; i<10 ; i++)
        {
            System.out.println("Value of i:" +i);
            try 
            {
                Thread.sleep(1000);
            }
            catch(Exception obj)
            {}
            
        }
    }   
    
}



