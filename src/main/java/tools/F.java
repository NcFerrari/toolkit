package tools;

import javax.swing.JOptionPane;

public class F {

    /**
     * Classic Thread sleep method (try-catch block is covered by this method)
     */
    public static void sleep(int milisekund) {
        try {
            Thread.sleep(milisekund);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Ordinary swing output dialog window
     */
    public static void print(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Swing confirm dialog
     *
     * @return 0 = yes, 1 = no, 2 = cancel
     */
    public static int question(String message) {
        return JOptionPane.showConfirmDialog(null, message);
    }

    /**
     * Swing input dialog
     *
     * @return inputed text
     */
    public static String input(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    /**
     * The greatest common divisor of two numbers
     */
    public static int nsd(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        while (secondNumber > 0) {
            int residue = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = residue;
        }
        return firstNumber;
    }

    /**
     * The least common multiple of two numbers
     */
    public static int nsn(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        return secondNumber * firstNumber / nsd(firstNumber, secondNumber);
    }

    /**
     *
     */
    public static String abbreviatedFraction(int numerator, int denominator) {
        int divisor = nsd(numerator, denominator);
        return String.format("%d / %d", numerator / divisor, denominator / divisor);
    }


    private F() {

    }
}
