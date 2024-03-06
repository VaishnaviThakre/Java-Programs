import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
 
    Label lb1,lb2,lb3;
    TextField tf1,tf2,tf3;
    Button btn1,btn2,btn3,btn4;
    
    public SimpleCalculator(){
        setLayout(new FlowLayout());
        lb1 = new Label("First number:");
        lb2 = new Label("Second number:");
        tf1 = new TextField(15);
        tf2 = new TextField(15);
        lb3 = new Label("Result");
        tf3 = new TextField(15);
        btn1 = new Button("+");
        btn2 = new Button("-");
        btn3 = new Button("*");
        btn4 = new Button("/");
        
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
            
}
  public void actionPerformed(ActionEvent ae)
{
    String s1 = tf1.getText();
    String s2 = tf2.getText();
    int a  = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    int c;
    
    if(ae.getActionCommand()=="+")
    {
        c = a+b;
        tf3.setText(" "+c);
    }
    if(ae.getActionCommand()=="-")
    {
        c = a-b;
        tf3.setText(" "+c);
    }
    if(ae.getActionCommand()=="*")
    {
        c = a*b;
        tf3.setText(" "+c);
    }
    if(ae.getActionCommand()=="/")
    {
        c = a/b;
        tf3.setText(" "+c);
    }
    
    
    
    
} 
  
  public static void main(String[] args)
  {
      SimpleCalculator sc = new SimpleCalculator();
      sc.setVisible(true);
      sc.setTitle("Calculator");
      sc.setSize(300,300);
      
  }
}
 


