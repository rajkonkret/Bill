public class Receipt implements Bill {
    private double price;
    private String product;

    Receipt(double price, String product) {
        this.price = price;
        this.product = product;
    }


    @Override
    public void printBill() {
        System.out.println(product + " " + price + " PLN");

    }
}
