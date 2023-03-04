package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int sold = 0;
        int noShow = 17;

        for (int i=1;i<=50;i++){
            if(i==noShow){
                System.out.println("노쇼 고객님");
                continue; // 아래 실행 X
            }

            sold++;
        }
    }
}
