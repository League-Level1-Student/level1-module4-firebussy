package _01_getters_and_setters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JPanel screen= new JPanel();
	JFrame lines= new JFrame();
	
	JTextField boxes= new JTextField(6);
	JTextField boxe= new JTextField(6);
	JButton clicks= new JButton("Add");
	JButton click= new JButton("Subtract");
	JButton clic= new JButton("Divide");
	JButton cli= new JButton("Multiply");
	
	Calculator (){
	lines.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	screen.add(boxe);
	screen.add(boxes);
	screen.add(clicks);
	screen.add(click);
	screen.add(clic);
	screen.add(cli);
	lines.add(screen);
	lines.setVisible(true);
	//lines.setSize(1000, 1000);	
	lines.pack();
	clicks.addActionListener(this);
	click.addActionListener(this);
	clic.addActionListener(this);
	cli.addActionListener(this);
	
	}
	
	
public static void main(String[] args) {
	Calculator calc= new Calculator();
	
	
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	String ans=boxes.getText();
	int num=Integer.parseInt(ans);
	String answe=boxe.getText();
	int numb=Integer.parseInt(answe);
	if (arg0.getSource()==clicks) {
		int answer= numb+num;
		JOptionPane.showMessageDialog(null, " The answer is "  +  answer);
	}
if (arg0.getSource()==click) {
	int answer= numb-num;
	JOptionPane.showMessageDialog(null, " The answer is "  +  answer);	
	}
if (arg0.getSource()==cli) {
	int answer= numb*num;
	JOptionPane.showMessageDialog(null, " The answer is "  +  answer);	
}
if (arg0.getSource()==clic) {
	int answer= numb/num;
	JOptionPane.showMessageDialog(null, " The answer is "  +  answer);	
}
}
}
