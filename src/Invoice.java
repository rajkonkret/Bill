public class Invoice implements Bill {
    private double price;
    private String product;
    private String name;
    private String surname;
    private int id;

    Invoice(
            double price, String product,
            String name,
            String surname,
            int id
    ) {
        this.price = price;
        this.product = product;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public void printBill() {
        System.out.println("Faktura nr: " + id + "\n" + name + " " + surname);
        System.out.println(product + " " + price + " PLN");
    }
}
