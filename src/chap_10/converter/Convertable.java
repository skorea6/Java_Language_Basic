package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스
public interface Convertable {
    void convert(int USD);
//    void convert2(); // 에러
}
