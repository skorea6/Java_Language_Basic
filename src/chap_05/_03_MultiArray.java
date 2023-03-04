package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][] {
                seatA, seatB, seatC
        };

        // B2 에 접근하려면?
        System.out.println(seats[1][1]); // B2

        // 첫 줄에는 3칸->4칸->5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seats2[0][2]); // A3
//        System.out.println(seats2[0][4]); // error
    }
}
