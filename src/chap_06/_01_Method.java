package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello(){
        System.out.println("메소드입니다.");
    }

    public static void power(int number){
        int result = number * number;
        System.out.println(result);
    }

    public static String getAddress(){
        return "서울입니다.";
    }

    public static int getPower(int number){
        return number*number;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 호출
        sayHello();
        power(2);
        String address = getAddress();
        System.out.println(address);

        int retVal = getPowerByExp(2, 4);
        System.out.println(retVal);
    }
}
