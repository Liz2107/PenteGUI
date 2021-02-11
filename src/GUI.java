import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener
{
	static boolean p1Turn = true;
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel pOneInstructions = new JLabel("Player 1's Move");
	private JLabel pTwoInstructions = new JLabel("Player 2's Move");
//	private JLabel one = new JLabel("1");
//	private JLabel two = new JLabel("2");
//	private JLabel three = new JLabel("3");
//	private JLabel four = new JLabel("4");
//	private JLabel five = new JLabel("5");
//	private JLabel six = new JLabel("6");
//	private JLabel seven = new JLabel("7");
//	private JLabel eight = new JLabel("8");
//	private JLabel nine = new JLabel("9");
	
	private JButton b00 = new JButton("00");
	private JButton b01 = new JButton("+");
	private JButton b02 = new JButton("+");
	private JButton b03 = new JButton("+");
	private JButton b04 = new JButton("+");
	private JButton b05 = new JButton("+");
	private JButton b06 = new JButton("+");
	private JButton b07 = new JButton("+");
	private JButton b08 = new JButton("+");
	
	private JButton b10 = new JButton("+");
	private JButton b11 = new JButton("+");
	private JButton b12 = new JButton("+");
	private JButton b13 = new JButton("+");
	private JButton b14 = new JButton("+");
	private JButton b15 = new JButton("+");
	private JButton b16 = new JButton("+");
	private JButton b17 = new JButton("+");
	private JButton b18 = new JButton("+");
	
	private JButton b20 = new JButton("+");
	private JButton b21 = new JButton("+");
	private JButton b22 = new JButton("+");
	private JButton b23 = new JButton("+");
	private JButton b24 = new JButton("+");
	private JButton b25 = new JButton("+");
	private JButton b26 = new JButton("+");
	private JButton b27 = new JButton("+");
	private JButton b28 = new JButton("+");
	
	private JButton b30 = new JButton("+");
	private JButton b31 = new JButton("+");
	private JButton b32 = new JButton("+");
	private JButton b33 = new JButton("+");
	private JButton b34 = new JButton("+");
	private JButton b35 = new JButton("+");
	private JButton b36 = new JButton("+");
	private JButton b37 = new JButton("+");
	private JButton b38 = new JButton("28");
	
	private JButton b40 = new JButton("+");
	private JButton b41 = new JButton("+");
	private JButton b42 = new JButton("+");
	private JButton b43 = new JButton("+");
	private JButton b44 = new JButton("+");
	private JButton b45 = new JButton("+");
	private JButton b46 = new JButton("+");
	private JButton b47 = new JButton("+");
	private JButton b48 = new JButton("+");
	
	private JButton b50 = new JButton("+");
	private JButton b51 = new JButton("+");
	private JButton b52 = new JButton("+");
	private JButton b53 = new JButton("+");
	private JButton b54 = new JButton("+");
	private JButton b55 = new JButton("+");
	private JButton b56 = new JButton("+");
	private JButton b57 = new JButton("+");
	private JButton b58 = new JButton("+");
	
	private JButton b60 = new JButton("+");
	private JButton b61 = new JButton("+");
	private JButton b62 = new JButton("+");
	private JButton b63 = new JButton("+");
	private JButton b64 = new JButton("+");
	private JButton b65 = new JButton("65");
	private JButton b66 = new JButton("+");
	private JButton b67 = new JButton("+");
	private JButton b68 = new JButton("+");
	
	private JButton b70 = new JButton("+");
	private JButton b71 = new JButton("+");
	private JButton b72 = new JButton("+");
	private JButton b73 = new JButton("+");
	private JButton b74 = new JButton("+");
	private JButton b75 = new JButton("+");
	private JButton b76 = new JButton("+");
	private JButton b77 = new JButton("+");
	private JButton b78 = new JButton("+");
	
	private JButton b80 = new JButton("+");
	private JButton b81 = new JButton("+");
	private JButton b82 = new JButton("+");
	private JButton b83 = new JButton("83");
	private JButton b84 = new JButton("+");
	private JButton b85 = new JButton("+");
	private JButton b86 = new JButton("+");
	private JButton b87 = new JButton("+");
	private JButton b88 = new JButton("+");
	public GUI()
	{
		b00.addActionListener(this);
		b01.addActionListener(this);
		b02.addActionListener(this);
		b03.addActionListener(this);
		b04.addActionListener(this);
		b05.addActionListener(this);
		b06.addActionListener(this);
		b07.addActionListener(this);
		b08.addActionListener(this);
		
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		
		b30.addActionListener(this);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		b34.addActionListener(this);
		b35.addActionListener(this);
		b36.addActionListener(this);
		b37.addActionListener(this);
		b38.addActionListener(this);
		
		b40.addActionListener(this);
		b41.addActionListener(this);
		b42.addActionListener(this);
		b43.addActionListener(this);
		b44.addActionListener(this);
		b45.addActionListener(this);
		b46.addActionListener(this);
		b47.addActionListener(this);
		b48.addActionListener(this);
		
		b50.addActionListener(this);
		b51.addActionListener(this);
		b52.addActionListener(this);
		b53.addActionListener(this);
		b54.addActionListener(this);
		b55.addActionListener(this);
		b56.addActionListener(this);
		b57.addActionListener(this);
		b58.addActionListener(this);
		
		b60.addActionListener(this);
		b61.addActionListener(this);
		b62.addActionListener(this);
		b63.addActionListener(this);
		b64.addActionListener(this);
		b65.addActionListener(this);
		b66.addActionListener(this);
		b67.addActionListener(this);
		b68.addActionListener(this);
		
		b70.addActionListener(this);
		b71.addActionListener(this);
		b72.addActionListener(this);
		b73.addActionListener(this);
		b74.addActionListener(this);
		b75.addActionListener(this);
		b76.addActionListener(this);
		b77.addActionListener(this);
		b78.addActionListener(this);
		
		b80.addActionListener(this);
		b81.addActionListener(this);
		b82.addActionListener(this);
		b83.addActionListener(this);
		b84.addActionListener(this);
		b85.addActionListener(this);
		b86.addActionListener(this);
		b87.addActionListener(this);
		b88.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		
		panel.setLayout(new GridLayout(9, 9));
		
		panel.add(b00);
		panel.add(b01);
		panel.add(b02);
		panel.add(b03);
		panel.add(b04);
		panel.add(b05);
		panel.add(b06);
		panel.add(b07);
		panel.add(b08);
		
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);
		panel.add(b25);
		panel.add(b26);
		panel.add(b27);
		panel.add(b28);
		
		panel.add(b30);
		panel.add(b31);
		panel.add(b32);
		panel.add(b33);
		panel.add(b34);
		panel.add(b35);
		panel.add(b36);
		panel.add(b37);
		panel.add(b38);
		
		panel.add(b40);
		panel.add(b41);
		panel.add(b42);
		panel.add(b43);
		panel.add(b44);
		panel.add(b45);
		panel.add(b46);
		panel.add(b47);
		panel.add(b48);
		
		panel.add(b50);
		panel.add(b51);
		panel.add(b52);
		panel.add(b53);
		panel.add(b54);
		panel.add(b55);
		panel.add(b56);
		panel.add(b57);
		panel.add(b58);
		
		panel.add(b60);
		panel.add(b61);
		panel.add(b62);
		panel.add(b63);
		panel.add(b64);
		panel.add(b65);
		panel.add(b66);
		panel.add(b67);
		panel.add(b68);
		
		panel.add(b70);
		panel.add(b71);
		panel.add(b72);
		panel.add(b73);
		panel.add(b74);
		panel.add(b75);
		panel.add(b76);
		panel.add(b77);
		panel.add(b78);
		
		panel.add(b80);
		panel.add(b81);
		panel.add(b82);
		panel.add(b83);
		panel.add(b84);
		panel.add(b85);
		panel.add(b86);
		panel.add(b87);
		panel.add(b88);
		//panel.add(pOneInstructions);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PENTE");
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
//		if(p1Turn)
//		{
//			if(e.getSource() == "b00")
//				b00.setBackground(Color.red);
//		}
//		else
//		{
//			
//		}
	}
}
