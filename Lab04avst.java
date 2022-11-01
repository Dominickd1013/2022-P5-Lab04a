public class Lab04avst {
    public static void main(String[] args) {
        System.out.println("Lab04a, Student Version\n");

        // Variables
        double principal = 250000; // P
        double annualRate = 4.85;
        double monthlyRate = (annualRate / 100) / 12; // R
        double numYears = 30;
        double numMonths = 360; // N

        // Monthly payment
        double numerator = (monthlyRate * Math.pow(1 + monthlyRate, numMonths)); // Gives me the numerator
        double denominator = (Math.pow(1 + monthlyRate, numMonths) - 1); // Gives me the denominator
        double monthlyPaymentUnRounded = (((numerator / denominator) * principal)); // The monthly payment
        double monthlyPaymentRounded = (Math.ceil(monthlyPaymentUnRounded * 100) / 100);

        // Total payments
        double totalPaymentUnRounded = (monthlyPaymentUnRounded * numMonths);
        double totalPaymentRounded = (Math.ceil(totalPaymentUnRounded * 100) / 100);

        // Total interest
        double totalInterestUnRounded = (totalPaymentUnRounded - principal);
        double totalInterestRounded = (Math.ceil(totalInterestUnRounded * 100) / 100);


        System.out.print("Principal:        $");
        System.out.print(principal);
        System.out.println();
        System.out.print("Annual Rate:      ");
        System.out.print(annualRate);
        System.out.println("%");
        System.out.print("Number of Years:  ");
        System.out.print(numYears);
        System.out.println();
        System.out.print("Monthly Payment:  $");
        System.out.print(monthlyPaymentRounded);
        System.out.println();
        System.out.print("Total Payments:   $");
        System.out.print(totalPaymentRounded);
        System.out.println();
        System.out.print("Total Interest:   $");
        System.out.print(totalInterestRounded);


    }
}