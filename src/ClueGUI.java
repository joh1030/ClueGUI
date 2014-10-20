import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.*;

public class ClueGUI extends JFrame {

	private JTextField name, roll, guess, response;

	public ClueGUI () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 250);
		setTitle("CLUE");
		createLayout();
	}

	private void createLayout() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,3));
		// Name Panel
		JPanel namePanel;
		namePanel = new JPanel();
		JLabel nameLabel = new JLabel("Whose turn?");
		name = new JTextField(15);
		namePanel.add(nameLabel);
		namePanel.add(name);
		panel.add(namePanel);
		// Next Player Button
		JButton nextPlayerButton = new JButton("NEXT PLAYER");
		panel.add(nextPlayerButton);
		// Accusation Button
		JButton accusationButton = new JButton("MAKE ACCUSATION");
		panel.add(accusationButton);
		// Roll Panel
		JPanel rollPanel = new JPanel();
		JLabel rollLabel = new JLabel("Roll");
		roll = new JTextField(4);
		rollPanel.add(rollLabel);
		rollPanel.add(roll);
		rollPanel.setBorder(new TitledBorder(new EtchedBorder(), "Die"));
		panel.add(rollPanel);
		// Guess Panel
		JPanel guessPanel = new JPanel();
		JLabel guessLabel = new JLabel("Guess");
		guess = new JTextField(10);
		guessPanel.add(guessLabel);
		guessPanel.add(guess);
		guessPanel.setBorder(new TitledBorder(new EtchedBorder(), "Guess"));
		panel.add(guessPanel);
		// Response Panel
		JPanel responsePanel = new JPanel();
		JLabel responseLabel = new JLabel("Response");
		response = new JTextField(10);
		responsePanel.add(responseLabel);
		responsePanel.add(response);
		responsePanel.setBorder(new TitledBorder(new EtchedBorder(), "Guess Result"));
		panel.add(responsePanel);
		// Add panel to JFrame (CENTER)
		add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ClueGUI gui = new ClueGUI();
		gui.setVisible(true);
	}

}
