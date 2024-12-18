package ПР6;

public interface Printable_shop {
    void print();
}
// Класс Shop
 class Shop implements Printable {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("Shop Name: " + name);
        System.out.println("Shop Address: " + address);
    }
}

// Главный класс
 class Test {
    public static void main(String[] args) {
        Shop shop = new Shop("Supermarket", "123 Main St");
        shop.print();
    }
}


