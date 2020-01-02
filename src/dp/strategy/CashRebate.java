package dp.strategy;

public class CashRebate implements SuprStrategy {
    private double rebate = 1d;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
