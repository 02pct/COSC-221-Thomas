package p.project18dialog;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author robbe
 */
public class Project18dialog {

    public static void main(String[] args) {
        // string input
        /*String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Hi %s! \nWelcome to Java Programming Course.", name);
        JOptionPane.showMessageDialog(null, message);*/
        
        String ans = JOptionPane.showInputDialog("Please enter an integer: ");
        String message;
        int n = Integer.parseInt(ans); // string to int converter
        if (n % 2 == 0) {
            message = "The entered num is an even number";
        } else {
            message = "The entered num is an odd number";
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
}
