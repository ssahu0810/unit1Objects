public class Trimit 
{
    public static void main(String[] args)
    {
        String sentence1 = "      abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi         ";
        
        String sentence4 = sentence1.trim();
        String sentence5 = sentence2.trim();
        String sentence6 = sentence3.trim();
        
        String message = sentence4.concat(sentence5).concat(sentence6);
        System.out.println(message);
    }
}
        