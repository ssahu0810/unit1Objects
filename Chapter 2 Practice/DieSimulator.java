import java.util.Random;

public class DieSimulator
{
    public static void main( String[] args)
    {
        // Option A
        Random generator = new Random();
        int dieValue = generator.nextInt(6);
        dieValue = dieValue + 1;
        
        System.out.println(dieValue);
        
        // Option B
        double dieValue2 = Math.random();
        dieValue2 *= 6;
        dieValue2 += 1;
        
        System.out.println( (int) dieValue2);
    }
}
        