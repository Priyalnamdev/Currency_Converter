
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined exchange rates (1 USD equivalent)
        double usdToEur = 0.92; // USD to Euro
        double usdToInr = 83.10; // USD to Indian Rupee
        double usdToGbp = 0.74; // USD to British Pound
        double usdToAud = 1.55; // USD to Australian Dollar

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Choose the currency to convert FROM:");
        System.out.println("1. USD");
        System.out.println("Choose the currency to convert TO:");
        System.out.println("2. EUR");
        System.out.println("3. INR");
        System.out.println("4. GBP");
        System.out.println("5. AUD");

        System.out.print("Enter your choice for FROM currency (e.g., 1 for USD): ");
        int fromCurrency = scanner.nextInt();

        if (fromCurrency != 1) {
            System.out.println("Currently, only conversions FROM USD are supported.");
            return;
        }

        System.out.print("Enter your choice for TO currency (e.g., 2 for EUR): ");
        int toCurrency = scanner.nextInt();

        System.out.print("Enter the amount in USD to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;
        String currencyName = "";

        switch (toCurrency) {
            case 2:
                convertedAmount = amount * usdToEur;
                currencyName = "EUR";
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                currencyName = "INR";
                break;
            case 4:
                convertedAmount = amount * usdToGbp;
                currencyName = "GBP";
                break;
            case 5:
                convertedAmount = amount * usdToAud;
                currencyName = "AUD";
                break;
            default:
                System.out.println("Invalid TO currency choice.");
                return;
        }

        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, currencyName);
        scanner.close();
    }
}
