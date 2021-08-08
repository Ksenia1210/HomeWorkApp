import java.util.Arrays;

import static java.lang.System.*;

public class ThirdLessonUsova {
    public static void main (String[] args){
        //задание №1
        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1){
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));

        //задание №2
       int[] arr2 = new int[100];

       for (int i = 0; i < arr2.length; i++){
            arr2[i]= i+1;
        }
        System.out.println(Arrays.toString(arr2));

        //задание №3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< arr3.length; i++)
            if (arr3[i] <= 6) {
                arr3[i] = arr3[i] * 2;
            } else {
                arr3[i] = arr3[i];
            }
        System.out.println(Arrays.toString(arr3));

    //Задание №5
    int initialValue = 20;
    int length = 4;
    int [] arr5 = task5(initialValue, length);
    System.out.println(Arrays.toString(arr5));

        // Задание №4
        int [][] arr4 = new int [3][3];
        arr4 [0][0] = 0;
        arr4 [0][1] = 1;
        arr4 [0][2] = 2;
        arr4 [1][0] = 3;
        arr4 [1][1] = 4;
        arr4 [1][2] = 5;
        arr4 [2][0] = 6;
        arr4 [2][1] = 7;
        arr4 [2][2] = 8;

        for (int i=0; i < arr4.length; i++){
            arr4[i][i] = 1;
            arr4[i][arr4[i].length - 1 -i] = 1;
            System.out.print(arr4[3][3]);
            System.out.print(" ");
        }
        System.out.println();
// не понимаю, почему не выводится массив...

    }

    //Задание №5
    public static int[] task5 (int initialValue, int length){
        int[] arr5 = new int[length];
        for (int i=0; i<arr5.length; i++){
            arr5[i] = initialValue;
        }
        return arr5;
    }
}
