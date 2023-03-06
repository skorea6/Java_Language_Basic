package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        // 일반 영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println(fileCount);

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println(fileCount);
    }
}
