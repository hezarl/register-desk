/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Xerllene Kwamboka
 */
public class homepage extends JFrame  {
    JButton adduser,logout;

        homepage()
{
           super("home");
            setLayout(new FlowLayout());
     adduser=new JButton("ADD_USER");
     logout=new JButton("LOG_OUT");
     
     add(adduser);
     add(logout);
     
     adduser.addActionListener(new ad());
}
        public class ad implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent cd )
            {
                userform fom= new userform();
            fom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fom.setSize(300,370);
           fom.setVisible(true);
}
      }}

