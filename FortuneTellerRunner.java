
package fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
      	 SwingUtilities.invokeLater(new FortuneTeller());
      	 begin();
       }
    
    static void begin() {
      	 // Welcome the user. Give them a hint for the secret location.
 JOptionPane.showMessageDialog(null, "Hello, I am Fortuna the Fortune Teller, I will tell You Your Future Responding With Yes and No");
    JOptionPane.showMessageDialog(null, "Be Careful With the Questions You ask Because They Will Come To Pass, or I could Just Banish You to The Eternal Plane If I wanted To,Muhahahahhahah");
    JOptionPane.showMessageDialog(null, "The Spot you have to click is 257 ,378 Can you pass the Only Challenge");
    }
    
    
}
