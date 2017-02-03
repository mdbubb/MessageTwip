import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mdb17 on 2/2/2017.
 */
public class MessageList {
    public void solve() {
        if (Main.ans.equals("1")) {
            Main.Names.add(Main.mes);
            Main.numbers.add(Main.num);
        } else if (Main.ans.equalsIgnoreCase("2")) {
            Main.Names.remove(Main.num1);
            Main.numbers.remove(Main.num1);
            for (int i = 0; i < Main.Names.size(); i++) {
                DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy; HH:mm");
                Date date = new Date();
                System.out.println("Here are your Conversations now: ");
                for (int jj = 0; jj < Main.Names.size(); jj++) {
                    System.out.println("Your message to" + "(" + Main.numbers.get(jj) + ")" + "is " + Main.Names.get(jj) + " at " + date);
                }
                break;

            }

        }

    }
}
