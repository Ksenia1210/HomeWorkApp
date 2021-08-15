import java.util.Arrays;

public class FifthLesson {
    public static void main(String[] args){


        Employee firstEmp = new Employee("Сидоров Иван Иванович", "Бухгалтер", "sidorov@mail.ru","89514665784", 30000, 30);
        Employee secondEmp = new Employee("Иванов Петр Петрович", "Программист", "ivanov@mail.ru", "89614568574", 60000, 35);

        // вывод данных о сотрудниках в консоль
        firstEmp.empData();
        secondEmp.empData();

       //  4. Создать массив из 5 сотрудников.

        Employee [] emps = new Employee[5];
        emps[0] = new Employee("Синицын Сергей Владимирович", "Директор", "siniza@mail.ru","89554698784", 130000, 50);
        emps[1] = new Employee("Крапивина Любовь Алексеевна", "Секретарь", "krapivina@mail.ru","89025697458", 25000, 25);
        emps[2] = new Employee("Бауэр Вячеслав Алексанрович", "Главный инженер", "bauer@mail.ru","89985647231", 90000, 40);
        emps[3] = new Employee("Бай Надежда Сергеевна", "Конструктор", "bai@mail.ru","89145987563", 55000, 30);
        emps[4] = new Employee("Лазарева Екатерина Викторовна", "Юрист", "lazareva@mail.ru","89987425648", 80000, 36);

        //System.out.println(Arrays.toString(emps));
        //emps[2].empData();
        // не получается у меня вывести массив полностью разом, чтобы данные столбиком отразились

        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        // не понимаю, почему программа не видит части массива, почему ей не известна emps.age?
          int minAge = 40;

          if(emps.age > minAge){
              emps.empData();
              System.out.println();
        }

    }


}
