package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // Runnable 은 implements 이기 때문에 여러개를 적을 수 있음
        // 단 Thread 은 extends 로 상속하는것이기 때문에 1개만 가능
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + " 번방 청소중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
