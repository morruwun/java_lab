package defence;

public class Alert extends Defence{
    private static boolean alert;
    public Alert(boolean alert) {
        this.alert = alert;
    }
    public static boolean enableAlert() {
        alert = true;
        return alert;
    }
    public static boolean disableAlert() {
        alert = false;
        return alert;
    }
}
