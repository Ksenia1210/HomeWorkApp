import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Eighth_Lesson {
    public static void main(String[] args){
     /*   String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(s2);

        char[] symbols = {'A','B','C'};
        String s4 = new String(symbols); //ABC

        byte[] myBytes = {65, 66, 67};
        String s5 = new String(myBytes);
        String s6 = new String(myBytes, StandardCharsets.UTF_16);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        String s7 = 5 + 5 + "Десять: ";
        System.out.println(s7); */

      /*  String s1 = "Hello world!";
        String s2 = "Hello world!";
        String s3 = "Hello ";
        String s4 = "world!";
        String s5 = s3 + s4;
        String s6 =  new String(s1);

        Scanner myScanner = new Scanner(System.in);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(myScanner.nextLine()));*/

        /*String s1 = "";

        long startTime = System.nanoTime();

        for (int i =0; i < 300000; i++){
           //  s1 += "a";
        }

        long endTime = System.nanoTime();

        float result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);

        StringBuilder myBuilder = new StringBuilder();
        startTime = System.nanoTime();

        for (int i =0; i < 300000; i++){
            myBuilder.append("a");
        }

        endTime = System.nanoTime();

        result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);*/
    new MyWindow();

    }
}
