package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println(random.nextInt()); // int 의 범위 내에서 정수형 값 반환

        System.out.println(random.nextInt(10)); // 0 이상 10 미만의 정수형 값 반환
        System.out.println(random.nextDouble()); // 0이상 1.0 미만의 double 의 범위 내에서 실수값 반환

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        // double

        double min = 5.0;
        double max = 10.0;
        System.out.println((min + (max - min) * random.nextDouble()));
        System.out.println(random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println(random.nextInt(45) + 1);

        // nextInt(45) : 0이상 45 미만의 수
        // nextInt(45) + 1 : 1이상 46 미만의 수 = 1 이상 45 이하의 수


    }
}
