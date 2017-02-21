/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bhaumik;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class simulator8085 {

   public static void main(String[] args) {  
JLabel l1;  
JFrame f=new JFrame("BAHUMIK PATEL");  
f.setSize(1360,950);
        
l1 = new JLabel("Write your code Below:");
l1.setBounds(0,0,200,20);
f.add(l1);

JButton b=new JButton("comile");
b.setBounds(5,550,100,40); 
f.add(b);          
  
JTextArea t=new JTextArea();
t.setBounds(0,20,500,400);
f.add(t);

 JTextField t1,t2;  
    t1=new JTextField("Welcome to Javatpoint.");  
    t1.setBounds(500,100, 200,30);  
    f.add(t1);

f.setLayout(null);
f.setVisible(true); 
}  
}
