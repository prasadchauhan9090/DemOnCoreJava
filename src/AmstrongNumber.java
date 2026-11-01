public class AmstrongNumber {


    public static void main(String args[])
    {


        int a=125;
        int count=0;
        int rem=0;
        int am=0;

        while(a>0)
        {
            rem = a%10;
            a=a/10;
            count = count+1;
        }



    }
}
