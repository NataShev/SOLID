import java.util.List;

public class Shop {

    public static void main(String[] args) {
        List<Product> productList = AddProduct();
        determinationOfFatContent(productList);
        filterClothesProduct(productList);
        for (Product pr : productList) {
            bestBeforeDate(pr);
        }
        clothesTexst(productList);

    }

    public static List<Product> AddProduct() {
        List<Product> range = List.of(
                new MilkProduct("Вишневый йогурт", 65, "19.02.2022", Type.MILK, 3.2),
                new MilkProduct("Великорожский кефир", 52, "18.02.2022", Type.MILK, 1.5),
                new MilkProduct("Молоко Весёлая Буренка", 99, "17.02.2022", Type.MILK, 0.5),
                new Chemestry("Доместос", 150, "15.10.2021", Type.CHEMESTRY),
                new Chemestry("СодаЭффект", 65, "18.09.2021", Type.CHEMESTRY),
                new Chemestry("Стиральный порошок Tide", 159, "15.08.2021", Type.CHEMESTRY),
                new Clothes("Рубашка", 888, "14.02.2020", Type.CLOTHES, Texst.COTTON),
                new Clothes("Платье", 2000, "13.10.2019", Type.CLOTHES, Texst.POLIESTER),
                new Clothes("Кофта", 5000, "7.01.2020", Type.CLOTHES, Texst.VISKOZA));
        return range;
    }//(DRY)

    public static void determinationOfFatContent(List<Product> productList) {
        for (Product product : productList) {
            if (Type.MILK.equals(product.getType())) {
                MilkProduct milkProduct = (MilkProduct) product;
                milkProduct.fatContentOfMilk();
            }
        }
    }

    public static void filterClothesProduct(List<Product> productList) {
        productList.stream()
                .filter(product -> Type.CLOTHES.equals(product.getType()))
                .forEach(System.out::println);
    }

    public static void bestBeforeDate(Product product) {
        BestBeforeDate bestBeforeDate = new BestBeforeDate();
        bestBeforeDate.expirationDateCheck(product.getDate());
    }

    public static void clothesTexst(List<Product> list) {
        for (Product name : list) {
            if (Type.CLOTHES.equals(name.getType())) {
                Clothes clothes = (Clothes) name;
                clothes.defineTexstile(clothes);
            }
        }


    }
}
