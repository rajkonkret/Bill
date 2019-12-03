public class Invoice implements Bill {
    private double price;
    private String product;
    private String name;
    private String surname;

    Invoice(int price, String product, String name, String surname) {
        this.price = price;
        this.product = product;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printBill() {
        System.out.println();
    }
}
