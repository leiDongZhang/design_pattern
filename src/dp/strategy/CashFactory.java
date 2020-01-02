package dp.strategy;

import java.util.Scanner;

public class CashFactory {
    SuprStrategy ss=null;
    public   CashFactory(String type){
        type="dp.strategy."+type;
        try {
            ss=(SuprStrategy) Class.forName(type).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

//        switch (type){
//            case "mormal":
//                ss=new CashNormal();
//                break;
//            case "Rebate":
//                double rebate=0.8;
//                ss=new CashRebate(rebate);
//                break;
//            case "Return":
//                double condition=300d;
//                double retrun=100d;
//                ss=new CashReturn(condition,retrun);
//                break;
//        }
    }
    public double getResult(double money){
       return ss.acceptCash(money);
    }
}
