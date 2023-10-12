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
		String showMessageWrong = "Nu este corect, mai incearca odata!";
		String showMessageRightOne = "Bravo, ai reusit, raspunsul tau: ";
		String showMessageRightTwo = " este absolut corect ";


		while(guessResult != rightResult){


		 JOptionPane.showMessageDialog(null, showMessageWrong);
         inputValueOne = JOptionPane.showInputDialog("Introdu un numar dorit: ");
		 inputValueTwo = JOptionPane.showInputDialog("Introdu al doilea numar dorit: ");
		 inputValueThree = JOptionPane.showInputDialog("Care ar fi suma acestor doua numere?: ");
		 numOne = Integer.parseInt(inputValueOne);
		 numTwo = Integer.parseInt(inputValueTwo);
		 guessResult = Integer.parseInt(inputValueThree);
		 rightResult = numOne + numTwo;

		}

		if(guessResult == rightResult){

			JOptionPane.showMessageDialog(null, showMessageRightOne + (numOne + numTwo) + showMessageRightTwo);

		}

	}
}