package chap_01;

public class _07_Type {
    public static void main(String[] args) {
        // 숫자를 문자열로
        String s1 = String.valueOf(93);
//        String s2 = "test3";
        s1 = Integer.toString(93);
        System.out.println(s1 + "test");

        String s2 = String.valueOf(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바");

    }
}
