package dp.builder;

public class ConcreteBuilderB implements Builder {
    Product product=new Product();
    @Override
    public void addPartA() {
        product.add("零件xx");
    }

    @Override
    public void addPartB() {
        product.add("零件yy");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
