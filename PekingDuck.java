public class PekingDuck extends Duck  {
    PekingDuck(String name){
        super(name);  //ใช้ constructor ของ superclass
    }

    @Override
    void clean(Animal animal) {
        System.out.println("พี่แจ็คครับ");
    }
}
