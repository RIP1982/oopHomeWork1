package data;

public abstract class Drinks {
    private String typeOfDrink;
    private int volume;

    public String getTypeOfDrink() {
        return this.typeOfDrink;
    }

    public void setTypeOfDrink(String name) {
        this.typeOfDrink = name;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
