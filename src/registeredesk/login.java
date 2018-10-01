/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Xerllene Kwamboka
 */
public class login extends JFrame {

    private static void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    JLabel loginlbl;
    JLabel pswdlbl;
    JTextField logins;
    JPasswordField pswd;
    JButton loginbtn,exitbtn;
    
    login()
    {
        super("log in");
        setLayout(new FlowLayout());
        
        loginlbl=new JLabel("userName");
        pswdlbl=new JLabel("password");
        
        logins=new JTextField();
        logins.setColumns(25);
        pswd=new JPasswordField();
        pswd.setColumns(25);       
        
        loginbtn=new JButton("log in");
        exitbtn=new JButton("exit");
        
       loginlbl.setBounds(50,50,80,20);
       pswdlbl.setBounds(50,90,80,20);
       logins.setBounds(200,50,80,20);
       pswd.setBounds(150,90,80,20);
       loginbtn.setBounds(150,130,80,20);
       exitbtn.setBounds(150,130,80,20);
       
        add(loginlbl);
        add(logins);
        add(pswdlbl);
        add(pswd);
        add(loginbtn);
        add(exitbtn);
        

    
              loginbtn.addActionListener(new lg());
    }
        public class lg implements ActionListener
               {
                 @Override
                 public void actionPerformed(ActionEvent be)
                   {
                    try
                     {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admins","root","");
                       String result="select* from administration where userName=? && password=?";
        
                       PreparedStatement stmt=con.prepareStatement(result);
                       
                       stmt.setString(1,logins.getText());
                        stmt.setString(2,pswd.getText());
                        
                        ResultSet rs=stmt.executeQuery();
                        
                        if (rs.next())
                        {
                            JOptionPane.showMessageDialog(null,"login success");
                            homepage home=new homepage();
                            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            home.setSize(300,370);
                            home.setVisible(true);
                            con.close();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"invalid user credentials");
                        }
                             }
                    catch(HeadlessException | ClassNotFoundException | SQLException e)
                    {
                        System.out.println(e);
                    }
        } 
                         }
                     }
                     
    

