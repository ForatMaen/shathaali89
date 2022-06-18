import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventDriven {

	public static void main(String[] args) {
     
		Font font = new Font ("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 12);
		JFrame frame1 = new JFrame("Information");
		frame1.setSize(1000, 1000);
		
		JLabel jlbl1 = new JLabel("Please Enter Your Full Name");
	    jlbl1.setBounds(10, 1, 500, 100);
	    frame1.add(jlbl1);
	    jlbl1.setFont(font);
	    
	    JLabel jlbl2 = new JLabel("Please Enter Your Date Of Birth.");
	    jlbl2.setBounds(10, 45, 500, 100);
	    frame1.add(jlbl2);
	    jlbl2.setFont(font);
	    
	    JLabel jlbl3 = new JLabel("Please Enter Your Email Address");
	    jlbl3.setBounds(10, 88, 500, 100);
	    frame1.add(jlbl3);
	    jlbl3.setFont(font);
	    
	    JLabel jlbl4 = new JLabel("Please Enter Your Phone Number");
	    jlbl4.setBounds(10, 130, 500, 100);
	    frame1.add(jlbl4);
	    jlbl4.setFont(font);
	    
	    JLabel jlbl5 = new JLabel("Select One Of The Following:");
	    jlbl5.setBounds(10, 166, 500, 100);
	    frame1.add(jlbl5);
	    jlbl5.setFont(font);
	    
	    
	    JTextField txtf1 = new JTextField();
	    txtf1.setBounds(10, 65, 200, 20);
	    frame1.add(txtf1);
	    
	    JTextField txtf2 = new JTextField("   /   /");
	    txtf2.setBounds(10, 110, 150, 20);
	    frame1.add(txtf2);
	    
	    JTextField txtf3 = new JTextField("               @outlook.com");
	    txtf3.setBounds(10, 150, 200, 20);
	    frame1.add(txtf3);
	    
	    
	    JTextField txtf4 = new JTextField(" +962  ");
	    txtf4.setBounds(10, 190, 120, 20);
	    frame1.add(txtf4);
	    
	    JCheckBox chbx = new JCheckBox("I Am A Student");
	    frame1.add(chbx);
	    chbx.setBounds(200, 190, 150, 50);
	    
	    JCheckBox chbx1 = new JCheckBox("I Am An Employee");
	    frame1.add(chbx1);
	    chbx1.setBounds(200, 250,150, 50);
	    
	    JCheckBox chbx2 = new JCheckBox("None of the above");
	    frame1.add(chbx2);
	    chbx2.setBounds(200, 300,200, 50);
	    
	    
	   JButton btn = new JButton("Upload Information");
	   btn.setBounds(175, 350, 250,50);
	   frame1.add(btn);
	    
	   btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jlbl1.setText(txtf1.getText());
			jlbl2.setText(txtf2.getText());
			jlbl3.setText(txtf3.getText());
			jlbl4.setText(txtf4.getText());
			
			
		}
	});
	    
		
		
		
		
		
		
		
		frame1.setLayout(null);
		frame1.setVisible(true);
		
	}

}
