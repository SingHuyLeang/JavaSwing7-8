package Model;
public class ProductModel {
    int id;
    String name;
    int qty;
    double price;
    double total;
    int discount;
    String image;

    public ProductModel(String name, int qty, double price, double total, int discount, String image) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.discount = discount;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public int getDiscount() {
        return discount;
    }

    public String getImage() {
        return image;
    }
        
}
