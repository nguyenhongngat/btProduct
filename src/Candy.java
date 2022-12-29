public class Candy extends Product {
    private int weight;

    public Candy(int id, String name, double price, int quantity, Category category, int weight) {
        super(id, name, price, quantity, category);
        this.weight = weight;
    }

    public Candy(int id, String name, double price, int quantity, int weight) {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
