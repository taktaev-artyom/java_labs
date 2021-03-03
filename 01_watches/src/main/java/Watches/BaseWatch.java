package Watches;

public abstract class BaseWatch {
    private String brand;
    private double price;

    public BaseWatch(String brand, double price) {
        this.price = price;
        this.brand = brand;
    }

    public abstract void setTime(int hour, int min, int sec) throws Exception;
    public abstract void addTime(int hour, int min, int sec);
    public abstract String getTime();

    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }
}
