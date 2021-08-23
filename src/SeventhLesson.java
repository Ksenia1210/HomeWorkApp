import java.util.Arrays;

public class SeventhLesson {
    public static void main(String[] args){
        Cat_Lesson7 cat = new Cat_Lesson7("Тиша", 10);
        Plate plate = new Plate(11);

        plate.info();
        cat.eat(plate);
        plate.info();

        // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
        // потом вывести информацию о сытости котов в консоль.

        Cat_Lesson7 [] cats = new Cat_Lesson7[3];
        cats[0] = new Cat_Lesson7("Барсик",50);
        cats[1] = new Cat_Lesson7("Алиса", 25);
        cats[2] = new Cat_Lesson7("Тоша", 40);

        System.out.println(Arrays. toString(cats));  //не выдает список котов, только адреса...

       // @Override
       // cats.eat(plate);

    }
}
