public class TaxCalculator {
    public static void main(String[] args) {
        Double income = 2500000.0;
        Person p = new Person();
        p.setIncome(income);

        Tax t = new Tax();
        System.out.println("Tax: " + t.calculateTax(p.getIncome()));
    }
}
