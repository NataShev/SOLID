public class MilkProduct extends Product implements FatContent {//Liskov Substitution Principle
    private double fatContent;

    public double getFatContent() {
        return fatContent;
    }

    public MilkProduct(String name, int costPrice, String date, Type type, double fatContent) {
        super(name, costPrice, date, type);
        this.fatContent = fatContent;
    }

    @Override
    public int exposePrice() {
        //open-closed principle (Solid)
        int price = (costPrice * 30) / 100;
        return price;
    }

    @Override
    public void fatContentOfMilk() {

        System.out.println("Жирность молока в этом продукте составляет:" + getFatContent());
    }
}

