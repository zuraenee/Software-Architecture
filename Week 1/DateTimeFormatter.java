import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Ananda Zuraenee Sudarmaji : " + dtf.format(now));

    }
}
