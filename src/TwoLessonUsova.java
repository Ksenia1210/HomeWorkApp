import java.sql.SQLOutput;

public class TwoLessonUsova {
    public static void main (String[] args){
        boolean c = task1();
        System.out.println(c);
        task2();
        boolean b = task3();
        System.out.println(b);

        task4("Hello", 5);
    }
    public static boolean task1(){
        int a = 111;
        int b = 7;
        int c =a+b;
        if (10 < c && c <= 20){
            return true;
        }else {
            return false;
        }
    }
    public static void task2(){
        int a = -1;
        if ( a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean task3(){
        int a = -111;
        if (a >=0){
            return true;
        }else {
            return false;
        }
    }
    public static void task4(String m, int n){
        //int n = 5;
        for (n=1; n <= 5; n++){
            System.out.println(m);
        }
    }
}
