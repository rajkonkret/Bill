import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Paragon czy faktura?(p/f)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("F")) {


            Invoice invoice = new Invoice(10.0, "Kawa", 1);
            Bill bill = invoice;
            bill.printBill();

        } else {
            Receipt receipt1 = new Receipt(10.0, "Kawa", 1);
            Bill bill = receipt1;
            bill.printBill();
        }
    }
}
