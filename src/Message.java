import java.util.Date;

/**
 * Created by mdb17 on 2/2/2017.
 */
public class Message {
    public Message(String number, String message, long time) {
        num = number;
        mes = message;
        tim = time;
    }

    public Date getTime() {
        return time;
    }

    public String getMessage() {
        return mes;
    }

    public String getNumber() {
        return num;
    }

    public Long getSystemTime() {
        return Main.time;
    }


    public static String num;
    public static String mes;
    public static long tim;
    private Date time;
}
