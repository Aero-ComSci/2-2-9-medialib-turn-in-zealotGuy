import java.util.Calendar;

public class LastModified {
    public static String getDateTime() {
        Calendar cal = Calendar.getInstance();
        String dateTime = cal.getTime().toString();
        return dateTime;
    }
}
