public class PrimeOrNot {
    public static void main(String args[])
    {
        int a=97;

        for(int i=1;i<=100;i++)
        {
            if(i%3==0) {
                System.out.print(i + " ");
            }
        }

System.out.println(" ");

        int count=0;


        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count=count+1;
                System.out.print(i+"    ");
            }
        }
        System.out.println();
        System.out.println("TOTAL NUMBER OF FACTORS   "+count);
       // System.out.println(count);

        if(count==2)
        {
            System.out.println("PRIME MEMBER");
        }
        else {
            System.out.println("NOT PRIME MEMBER");
        }
    }
}
