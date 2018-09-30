/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;



/**
 *
 * @author Xerllene Kwamboka
 */
public class userform extends JFrame{
    
    JLabel fname,lsname,telno,age;
    JTextField texta,textb,textc,textd;
    JRadioButton gena,genb;
    JButton clr,save;
    JSpinner dates;
    
    userform()
    {
        super("Add user");
        setLayout(new FlowLayout());
        
        fname=new JLabel("First Name");
        lsname=new JLabel("Last Name");
        telno=new JLabel("Telephone");
        age=new JLabel("age");
        
        texta=new JTextField();
        texta.setColumns(20);
        textb=new JTextField();
        textb.setColumns(20);
        textc=new JTextField();
        textc.setColumns(20);
        textd=new JTextField();
        textd.setColumns(20);
        
        clr=new JButton("clear");
        save=new JButton("save");
     
        add(fname);
        add(lsname);
        add(telno);
        add(age);
        add(texta);
        add(textb);
        add(textc);
        add(textd);
        add(clr);
        add(save);
        
    }
    
    
   
    
    
    
    
    
}
