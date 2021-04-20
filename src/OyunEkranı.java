
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkranı extends JFrame{

    public OyunEkranı(String string) throws HeadlessException {
        super(string);
    }
    
    public static void main(String[] args) {
        
        
        OyunEkranı ekran = new OyunEkranı("Uzay Oyunu");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        
        ekran.setSize(800, 600);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        
        oyun.requestFocus();
        
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        ekran.add(oyun);
        ekran.setVisible(true);
        
        
    }
}
