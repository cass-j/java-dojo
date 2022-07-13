import java.util.ArrayList;
import java.util.HashMap;

public class CodeCipher {

    public static String encode(HashMap<Character, Character> cipher, String input){
        char[] wordArray= new char[input.length()];
        String uppercaString = input.toUpperCase();
        ArrayList<Object> encodeArray = new ArrayList<Object>();
        String encodeString = "";
        for (int i=0; i < uppercaString.length(); i++){ // add character at index x to array wordArray
            wordArray[i] = uppercaString.charAt(i);
            // System.out.println(wordArray[i]);
        }
        for (int i=0; i < uppercaString.length(); i++){ //
            encodeArray.add(cipher.get(wordArray[i]));
            encodeString = encodeString.concat(String.valueOf(encodeArray.get(i)));
            // System.out.println(letter);
            // System.out.println(encodeString);s
        }
        return encodeString;
    }

    // public static String decode(HashMap cipher, String scrambledString) {
    //     char[] cipherKey = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    //     return "";
    // }


    public static void main(String[] args) {
        HashMap<Character, Character> cipher = new HashMap<>();
        cipher.put('A', 'M');
        cipher.put('B', 'X');
        cipher.put('C', 'K');
        cipher.put('D', 'T');
        cipher.put('E', 'J');
        cipher.put('F', 'W');
        cipher.put('G', 'R');
        cipher.put('H', 'B');
        cipher.put('I', 'D');
        cipher.put('J', 'U');
        cipher.put('K', 'E');
        cipher.put('L', 'N');
        cipher.put('M', 'Q');
        cipher.put('N', 'L');
        cipher.put('O', 'A');
        cipher.put('P', 'Y');
        cipher.put('Q', 'Z');
        cipher.put('R', 'V');
        cipher.put('S', 'C');
        cipher.put('T', 'S');
        cipher.put('U', 'G');
        cipher.put('V', 'O');
        cipher.put('W', 'I');
        cipher.put('X', 'H');
        cipher.put('Y', 'P');
        cipher.put('Z', 'F');
        
        System.out.println(encode(cipher, "Pizza"));
        // System.out.println(("helloWorld".length()));
        
    }
}
