public class Vegetables extends ProductForSale{

    public Vegetables(String type, double price, String description) {
        super(type,price, description);
    }
    @Override
    public void showDetails() {
        System.out.println("This " + type + " is so fresh");
        System.out.printf("The price of the " + type + " is $%6.2f %n", price);
        System.out.println(description);
    }
}
