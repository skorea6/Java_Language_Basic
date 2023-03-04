package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언 첫번쨰 방법
//        String[] coffees = new String[4];

        // 두번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; // 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "카페모카";
//        coffees[3] = "카페모카";

        // 세번째 방법
//        String[] coffees = new String[] {"아메리카노", "카페모카", "라떄", "카푸치노"};

        String[] coffees = {"아메리카노", "카페모카", "라떄", "카푸치노"};

        // 커피 주문
        System.out.println(coffees[0] + "하나"); // 아메리카노 하나
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");

        // 다른 자료형? = 동일


    }
}
