
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firtsNumber = 
        JOptionPane.showInputDialog(" first integer ");
        String secondNumber = 
        JOptionPane.showInputDialog(" second integer ");
        
        int number1 = Integer.parseInt( firtsNumber );
        int number2 = Integer.parseInt( secondNumber );
        
        int sum = number1 + number2; 
        
        JOptionPane.showMessageDialog(null," a soma é " + sum, " soma de dois inteiros ",JOptionPane.PLAIN_MESSAGE);

    }
    
}
