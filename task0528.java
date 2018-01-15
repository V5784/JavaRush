import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy" );
        System.out.println(formatForDateNow.format(dateNow));
    }
}
