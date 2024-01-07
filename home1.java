package Final;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class home1 extends JFrame implements ActionListener {
    private JButton loginButton;
    private JButton registerButton;

    public home1() {
    	setTitle("PAWS & CLAWS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        
        ImageIcon image = new ImageIcon("C:\\Users\\GEETHIKA\\Downloads\\WhatsApp Image 2023-03-30 at 7.33.26 PM.jpeg");
        
        
        JLabel imageLabel = new JLabel(image);
        panel.add(imageLabel);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        panel.add(loginButton);
        panel.add(registerButton);
        add(panel);

        setVisible(true);
        panel.setBackground(Color.pink);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Prompt user to enter login credentials
            String username = JOptionPane.showInputDialog(this, "Enter username:");
            String password = JOptionPane.showInputDialog(this, "Enter password:");

            if (username != null && password != null && username.equals("jaanu") && password.equals("1234")) {
                // If login is successful, open product details page
                ProductDetailsGUI1 productDetails = new ProductDetailsGUI1();
                productDetails.submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // If submit button is clicked, open customer details page
                        CustomerDetails customerDetails = new CustomerDetails();
                        customerDetails.submitButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // If submit button is clicked, open missing details page
                            	MissingDetails MissingDetails = new MissingDetails();
                    	   
                               
                            }
                        });
                        productDetails.dispose(); // close the product details page window
                    }
                });

                dispose(); // close the home page window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid login credentials");
            }
        } else if (e.getSource() == registerButton) {
            // Open registration page
            new RegisterPage();
            dispose();
        }
    }

    public static void main(String[] args) {
        new home1();
    }
}
