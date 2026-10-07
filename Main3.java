import java.text.DecimalFormat;

abstract class PaymentMethod {
    protected String name;
    protected String type;

    public PaymentMethod(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void pay(double amount);
}

class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Thẻ tín dụng", "Không dùng tiền mặt");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + formatter.format(amount).replace(',', '.') + " bằng thẻ tín dụng.");
    }
}

class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("PayPal", "Không dùng tiền mặt");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + formatter.format(amount).replace(',', '.') + " qua PayPal.");
    }
}

class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Tiền mặt", "Trực tiếp");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + formatter.format(amount).replace(',', '.') + " bằng tiền mặt.");
    }
}

class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("MoMo", "Không dùng tiền mặt");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + formatter.format(amount).replace(',', '.') + " qua MoMo.");
    }
}

class Order {
    private String customerName;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, double amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        paymentMethod.pay(amount);
        System.out.println();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Order order1 = new Order("An", 200000, new CreditCardPayment());
        Order order2 = new Order("Bình", 150000, new PayPalPayment());
        Order order3 = new Order("Chi", 100000, new CashPayment());
        Order order4 = new Order("Dũng", 300000, new MoMoPayment());

        order1.checkout();
        order2.checkout();
        order3.checkout();
        order4.checkout();
    }
}