public class AmstrongNumber {


    public static void main(String args[])
    {


        int a=153;
        int originalNumber=a;
        int count=0;
        int rem=0;
        int am=0;

        while(a>0)
        {
            rem = a%10;
            am= am+(rem*rem*rem);
            a=a/10;
            count = count+1;
        }

        System.out.println(am);

        if(originalNumber==am)
        {
            System.out.println("The number is AMSTRONG NUMBER");
        }
        else
        {
            System.out.println("The number IS NOT AMSTRONG NUMBER");
        }



    }
}
