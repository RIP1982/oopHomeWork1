package data;

public class HotDrink extends Drinks{
    private String name;
    private String additive;
    private int temperature;
    private double price;

    public HotDrink(String typeOfDrink, String name, int volume, String additive, int temperature, double price) {
        super.setTypeOfDrink(typeOfDrink);
        this.name = name;
        super.setVolume(volume);
        this.additive = additive;
        this.temperature = temperature;
        this.price = price;
    }

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditive() {
        return this.additive;
    }

    public void setAdditive(String additive) {
        this.additive = additive;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotDrink {typeOfDrink='" + getTypeOfDrink() + '\'' +
                ", name='" + name + '\'' + " volume=" + getVolume() +
                ", additive='" + additive + '\'' +
                ", temperature=" + temperature +
                ", price=" + price +
                '}';
    }
}
