public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("NormalBurger =" + " " + bun + ", " + meat + " ," + cheese + ", " + greens + " ," + mayonnaise);

    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("DietBurger = " + " " + bun + ", "  + meat + "," + cheese + " ," + greens);
    }

    public Burger(int doublemeat) {
        System.out.println("DoublemeatBurger =" + " " + "meat" + doublemeat);
    }
    public void BurgerOrder() {
        System.out.println();
    }
}

