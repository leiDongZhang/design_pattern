package dp.decorator;

public class ConcreteDecotorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("具体装饰对象A的操作");
    }
}
