public class Product {
    String name;
    int costPrice;
    String date;
    Type type;

    public Product(String name, int costPrice, String date, Type type) {
        this.name = name;
        this.costPrice = costPrice;
        this.date = date;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public String getDate() {
        return date;
    }

    public Type getType() {
        return type;
    }

    public int exposePrice() {
        //open-closed principle (Solid)
        int price = (costPrice * 20) / 100;
        return price;
    }
}
