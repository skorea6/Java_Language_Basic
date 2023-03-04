package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "Test with A and B and.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("with")); // 포함 true
        System.out.println(s.indexOf("and")); // 위치 정보 12
        System.out.println(s.indexOf("Java")); // 포함되지 않는다면 -1
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보
        System.out.println(s.startsWith("Test with")); // 이 문자열로 시작한다면
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true
    }
}
