package Final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Myapp extends JFrame { 
	    private Home home;
	    private ProductDetailsGUI1 ProductDetailsGUI;
	    private CustomerDetails customerDetails;
	    private MissingDetails missingDetails;

	    public Myapp() {
	        setTitle("PAWS & CLAWS");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 800);
	        setLayout(new BorderLayout());

	        // Create instances of all GUI classes
	        home = new Home();
	        ProductDetailsGUI = new ProductDetailsGUI1();
	        customerDetails = new CustomerDetails();
	        missingDetails = new MissingDetails();

	        // Add action listeners to buttons in Home class
	        home.loginButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Display the customer details form
	                customerDetails.setVisible(true);
	            }
	        });
	        home.registerButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Display the product details form
	            	  ProductDetailsGUI.setVisible(true);
	            }
	        });

	        // Add action listeners to buttons in ProductDetailsGUI1 class
	        ProductDetailsGUI.submitButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Display the missing details form
	                missingDetails.setVisible(true);
	            }
	        });

	        // Add all GUI components to content pane
	        add(home, BorderLayout.CENTER);
	        add(  ProductDetailsGUI, BorderLayout.CENTER);
	        add(customerDetails, BorderLayout.CENTER);
	        add(missingDetails, BorderLayout.CENTER);

	        // Hide all forms initially
	        ProductDetailsGUI.setVisible(false);
	        customerDetails.setVisible(false);
	        missingDetails.setVisible(false);
	    }

	    public static void main(String[] args) {
	        new Myapp().setVisible(true);
	    }
	}



