import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class DollarToRupeesCoverter extends JFrame implements ActionListener {
    
        JButton btn1;
        JLabel lb1,lb2;
        JTextField tf1,tf2;
        

    DollarToRupeesCoverter()
    {
        
        setLayout(null);
        lb1 = new JLabel("American Dollars");
        lb2 = new JLabel("Rupees");
        
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        
        btn1 = new JButton("Convert");
        
        add(lb1);
        lb1.setBounds(50,10,100,100);
        add(tf1);
        tf1.setBounds(160,50,100,20);
        add(lb2);
        lb2.setBounds(50,50,100,100);
        add(tf2);
        tf2.setBounds(160,100,100,20);
        add(btn1);
        btn1.setBounds(50,150,100,20);
        
        
        tf2.setEditable(false);
        btn1.addActionListener(this);
              
    }
    
    public void actionPerformed(ActionEvent ae)
    {     
        String s1 = tf1.getText();
        int dlr = Integer.parseInt(s1);
        float rs = dlr*90;
        tf2.setText(""+rs);
        
    }
            
    public static void main(String[] args) {
        DollarToRupeesCoverter o1 = new DollarToRupeesCoverter();
        o1.setTitle("Currency Conveter");
        o1.setVisible(true);
        o1.setSize(370,300);
        
        o1.setBackground(Color.lightGray);
        
    }
    
}
