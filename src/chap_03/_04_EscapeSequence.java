package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n \\t \\ \" \'

        System.out.println("자바가요\n너무\n재밌어");

        // 해물파전원     9000원
        // 김치전   8000원
        // 부추전   8000원

        System.out.println("해물파전\t9000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program");

        // \" : 큰따옴표
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
