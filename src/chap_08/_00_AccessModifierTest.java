package chap_08;

//import chap_07.BlackBoxRefurbish;
import chap_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
//        b1.resolution = "FHD" // default -> 사용 불가 (다른패키지)
//        b1.price = 200000; // private -> 사용 불가
//        b1.color = "검은색" // protected -> 사용 불가


    }
}
