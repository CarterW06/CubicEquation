import javax.swing.*;

public class Main {

	static JPanel jp1 = new JPanel();
	public static void main(String[] args) {
		JPanel jp2 = new JPanel();
		JFrame main = new JFrame("Cubic Equation Generator");
		JLabel text = new JLabel("Please enter the solutions to the following cubic equation.  If there are several solutions that are the same, enter the solution several times.");
		JLabel cubic = new JLabel(generateCubic());
		JTextField answer = new JTextField();
		JButton check = new JButton("Check your answer");
		jp1.add(text);
		
	}
	
	private static String generateCubic() {
		return "";
	}

}
