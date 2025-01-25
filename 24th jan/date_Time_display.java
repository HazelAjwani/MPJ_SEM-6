import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class display 
{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}
