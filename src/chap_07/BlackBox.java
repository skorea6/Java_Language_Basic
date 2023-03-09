package chap_07;

public class BlackBox {
    String modelName; // 모델명 - 인스턴스 변수
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호 생성 역할
    static boolean canAutoReport = false; // 클래스 변수 (자동 신고기능)

    BlackBox(){
        // 자동 호출 메소드
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println(this.serialNumber + " 새로운 시리얼넘버 발급");
    }

    BlackBox(String modelName, String resolution, int price, String color){
//        this();
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌 감지 -> 자동 신고");
        }else{
            System.out.println("자동 신고 불가");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 삽입됨");
        System.out.println(capacity + "GB");
    }

    int getVideoFileCount(int type){
        if(type == 1){
            return 9;
        }else if(type == 2){
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화 시작");
        if(showDateTime){
            System.out.println("영상의 날짜정보 표시");
        }
        if(showSpeed){
            System.out.println("영상 속도정보 표시");
        }
        System.out.println(min + "분 단위로 완료");
    }

    // 모든 개체에 공통적으로 적용
    static void callServiceCenter(){
        System.out.println("서비스센터 연결");
//        modelName = "test"; -> 불가능
        canAutoReport = false; // 가능
    }


    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(){
        if(resolution == null){

        }
//        return resolution;
    }
}
