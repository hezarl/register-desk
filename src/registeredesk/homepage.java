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
           super("home");//sper gives the name  to be taken up by the created frame as title
            setLayout(new FlowLayout());
     adduser=new JButton("ADD_USER");
     logout=new JButton("LOG_OUT");
     //add th buttons to the panel
     add(adduser);
     add(logout);
     //give the adduser and logout buttons action permission
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
           
           logout.addActionListener(new ln());
}
            public class ln implements ActionListener
            {
                public void actionPerformed(ActionEvent ad)
                {
                    @Override
                    login lgt=new login
                            lgt.setSize(300,370);
                            lgt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            lgt.setVisible(true);
                }
            }
      }
}

