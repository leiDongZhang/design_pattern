package dp.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts=new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("产品输出：");
        for(String str:parts)
            System.out.println(str);
    }
}
