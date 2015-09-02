import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        
        
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.RED);
        
        int mx = mouseX();
        
        turtle1.penDown();
        turtle2.penDown();
        turtle1.forward(30);
        turtle2.turn(90);
        turtle2.forward(mx);
        
        
        
    }
}