package by.voloshchuk.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        Payable payable = new Cash(100);
        System.out.println(payable.pay(90));
        payable = new Card((Cash) payable, 14981374);
        System.out.println(payable.pay(10));
    }
}
