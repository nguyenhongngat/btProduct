public class Drinks extends Product{
    private double volume;
    private String bottleType;

    public Drinks(int id, String name, double price, int quantity, Category category, double volume, String bottleType) {
        super(id, name, price, quantity, category);
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public Drinks(int id, String name, double price, int quantity, double volume, String bottleType) {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getBottleType() {
        return bottleType;
    }

    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }
}
