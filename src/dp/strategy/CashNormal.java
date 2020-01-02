package dp.strategy;

public class CashNormal implements SuprStrategy {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
