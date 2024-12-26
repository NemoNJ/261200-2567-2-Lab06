import java.sql.SQLOutput;

public abstract class Animal {
    //ถ้าใส่ public ต้องใส่ที่ subclass ด้วยเพราะ package แข็งกว่า public subclass แข็งกว่าไม่ได้
    abstract void sound(); // เขียนไว้บอกว่าส่งเสียงได้
//    final abstract void sound(); <-- จะ  override ไม่ได้
    abstract void consume(Animal animal); //กินสัตว์ตัวอื่นตัวไหน
}
