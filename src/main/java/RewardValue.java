class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(double miles, boolean isMiles) {
        this.miles = miles;
    }

    double getCashValue() {
        return cash + 0.0035*miles;
    }

    double getMilesValue() {
        return miles + cash/0.0035;
    }
}