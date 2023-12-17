import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
    public String stampaFull(OffsetDateTime data1) {
        return data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String stampaMedium(OffsetDateTime data1) {
        return data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public String stampaShort(OffsetDateTime data1) {
        return data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
