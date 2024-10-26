package ucu.edu.ua.flowercontinue.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
