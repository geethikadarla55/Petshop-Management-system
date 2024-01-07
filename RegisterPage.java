package Final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegisterPage extends JFrame {
	

	    public RegisterPage() {
	        setTitle("Register Page");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 400);
	        setLayout(new FlowLayout());

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel titleLabel = new JLabel("Register");
	        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
	        titleLabel.setForeground(Color.blue); 
	        constraints.gridx =0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(20, 10, 10, 10);
	        panel.add(titleLabel, constraints);

	        JLabel nameLabel = new JLabel("Name:");
	        nameLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        constraints.gridwidth = 1;
	        panel.add(nameLabel, constraints);

	        JTextField nameTextField = new JTextField();
	        constraints.gridx = 1;
	        constraints.gridy = 1;
	        constraints.gridwidth = 20;
	        constraints.ipadx = 100;
	        panel.add(nameTextField, constraints);

	        JLabel emailLabel = new JLabel("Email:");
	        emailLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        panel.add(emailLabel, constraints);

	        JTextField emailTextField = new JTextField();
	        constraints.gridx = 1;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        constraints.ipadx = 100;
	        panel.add(emailTextField, constraints);

	        JLabel passwordLabel = new JLabel("Password:");
	        passwordLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 3;
	        constraints.gridwidth = 1;
	        panel.add(passwordLabel, constraints);

	        JPasswordField passwordField = new JPasswordField();
	        constraints.gridx = 1;
	        constraints.gridy = 3;
	        constraints.gridwidth = 1;
	        panel.add(passwordField, constraints);

	        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
	        confirmPasswordLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 4;
	        constraints.gridwidth =1;
	        panel.add(confirmPasswordLabel, constraints);

	        JPasswordField confirmPasswordField = new JPasswordField();
	        constraints.gridx = 1;
	        constraints.gridy = 4;
	        constraints.gridwidth = 1;
	        panel.add(confirmPasswordField, constraints);

	        JButton registerButton = new JButton("Register");
	        constraints.gridx = 0;
	        constraints.gridy = 5;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(20, 10, 10, 10);
	        panel.add(registerButton, constraints);

	        JLabel errorMessageLabel = new JLabel("");
	        errorMessageLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 6;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(errorMessageLabel, constraints);

	        registerButton.addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent e) {
	                String name = nameTextField.getText();
	                String email = emailTextField.getText();
	                String password = new String(passwordField.getPassword());
	                String confirmPassword = new String(confirmPasswordField.getPassword());

	                if (name.trim().isEmpty() || email.trim().isEmpty() || password.trim().isEmpty() || confirmPassword.trim().isEmpty()) {
	                    errorMessageLabel.setText("All fields are required");
	                } else if (!password.equals(confirmPassword)) {
	                    errorMessageLabel.setText("Passwords do not match");
	                } else {
	                    
	                    dispose();
	                    new LoginPage();
	                }
	            }
	        });

	        add(panel);
	        setVisible(true);
	        panel.setBackground(Color.pink);
	    }
	}


