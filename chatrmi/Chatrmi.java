package chatrmi;

/**
 *
 * @author Jeferson
 */
public class Chatrmi {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClient().setVisible(true);
            }
        });
    }
    
}
