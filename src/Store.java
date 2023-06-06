import java.util.ArrayList;
import java.util.Scanner;
record OrderItem (int quantity, ProductForSale product) {



}
public class Store {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new Fruit("banana", 5.99, "So delicious banana"));
        storeProducts.add(new Fruit("peach", 6.99, "So delicious peach"));
        storeProducts.add(new Vegetables("tomato", 7.99, "So delicious tomato"));
        storeProducts.add(new Vegetables("carrot", 1.99, "So delicious carrot"));


        listProducts();

        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);
        

        System.out.println("\nOrder2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 2, 6);
        addItemToOrder(order2, 3, 15);
        printOrder(order2);


    }
    public static void addItemToOrder (ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }
    public static void listProducts () {

        for(var item : storeProducts) {
            System.out.print("-".repeat(30));
            item.showDetails();
        }

        System.out.println("");
    }
    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }


}