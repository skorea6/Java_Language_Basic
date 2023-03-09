package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;

        b1.price = -5000;
        System.out.println(b1.price);

        System.out.println(b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

//        b2.price = -5000; // 이것을 막을 수 있는 방법은 10에서 확인

        // resolution 는 null임을 걸러낼 수 있다.
        // getter setter 의 장점이라고 할 수 있다.
        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
