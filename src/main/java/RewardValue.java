class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    double getCashValue() {
        return cash + 0.0035*miles;
    }

    int getMilesValue() {
        return (int)(miles + cash/0.0035);
    }
}