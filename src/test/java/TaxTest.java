import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TaxTest {

    @Test
    public void givenIncomeAbove2500000_whenCalculateTax_thenReturnTax() {
        double income = 2500000.0;
        Tax t = new Tax();
        double actualTax = t.calculateTax(income);
        double expectedTax = 583250.0;
        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void givenIncomeBelow350000_whenCalculateTax_thenReturnZero() {
        double income = 30000.0;
        Tax t = new Tax();
        double actualTax = t.calculateTax(income);
        double expectedTax = 0.0;
        assertEquals(expectedTax, actualTax);
    }
}
