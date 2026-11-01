public class ReverseNumber {

    public static void main(String args[])
    {

        int a=34512;
        //int rem=0;
        int rev=0;
        int count=0;


        while(a>0)
        {
            int rem=a%10;
            count = count+1;

            rev = (rev*10) + rem;
            a=a/10;
        }

        System.out.println(rev);

        System.out.println(count);

    }
}
