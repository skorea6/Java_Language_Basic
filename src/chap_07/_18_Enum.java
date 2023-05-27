package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB ...
        // 해상도: HD, FHD, QHD ...

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);
        System.out.println(resolution.getWidth());

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD"); // 문자열로부터 enum 값 가져올때 사용
        System.out.println(resolution);

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // name: HD, UHD.. , ordinal: 번호(순서 0부터)
        }

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}


enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}