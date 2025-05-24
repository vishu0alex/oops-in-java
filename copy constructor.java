class Product {
    int x;
    int y;

    // Regular constructor
    Product(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Product(Product other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void pro() {
        System.out.println("pro = " + (x * y));
    }
}

public class Main {
    public static void main(String[] args) {
        Product obj1 = new Product(5, 6);
        Product obj2 = new Product(obj1);  // ✅ Separate object with same values

        obj2.x = 10;
        obj1.pro();  // Unaffected: pro = 30
        obj2.pro();  // Changed: pro = 60
    }
}
