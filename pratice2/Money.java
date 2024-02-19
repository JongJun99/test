package qwerty.pratice2;

public class Money {
    protected String unit;
    protected double notified;
    protected double buy;
    protected int rate;
    protected int limit;

    public Money(String unit, double notified, double buy, int rate, int limit) {
        this.unit = unit;
        this.notified = notified;
        this.buy = buy;
        this.rate = rate;
        this.limit = limit;
    }

    public String getUnit() {
        return unit;
    }

    public double getNotified() {
        return notified;
    }

    public double getBuy() {
        return buy;
    }

    public int getRate() {
        return rate;
    }

    public int getLimit() {
        return limit;
    }
}
