package chap_07.camera;

public class Camera { // 부모 클래스
    public String name;

    public Camera() {
        this("카메라");
    }

    protected Camera(String camera){ // protected: 같은 패키지내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
        this.name = camera;
    }

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");

        // 녹화 결과 출력
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 사진 촬영, 동영상 녹화");
    }
}
