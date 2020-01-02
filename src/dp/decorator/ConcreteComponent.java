package dp.decorator;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.print("具体对象的操作");
    }
}
