package ucu.edu.ua.flowercontinue.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
