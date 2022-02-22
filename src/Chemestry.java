public class Chemestry extends Product {//Liskov Substitution Principle


    public Chemestry(String name, int costPrice, String date, Type type) {
        super(name, costPrice, date, type);
    }

    @Override
    public int exposePrice() {
        //open-closed principle (Solid)
        int price = (costPrice * 15) / 100;
        return price;
    }
}
