import javax.swing.JOptionPane;

class Salut {
	public static void main(String args[]){
		String inputValueOne = JOptionPane.showInputDialog("Introdu un numar dorit: ");
		String inputValueTwo = JOptionPane.showInputDialog("Introdu al doilea numar dorit: ");
		String inputValueThree = JOptionPane.showInputDialog("Care ar fi suma acestor doua numere?: ");
		int numOne = Integer.parseInt(inputValueOne);
		int numTwo = Integer.parseInt(inputValueTwo);
		int guessResult = Integer.parseInt(inputValueThree);
		int rightResult = numOne + numTwo;
		String showMessage = "Nu este corect";

		if(guessResult == rightResult){

			JOptionPane.showMessageDialog(null, numOne + numTwo);

		} else {

			JOptionPane.showMessageDialog(null, showMessage);


  			}

	System.out.println("Hiiii");
	}
}