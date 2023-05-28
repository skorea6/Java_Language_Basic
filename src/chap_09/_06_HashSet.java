package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        // ** 중복 데이터 허용X, 순서 뒤죽박죽
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("삼겹살");
        set.add("후추");

        System.out.println("총 구매 상품 수: " + set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------");

        // 확인
        if(set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("---------------");

        // 삭제
        System.out.println("삼겹살 구매전: " + set.size()); // 4
        set.remove("삼겹살");
        System.out.println("삼겹살 구매후: " + set.size()); // 3

        // 전체 삭제
        set.clear();
        if(set.isEmpty()){
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }

        System.out.println("---------------");

        // 순서 보장하는 방법 -> LinkedHashSet
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }

    }
}
