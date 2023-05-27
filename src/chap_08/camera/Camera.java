package chap_08.camera;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 그냥 이름만, 선언만 한다. abstract는. -> 구현해야하는 메소드.
}
