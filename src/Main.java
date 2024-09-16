class MonthlyBalance {
    public static void main(String[] args) {

        double balance = 5000.0;
        double yearlyRate = 0.17;
        double monthlyRate = yearlyRate / 12;

        double oneMonthInterest = balance * monthlyRate;
        double oneMonthBalance = balance + oneMonthInterest;

        double twoMonthInterest = oneMonthBalance * monthlyRate;
        double twoMonthBalance = oneMonthBalance + twoMonthInterest;

        System.out.println("Your Balance Is: $" + balance);
        System.out.println("Your interest due after one month is: $" + oneMonthInterest);
        System.out.println("Your balance after one month is: $" + oneMonthBalance);
        System.out.println("Your interest due after two months is: $" + twoMonthInterest);
        System.out.println("Your balance after two months is: $" + twoMonthBalance);
    }
}