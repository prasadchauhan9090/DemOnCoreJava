public class PrimeOrNot {
    public static void main(String args[]) {

        int cnt=0;

        for (int i = 900; i <= 1000; i++) {
           int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }

            if (count == 2) {
                System.out.print(i+" ");
                cnt++;


            }

        }
        System.out.println(" ");
     //   System.out.println(count);
        System.out.println(" ");

        System.out.println("TOTAL PRIME NUMBER ARE: "+cnt);
    }
}