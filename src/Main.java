import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSeller sellerKarel =
                new CarrotSeller("Karel Dvořák", LocalDate.of(1985, 5, 15));
        CarrotSeller sellerAlena =
                new CarrotSeller("Alena Karásková", LocalDate.of(1980, 12, 5));
        System.out.println("Prodejce 1: " + sellerKarel.getName());
        System.out.println("Prodejce 2: " + sellerAlena.getName() + " ("+ sellerAlena.getBirthDate() + ")");
    }
}