package dp.observe;

public class Test {
    public static void main(String[] args){
        ConcreteSubjectA concreteSubjectA=new ConcreteSubjectA();

        Observe observe=new ObserveA("张三");
        Observe observe1=new ObserveA("李四");
        concreteSubjectA.addOberve(observe);
        concreteSubjectA.setState("老板回来了");
    }
}
