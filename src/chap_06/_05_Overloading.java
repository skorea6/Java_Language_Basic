package chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        return number*number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 (전달값 타입이 다르거나 전달값의 개수가 다르거나 -> 다른 메소드)
        // 반환형이 다른형태는 불가능
        System.out.println(getPower("3")); // 3*3=9
    }
}
