
/**
 * main class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String [] args){

        MorseCode mors = new MorseCode();

        String testMessage = "hello world 1234";

        System.out.println(mors.toMorse(testMessage));
        
        
        System.out.println(mors.toAlphabet(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. / ----- .---- ..--- ...-- "));
        
    }
}
