// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal   = 250000; // P
        double annualRate  = 4.85;
        double monthlyRate = (annualRate / 100) / 12; // R
        double numYears    = 30;
        double numMonths   = 360; // N

        // Monthly payment output

        double numerator      = (monthlyRate * Math.pow(1 + monthlyRate, numMonths)); // gives me the numerator
        double denominator    = (Math.pow(1 + monthlyRate, numMonths) - 1) ; // gives me the denominator
        double monthlyPayment = (((numerator/denominator) * principal)); // The monthly payment

        // Total payments

        double totalPayment = (monthlyPayment  * numMonths);

        // Total interest

        double totalInterest = (totalPayment - 360 * (monthlyPayment * monthlyRate));




        System.out.println(principal);
        System.out.println(annualRate);
        System.out.println();
        System.out.println(monthlyPayment);
        System.out.println(totalPayment);
        System.out.println(totalInterest);

    }
}

