public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment1 = (int) CreditPaymentService.calculateMonthlyPayment(1000000, 1, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPayment1 + " рублей");

        int monthlyPayment2 = (int) CreditPaymentService.calculateMonthlyPayment(1000000, 2, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2 + " рублей");

        int monthlyPayment3 = (int) CreditPaymentService.calculateMonthlyPayment(1000000, 3, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3 + " рублей");
    }
}