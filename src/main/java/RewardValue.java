public class RewardValue {
    
    final double cashValue;
    final double milesValue;
    
    // Constructor that accepts a cash value
    public RewardValue(double cashValue, double milesValue) {
        if (cashValue >= 0)  {
            this.cashValue = cashValue;
            this.milesValue = convertCashToMiles(cashValue);
        } else if (milesValue >= 0) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Either cashValue or milesValue must be provided");
        }
    }
    
    // Constructor that accepts a a value in miles
    public RewardValue(double milesValue) {
        
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    } 
        
    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    private double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }
    // Method to get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}
