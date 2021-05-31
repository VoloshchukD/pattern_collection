package by.voloshchuk.structural.proxy;

public class Cash implements Payable {

    private double amount;

    Cash(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int pay(int price) {
        int amountToPay = 0;
        if (amount >= price) {
            amount = amount - price;
            amountToPay = price;
        }
        return amountToPay;
    }

}
