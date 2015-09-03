import java.awt.Color;
import java.util.Random;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World(800, 800);
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        Random generator = new Random();
        
        
        turtle1.penDown();
        turtle2.penDown();
        
        int n1 = 1;
        while (n1<2){
            
            int color1 = generator.nextInt(256);
            int color2 = generator.nextInt(256);
            int color3 = generator.nextInt(256);
            
            int move1 = generator.nextInt(10);
            int move2 = generator.nextInt(10);
            
            boolean yesno1 = generator.nextBoolean();
            boolean yesno2 = generator.nextBoolean();
            
            if (yesno1 == true){
                turtle1.penUp();
            }
            else{
                turtle1.penDown();
            }
            
            if (yesno2 == true){
                turtle2.penUp();
            }
            else{
                turtle2.penDown();
            }
            
            Color finalcolor1 = new Color(color1, color2, color3);
            Color finalcolor2 = new Color(color2, color3, color1);
            
            turtle1.setPenColor(finalcolor1);
            turtle2.setPenColor(finalcolor2);
            
            
            turtle1.forward(move1);
            turtle1.turn(-90);
            turtle2.turn(90);
            turtle2.forward(move2);
        }
        
        
        
        
        
    }
}