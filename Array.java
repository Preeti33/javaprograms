import java.lang.*;

class Array
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Size of array : "+arr.length);
        System.out.println("Element of array are : "+arr);

        for (iCnt = 0; iCnt<arr.length; iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        System.out.println("Data by while loop");
        iCnt = 0;
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("Data by for each loop");
        for(int no : arr)      //for each(costamice)//no space stoar
        {
            System.out.println(no);
        }
    }
}