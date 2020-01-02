package dp.strategy;

public class CashReturn implements SuprStrategy {
    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
       if(money>moneyCondition)
           money=money-moneyReturn;
        return money;
    }
}
