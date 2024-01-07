package Final;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
public class PetShopGUI extends JFrame implements ActionListener { {


	    // Declare buttons
	    JButton homeButton;
	    JButton loginButton;
	    JButton registerButton;
	    JButton productDetailsButton;
	    JButton customerDetailsButton;
	    JButton missingDetailsButton;

	    public PetShopGUI() {
	        // Set title of window
	        setTitle("PAWS & CLAWS");

	        // Set layout of content pane
	        Container contentPane = getContentPane();
	        contentPane.setLayout(new BorderLayout());

	        // Create panel for buttons
	        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        HomeB = new JButton("Home");
	        loginButton = new JButton("Login");
	        registerButton = new JButton("Register");
	        productDetailsButton = new JButton("Product Details");
	        customerDetailsButton = new JButton("Customer Details");
	        missingDetailsButton = new JButton("Missing Details");

	        // Add action listeners to buttons
	        home.addActionListener(this);
	        login.addActionListener(this);
	        registerButt.addActionListener(this);
	        productDetailsButton.addActionListener(this);
	        customerDetailsButton.addActionListener(this);
	        missingDetailsButton.addActionListener(this);

	        // Add buttons to panel
	        buttonPanel.add(homeButton);
	        buttonPanel.add(loginButton);
	        buttonPanel.add(registerButton);
	        buttonPanel.add(productDetailsButton);
	        buttonPanel.add(customerDetailsButton);
	        buttonPanel.add(missingDetailsButton);

	        // Add panel to content pane
	        contentPane.add(buttonPanel, BorderLayout.NORTH);

	        // Set size and visibility of window
	        setSize(800, 800);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    // Action listener for buttons
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == homeButton) {
	            dispose();
	            new Home();
	        } else if (e.getSource() == loginButton) {
	            dispose();
	            new LoginPage();
	        } else if (e.getSource() == registerButton) {
	            dispose();
	            new RegisterPage();
	        } else if (e.getSource() == productDetailsButton) {
	            dispose();
	            new ProductDetailsGUI1();
	        } else if (e.getSource() == customerDetailsButton) {
	            dispose();
	            new CustomerDetailsGUI();
	        } else if (e.getSource() == missingDetailsButton) {
	            dispose();
	            new MissingDetailsGUI();
	        }
	    }

	    public static void main(String[] args) {
	        new PetShopGUI();
	    }
	}

	class Home extends JFrame implements ActionListener {
	    JButton loginButton;
	    JButton registerButton;

	    public Home() {
	        setTitle("PAWS & CLAWS");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        setLayout(new FlowLayout());
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());

	        ImageIcon image = new ImageIcon("C:\\Users\\BABY jahnavi\\Downloads\\pet1.jpg");

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
	            dispose();
	            new LoginPage();
	        } else if (e.getSource() == registerButton) {
	            dispose();
	            new RegisterPage();
	        }
	    }

	    public static void main

}
