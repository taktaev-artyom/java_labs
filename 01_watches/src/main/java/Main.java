import Watches.HMWatch;
import Watches.HMSWatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------OUTPUT");
        HMWatch casio_watch = new HMWatch("Casio", 5495.00);
        HMSWatch citizen_watch = new HMSWatch("Citizen", 22149.00);
        System.out.println("Brand " + casio_watch.getBrand() + "(no second hand) costs " +
         casio_watch.getPrice() + " roubles.");
        System.out.println("Brand " + citizen_watch.getBrand() + " costs " +
         citizen_watch.getPrice() + " roubles."); 
        try {
            casio_watch.setTime(11, 50, 0);
            //casio_watch.setTime(13, 50, 0);
            //casio_watch.setTime(11, 60, 0);
            casio_watch.addTime(2, 13, 0);
            citizen_watch.setTime(11, 20, 15);
            //citizen_watch.setTime(11, 20, 65);
            citizen_watch.addTime(2, 13, 46);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Time on " + casio_watch.getBrand() + " is " + casio_watch.getTime());
        System.out.println("Time on " + citizen_watch.getBrand() + " is " + citizen_watch.getTime());
        System.out.println("-------------------------------------------------------------------------------OUTPUT");
    }
}
