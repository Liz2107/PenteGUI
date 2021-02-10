import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener
{
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel pOneInstructions = new JLabel("Player 1's Move");
	private JLabel pTwoInstructions = new JLabel("Player 2's Move");
	public GUI()
	{
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(18, 18));
		panel.add(pOneInstructions);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PENTE");
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
