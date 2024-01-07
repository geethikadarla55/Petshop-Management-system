package Final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends JFrame {
	
	    public LoginPage() {
	        setTitle("Login Page");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 400);
	        setLayout(new FlowLayout());
	        getContentPane().setBackground(new Color(100, 149, 237));

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel titleLabel = new JLabel("Login");
	        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
	        titleLabel.setForeground(Color.blue); 
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(titleLabel, constraints);

	        JLabel UsernameLabel = new JLabel("Username:");
	        UsernameLabel.setForeground(Color.green); 
	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        constraints.gridwidth = 1;
	        panel.add(UsernameLabel, constraints);

	        JTextField emailTextField = new JTextField();
	        constraints.gridx = 1;
	        constraints.gridy = 1;
	        constraints.gridwidth = 1;
	        constraints.ipadx = 100; // add space for entering email
	        panel.add(emailTextField, constraints);

	        JLabel passwordLabel = new JLabel("Password:");
	        passwordLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        panel.add(passwordLabel, constraints);

	        JPasswordField passwordField = new JPasswordField();
	        constraints.gridx = 1;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        constraints.ipadx = 100; 
	        panel.add(passwordField, constraints);

	        JButton loginButton = new JButton("Login");
	        constraints.gridx = 0;
	        constraints.gridy = 3;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(20, 10, 10, 10);
	        panel.add(loginButton, constraints);

	        JLabel errorMessageLabel = new JLabel("");
	        errorMessageLabel.setForeground(Color.red); 
	        constraints.gridx = 0;
	        constraints.gridy = 4;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(errorMessageLabel, constraints);
	        
	     // Load image
	        ImageIcon image = new ImageIcon("C:\\Users\\GEETHIKA\\Downloads\\WhatsApp Image 2023-03-30 at 7.33.26 PM.jpeg");
	        
	        // Add image to panel
	        JLabel imageLabel = new JLabel(image);
	        panel.add(imageLabel);

	        loginButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String username = emailTextField.getText();
	                String password = new String(passwordField.getPassword());

	                if (username.equals("jaanu") && password.equals("1234")) {
	                    JOptionPane.showMessageDialog(null, "Login Successful!");
	                                   } else {
	                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
	                }
	            }
	            
	        });
	        
	        add(panel);
	        setVisible(true);
	        panel.setBackground(Color.yellow);
	        
	    }

	    public static void main(String[] args) {
	        LoginPage loginPage = new LoginPage();
	    }

}

