package classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR, 2010);
        calendar.set(calendar.MONTH, Calendar.MARCH);
        calendar.set(calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
