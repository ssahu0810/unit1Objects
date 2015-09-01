import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1920,1080);
        
        Random generator = new Random();
        
        int count = 1;
        while (count<2){
            int n1 = generator.nextInt(256);
            int n2 = generator.nextInt(256);
            int n3 = generator.nextInt(256);
            Color myColor = new Color(n1, n2, n3);
            
        
            frame.getContentPane().setBackground(myColor);
            frame.setVisible(true);
        }
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}