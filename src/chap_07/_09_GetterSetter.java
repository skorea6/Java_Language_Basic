package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;

        b1.price = -5000;
        System.out.println(b1.price);

        System.out.println(b1.resolution);

    }
}
