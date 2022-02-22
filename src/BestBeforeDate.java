import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BestBeforeDate {
    Product product;
    Date today = new Date();

    public void setProduct(Product product) {
        this.product = product;
    }

    public void expirationDateCheck(String string) {
        Date dateProduct = null;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dateProduct = dateFormat.parse(string);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (dateProduct.equals(today)) {
            System.out.println("Сегодня последний день срока годности, продать товар со скидкой 40%");
        } else if (dateProduct.before(today)) {
            System.out.println("У товара хороший срок годности");
        } else if (string.equals("25.04.2022")) {
            System.out.println("У товара закончился срок годности, товар нужно утилизировать");
        }
    }
} // Принцип единственной ответсовенности (SRP) SOLID
