import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
    }

    private static void demo1(){
        Fruit f1 = new Fruit("苹果", 8);
        f1.setCatty(10);

        Fruit f2 = new Fruit("草莓", 13);
        f2.setCatty(5);

        BigDecimal result = f1.getPayment().add(f2.getPayment());
        System.out.println("购买总价：" + result.doubleValue());
    }

    private static void demo2(){
        Fruit f1 = new Fruit("苹果", 8);
        f1.setCatty(10);

        Fruit f2 = new Fruit("草莓", 13);
        f2.setCatty(5);

        Fruit f3 = new Fruit("芒果", 20);
        f3.setCatty(3);

        BigDecimal result = f1.getPayment().add(f2.getPayment()).add(f3.getPayment());
        System.out.println("购买总价：" + result.doubleValue());
    }

    private static void demo3(){
        Fruit f1 = new Fruit("苹果", 8);
        f1.setCatty(10);

        Fruit f2 = new Fruit("草莓", 13);
        f2.setCatty(5);
        f2.setDiscount(0.8);

        Fruit f3 = new Fruit("芒果", 20);
        f3.setCatty(3);

        BigDecimal result = f1.getPayment().add(f2.getPayment()).add(f3.getPayment());
        System.out.println("购买总价：" + result.doubleValue());
    }

    private static void demo4(){
        Fruit f1 = new Fruit("苹果", 8);
        f1.setCatty(10);

        Fruit f2 = new Fruit("草莓", 13);
        f2.setCatty(5);
        f2.setDiscount(0.8);

        Fruit f3 = new Fruit("芒果", 20);
        f3.setCatty(3);

        BigDecimal result = f1.getPayment().add(f2.getPayment()).add(f3.getPayment());
        if(result.doubleValue() > 100){
            result = result.subtract(new BigDecimal(10));
        }
        System.out.println("购买总价：" + result.doubleValue());
    }
}
