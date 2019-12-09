import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class l1Tester implements ActionListener{
	JFrame riddle = new JFrame();	
	JPanel riddler = new JPanel ();
	JLabel rid = new JLabel ("What is green but can't fly");
	JButton ri = new JButton ("Submit");
	JButton ir = new JButton ("Hint");
	JTextField r= new JTextField (10);
	l1Tester(){
		riddle.setSize(500, 500);
		riddle.setVisible(true);
		riddler.add(rid);
		riddler.add(ri);
		riddler.add(r);
		riddler.add(ir);
		riddle.add(riddler);
		ir.addActionListener(this);
		ri.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		l1Tester test= new l1Tester();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ir){
			JOptionPane.showMessageDialog(null, "The object creates fruit");
		}
		if (arg0.getSource()==ri){
		if (r.getText().equalsIgnoreCase("Tree")) {
			JOptionPane.showMessageDialog(null, "You are Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are wrong");
			
		}
}
		}
	}


	

