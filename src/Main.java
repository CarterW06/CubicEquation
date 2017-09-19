import java.util.Random;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int a = new Random().nextInt(9);
		int b = new Random().nextInt(9);
		int c = new Random().nextInt(9);
		int d = new Random().nextInt(9);
		int e = new Random().nextInt(9);
		JFrame main = new JFrame("Cubic Equation Generator");
		JPanel jp = new JPanel();
		JLabel text = new JLabel("Please enter the solutions to the following cubic equation.  If there are several solutions that are the same, enter the solution several times.");
	}

}
