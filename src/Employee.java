public class Employee {
    // задание №1 Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    String name;  //ФИО
    String post;  //должность
    String mail;  // e-mail
    String phone;    //телефон
    int pay;      // заработная плата
    int age;      //возраст

    // Задание №2. Конструктор класса должен заполнять эти поля при создании объекта.
    Employee(String name, String post, String mail, String phone, int pay, int age) {

        // данные сотрудника
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    // Задание №3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    void empData() {
        System.out.println(name + " " + post + " " + mail + " " + phone + " " + pay + " " + age);
    }
}

