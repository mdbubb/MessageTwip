import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static ArrayList Names = new ArrayList();
    public static ArrayList numbers = new ArrayList();
    public static Long time;
    public static String ans;
    public static String mes;
    public static int pos;
    public static String num;
    public static String num1;

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        loop1:
        while (true) {
            System.out.println("Would you like to send a message (1), delete a message(2), move a message (3), display your messages (4), or exit (5)");
            Main.ans = input.next();
            if (Main.ans.equals("1")) {
                System.out.println("Enter the phone number you want the message to go to");
                Main.num = input.next();
                System.out.println("Enter your message");
                Main.mes = input.next();
                Main.mes.toUpperCase();
                Main.time = System.currentTimeMillis();
                //System.out.println(time);
                Message a = new Message(num, mes, time);
                MessageList m = new MessageList();
                m.solve();
                System.out.println("Message Sent!");


            } else if (Main.ans.equals("2")) {
                System.out.println("Enter what phone number of the person that you texted that you want to delete: ");
                num1 = input.next();

               }

                //System.out.println("What postion is this text from...Oldest (1) ");
                ///Main.pos = input.nextInt() - 1;
                MessageList m = new MessageList();
                m.solve();
                if (Main.Names.size() < 1) {
                    System.out.println("You do not have any messages in here to delete");
                    break;
                }
             else if (Main.ans.equalsIgnoreCase("3")) {

            } else if (Main.ans.equals("4")) {

                for (int i = 0; i < Main.Names.size(); i++) {
                    DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy; HH:mm");
                    Date date = new Date();
                    System.out.println("Here are your Conversations: ");
                    for (int jj = 0; jj < Main.Names.size(); jj++) {
                        System.out.println("Your message to" + "(" + Main.numbers.get(jj) + ")" + "is " + Main.Names.get(jj) + " at " + date);
                    }
                    break loop1;

                }

            } else if (Main.ans.equalsIgnoreCase("5")) {
                break loop1;
            }

        }
    }
}


