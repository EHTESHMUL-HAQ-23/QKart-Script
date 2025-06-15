package qkart;

public class MainTestRunner {
    public static void main(String[] args) {
        BaseTest base = new BaseTest();
        base.setup();

        LoginTest login = new LoginTest();
        login.driver = base.driver;
        login.loginTest();

        AddToCartTest cart = new AddToCartTest();
        cart.driver = base.driver;
        try {
            cart.addToCart();
        } catch (Exception e) {
            e.printStackTrace();
        }

        CheckoutTest checkout = new CheckoutTest();
        checkout.driver = base.driver;
        checkout.checkout();

        base.teardown();
    }
}