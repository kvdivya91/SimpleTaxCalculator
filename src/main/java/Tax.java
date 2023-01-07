public class Tax {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculateTax(double income) {
        if(income <= 350000) {
            return 0;
        }
        if(income <= 625000) {
            return (income - 350000) * (0.09);
        }
        if(income <= 1200000) {
            return (income - 625000) * (0.18) + calculateTax(625000);
        }
        return (income - 1200000) * (0.35) + calculateTax(1200000);
    }
}
