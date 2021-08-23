public class Cat_Lesson7 {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat_Lesson7(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
}
