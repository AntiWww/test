import java.math.BigDecimal;

public class Fruit {

    private String name; //名称

    private int price; //价格

    private int catty; //斤数

    protected double discount = 1.0;//折扣

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setCatty(int catty) {
        if(catty <= 0)
            throw new IllegalArgumentException("购买斤数必须是 >= 0 的整数");
        this.catty = catty;
    }

    public void setDiscount(double discount) {
        if(discount < 0 || discount > 1)
            throw new IllegalArgumentException("折扣必须是0~1之间的小数");
        this.discount = discount;
    }

    public BigDecimal getPayment() {
        BigDecimal price = new BigDecimal(this.price);
        BigDecimal catty = new BigDecimal(this.catty);
        BigDecimal discount = new BigDecimal(this.discount);
        return price.multiply(catty).multiply(discount);
    }
}
