package chap_07.camera;

public class ActionCam extends Camera{
    // final 은 lens 값을 바꿀 수가 없음 -> 생성자에서는 수정 가능.
    public final String lens;
    public ActionCam(){
        super("액션 카메라");
        lens = "광각 렌즈";
    }

    public final void makeVideo(){
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오 제작");
    }
}
