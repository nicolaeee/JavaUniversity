
//Sa citeasca un numar intreg a si sa verifice daca e un patrat perfect
import javax.swing.JOptionPane;

public class PatratPerfect {
    public static void main(String args[]){
        String inputValueOne = JOptionPane.showInputDialog("Introdu un numar ");
        int num = Integer.parseInt(inputValueOne);

        double radical = Math.sqrt(num);

        if((int)radical * (int)radical == num){
         JOptionPane.showMessageDialog(null, (float)radical);
         JOptionPane.showMessageDialog(null,"Numarul " + num + " este patrat perfect");

        }
        else {

            JOptionPane.showMessageDialog(null,"Numarul " + num + " nu este patrat perfect");
        }

    }
}
