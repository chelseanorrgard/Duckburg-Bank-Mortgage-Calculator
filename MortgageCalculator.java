import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for principal amount
        System.out.print("Enter principal amount (loan amount): ");
        double principal = scanner.nextDouble();

        // Prompt user for loan term in months
        System.out.print("Enter loan term in months: ");
        int loanTerm = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate and display monthly installment
        try {
            double monthlyInstallment = calculateMonthlyInstallment(principal, loanTerm);
            System.out.printf("Monthly installment: %.2f%n", monthlyInstallment);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Calculates the monthly installment of the mortgage repayment.
     * 
     * @param principal The principal amount (loan amount received by the customer).
     * @param loanTerm  The loan term in months.
     * @return The monthly installment amount.
     * @throws IllegalArgumentException if the loan term is 0 or negative.
     */
    public static double calculateMonthlyInstallment(double principal, int loanTerm) {
        if (loanTerm <= 0) {
            throw new IllegalArgumentException("Loan term must be a positive integer.");
        }
        return principal / loanTerm + principal / 240;
    }
}
