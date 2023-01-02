public class BurgerMain {
    public static void main(String[] args) {
        Burger normalburger = new Burger("bun", "meat","cheese","greens","mayonnaise");
        Burger dietburger = new Burger("bun","meat","cheese","greens");
        Burger doublemeat = new Burger(2);

        normalburger.BurgerOrder();

    }
}
