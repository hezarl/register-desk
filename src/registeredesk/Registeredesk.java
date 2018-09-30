/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeredesk;
import javax.swing.JFrame;

/**
 *
 * @author Xerllene Kwamboka
 */
public class Registeredesk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login recept=new login();
        recept.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        recept.setSize(300,370);
        recept.setVisible(true);
    

        
    }
    
}
