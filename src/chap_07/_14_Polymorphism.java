package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        // 카메라 객체 생성
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        if(camera instanceof Camera){
            System.out.println("카메라입니다.");
        }

        if(factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }

        if(speedCam instanceof SpeedCam){
            ((SpeedCam)speedCam).checkSpeed(); // 차량 속도 검사
            ((SpeedCam)speedCam).recognizeLicensePlate(); // 번호 인식
        }

    }
}
