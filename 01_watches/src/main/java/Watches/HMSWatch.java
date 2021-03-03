package Watches;

public class HMSWatch extends HMWatch {
    protected int sec;

    public HMSWatch(String brand, double price) {
        super(brand, price);
        this.sec = 0;
    }

    public void setTime(int hour, int min, int sec) throws Exception {
        super.setTime(hour, min, sec);
        if (sec < 0 || sec > 59)
            throw new Exception("Wrong value for seconds.\n");
        this.sec = sec;
    }

    public void addTime(int hour, int min, int sec) {
        super.addTime(hour, min, 0);
        if (this.sec + sec > 59) {
            this.min = (this.min + (this.sec + sec) / 60) % 60;
        }
        this.sec = (this.sec + sec) % 60;
    }

   public String getTime() {
        return super.getTime() + ":" + (this.sec < 10 ? "0" + this.sec : this.sec);
    }
}
