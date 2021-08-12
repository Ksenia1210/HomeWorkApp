import java.util.Random;
import java.util.Scanner;

public class FourthLesson {

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    static char[][] map;
    static final int SIZE = 3; //размер поля
    static final int DOTS_TO_WIN = 3;

    public static void main(String[] args)
    {
        initMap();
        printMap();

        while (true)
        {
            humanTurn();
            printMap();
            if (isWinner(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWinner(DOT_O)){
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }

    }
    // метод,который инициализирует поле
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    // метод, который позволит вывести наше поле в консоль
    public static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " "); //позволит вывести верхнюю шапку поля
        }
        System.out.println(); // переход на новую строку
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //метод, который реализует ход человека

    public static void humanTurn(){
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    //метод, который реализует ход компьютера
    public static void aiTurn(){
        int x;
        int y;
        Random random = new Random();
        do{
            x = random.nextInt(SIZE);  // от 0 до 2 (3 включительно)
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if (map[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }

   // метод, чтобы игра закончилась
    //признаюсь, честно, этот метод и методы с диагоналями взят у Вас под копирку, тк я не смогла придумать даже близко
   // что-то подобное, для меня это слишком сложно((

    public  static boolean isWinner(char symb){
        int endOfOffset = map.length - DOTS_TO_WIN;

        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++){
            if (isDiagonalsFilledWith(symb, rowOffset)){
                return true;
            }

            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++){
                boolean hasWin =
                        isLinesFilledWith(symb, rowOffset, columnOffset);

                if (hasWin){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset){
        for (int row = rowOffset; row < (DOTS_TO_WIN + rowOffset); row++){
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = columnOffset; column < (DOTS_TO_WIN + columnOffset); column++){
                // проверка горизонтали
                if (map[row][column] == symb){
                    horizontalWinCounter++;
                }
                else{
                    horizontalWinCounter = 0;
                }

                // проверка вертикали
                if (map[column][row] == symb){
                    verticalWinCounter++;
                }
                else{
                    verticalWinCounter = 0;
                }
            }

            if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN)){
                return true;
            }
        }

        return false;
    }

    static boolean isDiagonalsFilledWith(char symb, int rowOffset){
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;

        final int subSquareLength = (DOTS_TO_WIN + rowOffset);

        for (int row = rowOffset; row < subSquareLength; row++){
            // проверка главной диагонали
            if (map[row][row] == symb){
                mainDiagonalCounter++;
            }
            else{
                mainDiagonalCounter = 0;
            }

            // проверка побочной диагонали
            if (map[row][map.length - 1 - row] == symb){
                sideDiagonalCounter++;
            }
            else{
                sideDiagonalCounter = 0;
            }
        }

        return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
    }

    //метод, позволяющий проверить на наличие точек в поле. Если есть точки, то ничья не достигнута
    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }

        return true;
    }
}
