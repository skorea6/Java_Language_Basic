package chap_10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();

        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        list.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);

        Stream<Customer> test = Stream.of(new Customer("챈들러", 50), new Customer("레이첼", 42));
//        test.map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);
    }
}

class Customer{
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}