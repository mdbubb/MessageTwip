/**
 * Created by mdb17 on 2/2/2017.
 */
public class MessageList {
    public void solve(){
        if (Main.ans ==1){
            Main.l.add(Main.mes);
        }
        else if(Main.ans==2){
            Main.l.remove(Main.pos);
            System.out.println(Main.l);

        }

    }
}
