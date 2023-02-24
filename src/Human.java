public class Human implements Act,Speak {
    @Override
    public void act() {
        System.out.println("human is moving");
    }

    @Override
    public void speak() {
        System.out.println("human talking");

    }
}
