import java.util.Scanner;

public class Invoice implements Bill {
    private double price;
    private String product;
    private String name;
    private String surname;
    private int id;

    Invoice(
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.next();
        name = name;
        System.out.println("Podaj nazwisko");
        String surname = scanner.next();
        surname = surname;
        System.out.println("Faktura nr: " + id + "\n" + name + " " + surname);
        System.out.println(product + " " + price + " PLN");
    }
}
