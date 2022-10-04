import org.w3c.dom.TypeInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");
        System.out.println(First.Add(15, 25));
        var x = 123_456_789;
        System.out.println(x);
        int b = 17;
        int l = 23;
        System.out.printf("b=%d; l=%d \n", b, l);
        System.out.println(b > l);
        */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();
        System.out.println("Your number: "+num );
        in.close();
        */

        /*
        int[][]nums2={{3,15,27,45,16},{4,18,22,9,15}};

        nums2[1][4]=85;
        for(int i=0;i<nums2.length;i++){
            System.out.println();
            for(int j=0; j<nums2[i].length;j++){
                System.out.print(nums2[i][j]+" ");
            }
        }
        */
        /*
        int[] nums3={5,12,68,22,91,7,35};

        for(int j:nums3){System.out.print(j+" ");};
        System.out.println();

        for(int i=0; i<nums3.length;i++){
            nums3[i]=nums3[i]*2;
            System.out.print(nums3[i]+" ");};

         */

        //System.out.println(First.Pirived("Pirived!"));
        //hello("Vasche Piryved!");
        mult(15,24,16); //55
        //add("Karasho: ", 10,20,30);
        //System.out.println(daytime(14));
        //System.out.println(sum1(1.4,2.5));
        //System.out.println(sum1(4,15));
        //System.out.println(Factorial.factorial(5));
        //System.out.println(Fibon.fibon(5));
        /*
        try
        {
            int[] nums6=new int[5];
            nums6[8]=11;


            System.out.println(nums6[8]);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Game over, camaraden!");
        }

         */

        /*
        try
        {
            System.out.println("Type your number, please.");
            Scanner in = new Scanner(System.in);
            int x=in.nextInt();
            if (x<30)
            {
                System.out.println("Good boy! Your number: "+x);
            }
            if(x>=30)
            {
                throw new Exception("Число должно быть меньше 30");

            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Досвидос!");
        }
        */
        System.out.println(Second.Sdrasti("Vasya, pireved!"));

    }

        static void hello(String text1)
        {
            System.out.println(text1);
        }

        static void mult(int ...nums4)
        {
            int result=1;
            for(int i:nums4)
            {
                result *=i;

            }
            System.out.println(result);
        }


        static void add(String message, int ...nums5)
        {
            System.out.println(message);
            int result=0;
            for(int t:nums5)
            {
                result +=t;

            }
            System.out.println(result);
        }

        static String daytime(int hour)
        {
            if(hour>24||hour<0) return "no time";


            else if(hour>20||hour<7) return "good night";


            else if(hour>=17) return "good evening";


            else if(hour>=12) return "good day";


            else if(hour>=7) return "good morning";

            else return "goodbye";
        }

        static int sum1(int x, int y){return x+y;};
        static double sum1(double x, double y){return x+y;};





}