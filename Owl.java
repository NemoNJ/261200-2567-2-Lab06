public class Owl extends Animal implements Flyable{
    @Override
    void sound() {
        System.out.println("Hoot hoot");
    }

    @Override
    void consume(Animal animal) {

    }

    @Override
    public void fly() {
        System.out.println("Prob Prob");
    }

    @Override
    public void glide() {
        System.out.println("fielddddd");
    }
}
