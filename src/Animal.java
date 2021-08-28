public class Animal {

    protected String name;
    protected String colour;
    protected int age;

    Animal(String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public void swim(){
        System.out.println(name + " плавает");
    }

    void run(){
        System.out.println(name + " бегает");
    }
}
