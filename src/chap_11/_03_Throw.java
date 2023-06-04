package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17; // 만 17세

        try{
            if(age < 19){
//                System.out.println("만 19세 미만은 판매 X");
                throw new Exception("만 19세 미만은 판매 X");
            }else{
                System.out.println("주문하신 상품입니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
