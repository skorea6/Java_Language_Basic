package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, ong
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types): String, Camera, FactoryCam, SpeedCam ...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "c1";
        c2.name = "c2";
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장
        System.out.println(c2.name); // 고장
        changeName(c2);
        System.out.println(c1.name); // 잘못
        System.out.println(c2.name); // 잘못
    }

    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
