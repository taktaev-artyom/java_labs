package Watches;

public class HMWatch extends BaseWatch {
    protected int hour;
    protected int min;

    public HMWatch(String brand, double price) {
        super(brand, price);
        this.hour = 0;
        this.min = 0;
    }

    public void setTime(int hour, int min, int sec) throws Exception {
        if (hour < 0  || hour > 11)
            throw new Exception("Wrong value for hours.\n");
        if (min < 0  || min > 59)
            throw new Exception("Wrong value for minutes.\n");
        this.hour = hour;
        this.min = min;
    }

    public void addTime(int hour, int min, int sec) {
        if (this.min + min > 59) {
            this.hour = (this.hour + hour + (this.min + min) / 60) % 12;
        } else {
            this.hour = (this.hour + hour) % 12;
        }
        this.min = (this.min + min) % 60;
    }

    public String getTime() {
        return new String((this.hour < 10 ? "0" + this.hour : this.hour) + ":" + (this.min < 10 ? "0" + this.min : this.min));
    }

}
