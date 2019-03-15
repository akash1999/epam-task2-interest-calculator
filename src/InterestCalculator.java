public class InterestCalculator {
    /***
     * 
     * @param principal principal amount
     * @param rate interest rate per year in percentage
     * @param time time period in years
     * @return interest earned
     */
    public double calculateSimpleInterest(double principal, double rate, int time) {
        double simpleInterest = principal + (principal * (rate/100) * time);
        return (simpleInterest - principal);
    }
    
    /***
     * 
     * @param principal principal amount
     * @param rate interest rate per year in percentage
     * @param time time period in years
     * @return interest earned
     */
    public double calculateCompoundInterest(double principal, double rate, int time) {
        double compoundInterest = principal * (double) Math.exp( rate * time );
        return (compoundInterest - principal);
    }
}
