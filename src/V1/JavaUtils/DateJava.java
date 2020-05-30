package V1.JavaUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateJava {

        public static void main(String[] args) {
            /*Instant instant = Instant.parse("2014-12-03T10:15:30.00Z");
            instant = instant.truncatedTo(ChronoUnit.DAYS);
            System.out.println(instant);*/

            dateFormatter(new Date());

        }

    private static Date dateFormatter(Date startDate)  {

        final DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date formattedDate = null;
        //  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            formattedDate = format.parse(format.format(startDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate;
    }
    }

