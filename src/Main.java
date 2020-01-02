import dp.builder.Builder;
import dp.builder.ConcreteBuilderB;
import dp.builder.Director;
import dp.builder.Product;
import dp.clone.Resume;
import dp.clone.WorkExperience;
import dp.decorator.ConcreteComponent;
import dp.decorator.ConcreteDecoteB;
import dp.decorator.ConcreteDecotorA;
import dp.strategy.CashFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

          Scanner sc=new Scanner(System.in);
//        String str= sc.next();
//        CashFactory cf=new CashFactory(str);
//        System.out.print(cf.getResult(1000d));
//        ConcreteComponent c=new ConcreteComponent();
//        ConcreteDecotorA d1=new ConcreteDecotorA();
//        ConcreteDecoteB d2=new ConcreteDecoteB();
//
//        d1.setComponent(c);
//        d2.setComponent(d1);
//        d2.operation();

//        Resume a=new Resume("大鸟");
//        a.setPersionInfo("男","29");
//        a.setWorkExperience("1998","XX");
//
//        try {
//            Resume b= (Resume) a.clone();
//            b.setWorkExperience("1999","YY");
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        Resume c=(Resume) a.clone();
//        c.setWorkExperience("2000","ZZ");
//
//        a.dispaly();
//        c.dispaly();

        Builder builder= new ConcreteBuilderB();
        Director director=new Director();
        director.create(builder);
        Product product=builder.getResult();
        product.show();
    }

}
