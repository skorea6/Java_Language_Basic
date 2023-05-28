package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{ // User 혹은 VIPUser 클래스만 올수있다는 뜻!!! -> 원하는 객체만 받고 싶을때 extends 사용.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }
}
