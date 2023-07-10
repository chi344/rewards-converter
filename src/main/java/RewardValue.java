//import RewardsConverter.java;

public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor accepting a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor accepting a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }


}
