public class Clothes extends Product implements Texstile {//Liskov Substitution Principle
    Texst texst;

    public Texst getTexst() {
        return texst;
    }

    public Clothes(String name, int costPrice, String date, Type type, Texst texst) {
        super(name, costPrice, date, type);
        this.texst = texst;
    }

    @Override
    public int exposePrice() {
        //open-closed principle (Solid)
        int price = (costPrice * 40) / 100;
        return price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", costPrice=" + costPrice +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public void defineTexstile(Clothes clothes) {
        System.out.println("Данная вещь - " + clothes.getName() + " сделана из " + clothes.getTexst());
    }
}
