package Final;
import java.awt.BorderLayout;

import javax.swing.*;
public class MainFrame extends JFrame  {
	

	
	    public MainFrame() {
	        // Set the size and layout of the main frame
	        setSize(800, 600);
	        setLayout(new BorderLayout());
	        
	        // Create and add your modules to the main frame
	        LoginPage loginPage = new LoginPage();
	        add(loginPage, BorderLayout.CENTER);
	        
	        RegisterPage registerPage = new RegisterPage();
	        add(registerPage, BorderLayout.CENTER);
	        
	        Home homePage = new Home();
	        add(homePage, BorderLayout.CENTER);
	        ProductDetailsGUI1 ProductDetailsGUI=new ProductDetailsGUI1();
	        add(ProductDetailsGUI,BorderLayout.CENTER);
	        CustomerDetails CustomerDetails=new CustomerDetails();
	        add(CustomerDetails,BorderLayout.CENTER);
	        // Set the visibility of the main frame
	        setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	        new MainFrame();
	    }
	    

	    public class LoginPage extends JPanel {
	        public LoginPage() {
	            // Add your login page components here
	            JLabel titleLabel = new JLabel("Login Page");
	            add(titleLabel);
	        }
	    }

	    public class RegisterPage extends JPanel {
	        public RegisterPage() {
	            // Add your register page components here
	            JLabel titleLabel = new JLabel("Register Page");
	            add(titleLabel);
	        }
	    }
}

	    