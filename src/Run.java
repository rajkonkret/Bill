public class Run {
    public static void main(String[] args) {
        Receipt receipt1 = new Receipt(10.0, "Kawa");
        Bill[] bills = {receipt1};
        bills[0].printBill();
    }
}
