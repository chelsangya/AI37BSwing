package demoproject37b.controller;

import demoproject37b.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sangyakoirala
 */
public class LoginController {
    private LoginView loginView= new LoginView();
    public LoginController(LoginView loginView){
        this.loginView=loginView;
        loginView.loginUser(new LoginUser());
    }
    void open(){
        this.loginView.setVisible(true);
    }
    void close(){
        this.loginView.dispose();
    }
    
    
    
    class LoginUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           String email=loginView.getEmailTextField().getText();
           String password= String.valueOf(loginView.getPasswordField().getPassword());
           if(email.isEmpty()||password.isEmpty()){
               JOptionPane.showMessageDialog(loginView, "Please fill in all the fields");
           } else{
               JOptionPane.showMessageDialog(loginView, "Validated");
           }
        }
        
    }
}
