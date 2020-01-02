package dp.decorator;

public class ConcreteDecoteB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("具体装饰对象B的操作");
    }
}
