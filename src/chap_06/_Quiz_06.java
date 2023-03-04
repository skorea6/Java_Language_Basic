package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index); // 내이름 -> 내
//        System.out.println(hiddenData);
//        for (int i = index; i< data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        System.out.println(getHiddenData("내이름", 1));
    }
}
