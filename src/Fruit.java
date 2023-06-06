public class Fruit extends ProductForSale{

    public Fruit(String type, double price, String description) {
        super(type,price, description);
    }
    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful specimen");
        System.out.printf("The price of the " + type + " is $%6.2f %n", price);
        System.out.println(description);
    }
}
