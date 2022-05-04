import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class CalculatorTest {

    @Test (priority = 0, groups = {"Regression"})
    public void testAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(2, 1), "2 + 1 should equal 3");
    }

    @Test

    void testSubstraction() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.substract(2, 1), "2 - 1 should equal 1");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }
}
