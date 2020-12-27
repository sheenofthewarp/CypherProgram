import java.awt.*;
import java.util.*;
import java.io.*;

public class CypherProgram {

    private int shiftAmount = 1;
    private ArrayList<Character> letterNumber;
    private String plainText;
    private String cypherText;
    private Scanner scanner;

    private void init() {
        letterNumber = new ArrayList<Character>();
            letterNumber.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        scanner = new Scanner(System.in);
    }

    private void askQuestion() {
        shiftAmount = -1;
        while (shiftAmount == -1) {
            try {
                System.out.println("How many characters would you like to shift?");
                shiftAmount = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Invalid input, using 1");
            }
            scanner.nextLine();
        }
    }

    private void inputPhrase(){
        System.out.println("Enter a phrase ");
        plainText = scanner.nextLine().toUpperCase();
        System.out.println(plainText);
    }

    private void encrypt() {
        cypherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int ch_index = letterNumber.indexOf(ch);
            char cy;
            int cy_index = 0;
            if (ch_index == -1) {
                cy = ch;
            }
            else {
                cy_index = (ch_index + shiftAmount) % letterNumber.size();
                cy = letterNumber.get(cy_index);
            }
            cypherText += Character.toString(cy);

            /*
            System.out.print(i);
            System.out.print("  ");
            System.out.print(ch);
            System.out.print("  ");
            System.out.print(ch_index);
            System.out.print("  ");
            System.out.print(cy_index);
            System.out.print("  ");
            System.out.print(cy);
            System.out.print("  => ");
            System.out.println(cypherText);
            */

        }

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
