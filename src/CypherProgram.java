import java.awt.*;
import java.util.*;

public class CypherProgram {

    private int shiftAmount = 1;
    private ArrayList<Character> letterNumber;
    private String plainText;
    private String cypherText;

    private void init() {
        letterNumber = new ArrayList<Character>();
            letterNumber.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
    }

    private void askQuestion() {
        shiftAmount = 1;
    }

    private void inputPhrase(){
        plainText = "CAESAR";
    }

    private void encrypt() {
        letterNumber.indexOf()
    }

    private void outputEncryption() {
        System.out.println(cypherText);
    }
    private void quit() {

    }

    // main program
    CypherProgram() {
        init();
        askQuestion();
        inputPhrase();
        encrypt();
        outputEncryption();
    }
}
