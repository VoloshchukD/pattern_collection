package by.voloshchuk.structural.proxy;

public class Card implements Payable {

    private Cash cash;

    private int number;

    Card(Cash cash, int number) {
        this.cash = cash;
        this.number = number;
    }

    @Override
    public int pay(int price) {
        return isApproved() ? cash.pay(price) : 0;
    }

    public boolean isApproved() {
        System.out.println("Card check request to the Bank");
        return true;
    }

}
