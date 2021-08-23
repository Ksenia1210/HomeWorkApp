public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void addFood(int food){

    }
    // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    // (например, в миске 10 еды, а кот пытается покушать 15-20).
    public void decreaseFood(int appetite){
        this.food -= appetite;
        if (this.food < 0) {
            System.out.println("Добавьте еды");
        } else {
            System.out.println("Кошка наелась");
        }
    }

    public void  info (){
        System.out.println("plate: " + food);
    }

}
