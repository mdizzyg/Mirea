package ПР4;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.S, 1500, "Красный"),
                new Pants(Size.M, 2000, "Черный"),
                new Skirt(Size.XS, 1200, "Синий"),
                new Tie(Size.L, 700, "Зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
