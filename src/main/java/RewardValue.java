public class RewardValue {
    private double cashValue;
    private int milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = cashConversion(milesValue);
    }

    public double cashConversion(int milesValue) {
        return milesValue * 0.0035;

    }
    public double milesConversion(double cashValue) {
        return cashValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesConversion(this.cashValue);
    }
}
