package chap_07;

public class BlackBox {
    String modelName; // 모델명 - 인스턴스 변수
    String resolution; // 해상도
    int price; // 가
    String color; // 색상
    static boolean canAutoReport = false; // 클래스 변수 (자동 신고기능)

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
}
