package dp.builder;

public class ConcreteBuilderA implements Builder {
    Product product=new Product();
    @Override
    public void addPartA() {
        product.add("零件A");
    }

    @Override
    public void addPartB() {
        product.add("零件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
