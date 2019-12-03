public class Receipt implements Bill {
    private double price;
    private String product;
    private int id;

    Receipt(
            double price,
            String product,
            int id
    ) {
        this.price = price;
        this.product = product;
        this.id = id;
    }


    @Override
    public void printBill() {
        System.out.println("Paragon nr: " + id + "\n" + product + " " + price + " PLN");

    }
}
