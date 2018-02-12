import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IncrementFrame extends JFrame {
	
	Integer count = 0;
	
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new FlowLayout());
		JButton incrementButton = new JButton("Increment");
		JButton resetButton = new JButton("Reset");
		JTextField textfield = new JTextField(16);
		
		this.add(incrementButton);
		this.add(resetButton);
		this.add(textfield);
		
		incrementButton.addActionListener(new incrementListener(textfield));
		resetButton.addActionListener(new resetListener(textfield));
		
		textfield.setEditable(false);
		textfield.setText(Integer.toString(count));
		
        this.setSize(300,400);
       	this.setVisible(true);
	}
	
	private class incrementListener implements ActionListener {
		
		JTextField output;
		
		public incrementListener(JTextField output) {
			this.output = output;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			output.setText(Integer.toString(count));
		}
	}

	private class resetListener implements ActionListener {
		
		JTextField output;
		
		public resetListener(JTextField output) {
			this.output = output;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			count = 0;
			output.setText(Integer.toString(count));
		}
	}
	
}
