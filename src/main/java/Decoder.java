public class Decoder {

    public static String decode (String encoded) {

        System.out.println("Encoded string is -->"+encoded);

        char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] morseLetters = { "000", ". ___", "XXXOXOX", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", ". ___ ___ ___", "___ . ___", ". ___ . .",  "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", ". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};

        String newText = "";

        encoded = encoded.toLowerCase();

        /*for (int i = 0; i < encoded.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (encoded.charAt(i) == letters[j]) {
                    newText += morseLetters[j];
                    newText += "   ";
                    break;
                }
            }
        }*/
        for (short j = 0; j < 37; j++) {
            for (int i = 0; i < encoded.length(); i++) {
                if (letters[j]== encoded.charAt(i)) {
                    newText += morseLetters[j];
                    newText += "   ";
                    break;
                }
            }
        }

        System.out.println("Text in Morse Code");
        System.out.println(newText);


        return newText;
    }
}
