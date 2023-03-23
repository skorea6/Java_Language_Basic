package chap_07.camera;

// FactoryCam is a Camera (IS-A)
public class FactoryCam extends Camera{ // 자식 클래스
    public FactoryCam(){
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo(){
        // 동영상 녹화
        super.recordVideo(); // 부모에 있는거 먼저 실행하기! super 로. overriding
        detectFire();
    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재 감지");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 화재 감지");
    }

}
