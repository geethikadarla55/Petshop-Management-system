package Final;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
public class Home extends JFrame implements ActionListener {

	

	    JButton loginButton;
	    JButton registerButton;

	    public Home() {
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
	            
	            new LoginPage();
	            dispose();
	        } else if (e.getSource() == registerButton) {


	            new RegisterPage();
	            
	            dispose();
	            
	        }
	    }
	    

	    

	    public static void main(String[] args) {
	    	new Home();
	    	
	}
}


