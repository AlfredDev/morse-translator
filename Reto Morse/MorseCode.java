
/**
 * we will convert morse code in alphabet
 * 
 * @author (Alfred Hudson) 
 * @version (a version number or a date)
 */
public class MorseCode
{
    String alphabet="abcdefghijklmnopqrstuvwxyz1234567890.,?";
    String [] morse =  new String[44];
    String slash="/";

    public MorseCode(){
        morse[0] = ".-"; 	//a
        morse[1] = "-...";	//b
        morse[2] = "-.-.";	//c
        morse[3] = "-..";	//d
        morse[4] = ".";		//e
        morse[5] = "..-.";	//f
        morse[6] = "--.";	//g
        morse[7] = "....";	//h
        morse[8] = "..";	//i
        morse[9] = ".---";	//j
        morse[10] = "-.-";	//k
        morse[11] = ".-..";	//l
        morse[12] = "--";	//m
        morse[13] = "-.";	//n
        morse[14] = "---";	//o
        morse[15] = ".--.";	//p
        morse[16] = "--.-";	//q
        morse[17] = ".-.";	//r
        morse[18] = "...";	//s
        morse[19] = "-";	//t
        morse[20] = "..-";	//u
        morse[21] = "...-";	//v
        morse[22] = ".--";	//w
        morse[23] = "-..-";	//x
        morse[24] = "-.--";	//y
        morse[25] = "--..";	//z
        morse[26] = "-----";	//0
        morse[27] = ".----";	//1
        morse[28] = "..---";	//2
        morse[29] = "...--";	//3
        morse[30] = "....-";	//4
        morse[31] = ".....";	//5
        morse[32] = "-....";	//6
        morse[33] = "--...";	//7
        morse[34] = "---..";	//8
        morse[35] = "----.";	//9
        morse[41] = ".-.-.-";	//.
        morse[42] = "--..--";	//,
        morse[43] = "..--..";	//?
    }

    /** 
     * this method will convert the alphabet to morse
     * @param String for convert
     * @return morse code
     */
    public  String toMorse(String message){
        String toMorse="";
        // we change the Str to lower case
        message = message.toLowerCase();

        for(int i = 0; i< message.length();i++){
            if(message.charAt(i) == ' '){
                toMorse = toMorse+slash+' ';
            }else{
                for(int j = 0; j < alphabet.length(); j++){
                    if( message.charAt(i) == alphabet.charAt(j)){
                        toMorse = toMorse + morse[j]+' ';
                    }
                }
            }
        } 
        return toMorse;
    }

    /**
     * this method will convert code morse to Alphabet
     *
     * @param  String to convert
     * @return  the morse code convert int alphabet
     */
    public String toAlphabet(String code)
    {
        String [] code2 = code.split(" ");
        String message= " ";

        for (int i = 0 ; i < code2.length; i++){
            if(code2[i].equals( slash))  message = message + " ";
            for( int j = 0; j < morse.length; j++){
                if(code2[i].equals(morse[j])){
                    message = message + alphabet.charAt(j);                 }
            }

        }
        return message;
    }

}
