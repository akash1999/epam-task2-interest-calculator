import org.junit.Test;
import static org.junit.Assert.*;

import calculator.InterestCalculator;

public class InterestCalculatorTest {
    
    @Test
    public void testSimpleInterest() {
        InterestCalculator interestCalculator = new InterestCalculator();
        
        double result;
        
        result = interestCalculator.calculateSimpleInterest(1000, 6, 5);
        assertEquals(300, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(1000, 0, 5);
        assertEquals(0, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(0, 100, 5);
        assertEquals(0, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(-1000, 6, 5);
        assertEquals(-300, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(1000, 6, 0);
        assertEquals(0, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(1000, -6, 5);
        assertEquals(-300, result, 0.0000001);
        
        result = interestCalculator.calculateSimpleInterest(1000, 6, -5);
        assertEquals(-300, result, 0.0000001);
    }
    
    @Test
    public void testCompoundInterest() {
        InterestCalculator interestCalculator = new InterestCalculator();
        
        double result;
        
        result = interestCalculator.calculateCompoundInterest(1000, 6, 5);
        assertEquals(338.23, result, 0.01);
        
        result = interestCalculator.calculateCompoundInterest(-1000, 6, 5);
        assertEquals(-338.23, result, 0.01);
        
        result = interestCalculator.calculateCompoundInterest(1000, -6, 5);
        assertEquals(0, result, 0.01);
        
        result = interestCalculator.calculateCompoundInterest(1000, 6, -5);
        assertEquals(0, result, 0.01);
        
        result = interestCalculator.calculateCompoundInterest(1000, 0, 5);
        assertEquals(0, result, 0.01);
    }
}
