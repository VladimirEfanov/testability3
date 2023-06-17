public class CreditPaymentService {
    public static double calculateMonthlyPayment(int sumCredit, int years, double percentCredit) {
        double monthlyPercent = percentCredit / 100 / 12;
        int months = years * 12;
        double annuityCoefficient = (monthlyPercent * Math.pow(1 + monthlyPercent, months)) /
                (Math.pow(1 + monthlyPercent, months) - 1);
        return (int)sumCredit * annuityCoefficient;
    }
}