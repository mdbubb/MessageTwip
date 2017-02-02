import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList l = new ArrayList();
    public static Long time;
    public static int  ans;
    public static String mes;
    public static int pos;
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to send a message (1), delete a message(2), move a message (3), or display a message (4)");
        Main.ans = input.nextInt();
        switch (ans) {
            case 1: {
                System.out.println("Enter the phone number you want the message to go to");
                String num = input.next();
                System.out.println("Enter your message");
                Main.mes = input.next();
                Main.time = System.currentTimeMillis();
                //System.out.println(time);
                Message a = new Message(num, mes, time);
                MessageList m = new MessageList();
                m.solve();
                break;
            }

            case 2: {
                System.out.println("Enter what phone number this text is from: ");
                String num1 = input.next();
                System.out.println("What postion is this text from...Oldest (1) ");
                Main.pos = input.nextInt() - 1;
                if (Main.l.size() < 1) {
                    System.out.println("You do not have any messages in here to delete");
                    break;
                }
            }

        }


    }
}
