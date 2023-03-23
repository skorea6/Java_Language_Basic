package chap_07.camera;

// SpeedCam is a Camera; (IS-A)
public class SpeedCam extends Camera{ // 자식 클래스
    public SpeedCam() {
        super("과속 단속 카메라");
    }

    public void takePicture(){
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        // 속도 체크
        System.out.println("차량 속도 측정");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호 인식");
    }

    @Override // annotation
    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식");
    }

}
