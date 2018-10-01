/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JOptionPane;



/**
 *
 * @author Xerllene Kwamboka
 */
public class userform extends JFrame{
    //initialize the panel variables
    String gen;
    JLabel fname,lsname,telno,age;
    JTextField texta,textb,textc,textd;
    JRadioButton gena,genb;
    JButton clr,save;
    ButtonGroup grp;
    
    userform()
    {
        super("Add user");//name of the frame
        setLayout(new FlowLayout());//set how it should appear in layout
        
        fname=new JLabel("First Name");
        lsname=new JLabel("Last Name");
        telno=new JLabel("Telephone");
        age=new JLabel("age");
        
        texta=new JTextField();
        texta.setColumns(20);//set parameters
        textb=new JTextField();
        textb.setColumns(20);
        textc=new JTextField();
        textc.setColumns(20);
        textd=new JTextField();
        textd.setColumns(20);
        gena=new JRadioButton("Male",true);//a buttion to choose either,
        genb=new JRadioButton("Female",false);
        
        
        clr=new JButton("clear");
        save=new JButton("save");
     //add all the variables to  the panel in correct order
        add(fname);
        add(texta);
        add(lsname);
        add(textb);
        add(telno);
        add(textc);
          add(age);
        add(textd);
        add(clr);
        add(save);
        add(gena);
        add(genb);
        //create a button group to activate the jradiobuttons for selection
        grp=new ButtonGroup();
        grp.add(gena);
        grp.add(genb);
        
        save.addActionListener(new al());//give the save button duty to input data and drag it to background database
    }
        public class al implements ActionListener
      {
         @Override
         public void actionPerformed(ActionEvent as) 
         {
             try
                     {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admins","root","");
                       Statement stmt=con.createStatement();
                       String s1=texta.getText();
                       String s2=textb.getText();
                       Double s3=Double.parseDouble(textc.getText());
                       Double s4=Double.parseDouble(textd.getText());
                       if(gena.isSelected()){
                           gen="Male";
                       }
                       if(gena.isSelected()){
                           gen="Female";
                       }
                       String s5=(gen);
                       String rs="INSERT INTO users VALUES("+"\""+ s1 +"\""+","+"\""+s2+"\""+","+"\""+s3+"\""+","+"\""+s4+"\""+","+"\""+s5+"\""+")"; 
                       stmt.executeUpdate(rs);
                       JOptionPane.showMessageDialog(null,"saved record to database");
                       con.close();
         }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
            System.out.println(e);
        }
             clr.addActionListener(new vn());
    }   
        public class vn implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent yg )
            {
               userform gv=new userform();
             gv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             gv.setSize(300,370);
             gv.setVisible(true);  
            }
        }        
}}
