import org.w3c.dom.ls.LSOutput;

public class Duck extends Animal implements Flyable{//implements Flyable,hittable นำเข้าความสามารถ เพิ่มกี่ความสามารถก็ได้
   String name;
   public Duck(String name){
       this.name = name;
   }
    @Override
    void sound(){
        System.out.println("quak quak");
    }
    void consume(Animal animal) {

    }
//เอามาจาก Flyable
    @Override
    public void fly() {
        System.out.println("Prob Prob");
    }

    @Override
    public void glide() {
        System.out.println("fielddddd");
    }
    //--------------------------------------------------------
    void clean(Animal animal){// ใคร extends animal ใช้ได้หมด
        System.out.println(this.toString()+" is cleaning "+animal);
    }
    public String toString(){//แก้ปัญหาติด address
        return "เป็ด : "+ this.name;
    }
}
