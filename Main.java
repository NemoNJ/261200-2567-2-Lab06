public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); <-- Cannot use
          Cow wagyu = new Cow();
          Duck Donald = new Duck("โดนัล");
          Duck Daisy = new Duck("เดซี่");
          Pig burin = new Pig();
          Owl hewig = new Owl();
//        wagyu.sound();
//        Donald.sound();
//        burin.sound();
//        hewig.sound();
        Donald.clean(wagyu);
        Daisy.clean(Donald);
        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(Daisy);
        fourseasons.fly();
        Donald.clean(new Cow());//สร้าง obj เฉยๆไม่ตั้งชื่อ (Anonymus object)
        Donald.clean(new Cow());
        Donald.clean(new Cow());
    }
}
