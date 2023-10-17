import java.util.Arrays;
import javax.swing.JOptionPane;

public class ProblemThreeLabTwo {
    public static void main(String args[]){
        String inputValueOne = JOptionPane.showInputDialog("Introdu primul numar ");
	String inputValueTwo = JOptionPane.showInputDialog("Introdu al doile numar  ");
        String inputValueThree = JOptionPane.showInputDialog("Introdu al treilea  numar  ");
        int numOne = Integer.parseInt(inputValueOne);
        int numTwo = Integer.parseInt(inputValueTwo);
        int numThree = Integer.parseInt(inputValueThree);
        int[] myArray = {numOne, numTwo, numThree};
        Arrays.sort(myArray);
        String arrayString = Arrays.toString(myArray);
        String message = " sunt numerele introduse de tine si sortate in mod crescator";
        JOptionPane.showMessageDialog(null, arrayString + message);





    }
}