package Final;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class PetshopGUI3 {
	

	public class PetShopGUI3 extends JFrame implements ActionListener {
	    // Declare buttons
	    JButton homeButton;
	    JButton loginButton;
	    JButton registerButton;
	    JButton productDetailsButton;
	    JButton customerDetailsButton;
	    JButton missingDetailsButton;

	    public PetShopGUI3() {
	        // Set title of window
	        setTitle("PAWS & CLAWS");

	        // Set layout of content pane
	        Container contentPane = getContentPane();
	        contentPane.setLayout(new BorderLayout());

	        // Create panel for buttons
	        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        homeButton = new JButton("Home");
	        loginButton = new JButton("Login");
	        registerButton = new JButton("Register");
	        productDetailsButton = new JButton("Product Details");
	        customerDetailsButton = new JButton("Customer Details");
	        missingDetailsButton = new JButton("Missing Details");

	        // Add action listeners to buttons
	        homeButton.addActionListener(this);
	        loginButton.addActionListener(this);
	        registerButton.addActionListener(this);
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
	        }else {
	            dispose();
	            new ProductDetailsGUI1(); 
	           
	    }
	    class  LoginPage extends JFrame implements ActionListener {
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
		        ImageIcon image = new ImageIcon("C:\\Users\\BABY jahnavi\\Downloads\\homepet.jpg");
		        
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

	    	public void actionPerformed1(ActionEvent e) {
	    		if (e.getSource() == loginButton) {
		            dispose();
		            System.out.println("login succesfully");
	    		}
	  
	    		
				
			}
	    	class RegisterPage extends JFrame implements ActionListener {

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

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() ==registerButton ) {
			            dispose();
			            System.out.println("Register succesfully");
			            
			            
					
				}
	    		}



				
	    	}
				
	    class  ProductDetailsGUI1 extends JFrame implements ActionListener {

	    	private JTable table;
		    private DefaultTableModel tableModel;
		    private JTextField nameField;
		    private JTextField ageField;
		    private JTextField colorField;
		    private JTextField weightField;
		    private JButton submitButton;

		    public ProductDetailsGUI1() {
		        // Set title of window
		        setTitle("Product Details Form");
		        
		         
		        // Set layout of content pane
		        Container contentPane = getContentPane();
		        contentPane.setLayout(new BorderLayout());
	JLabel headingLabel=new JLabel("PRODUCT DETAILS");
	headingLabel.setFont(new Font("Arial",Font.BOLD,18));
	headingLabel.setHorizontalAlignment(JLabel.CENTER);


		        // Create panel for product details
		        JPanel productPanel = new JPanel();
		        ImageIcon imageIcon = new ImageIcon("C:\\Users\\GEETHIKA\\eclipse-workspace\\PETMANAGEMENTSYSTEM\\src\\PROJECT\\petshop.png");

			     // Create a JLabel and set its icon to the loaded image
			     JLabel imageLabel = new JLabel(imageIcon);

			     // Add the JLabel to the productPanel
			     productPanel.add(imageLabel);
		        productPanel.add(new JLabel("Product Name:"));
		        nameField = new JTextField(5);
		        productPanel.add(nameField);
		        productPanel.add(new JLabel("Product Age:"));
		        ageField = new JTextField(5);
		        productPanel.add(ageField);
		        productPanel.add(new JLabel("Product Color:"));
		        colorField = new JTextField(5);
		        productPanel.add(colorField);
		        productPanel.add(new JLabel("Product Weight:"));
		        weightField = new JTextField(5);
		        productPanel.add(weightField);
		        productPanel.setBackground(Color.RED);
		       
		        // Create table with table model
		        tableModel = new DefaultTableModel(new Object[][]{}, new String[]{"Product Name", "Product Age", "Product Color", "Product Weight"});
		        table = new JTable(tableModel);
		        table.setPreferredSize(new Dimension(550, 450));
	         table.setBackground(Color.cyan);
	         
		        // Create table panel with GridBagLayout
		        JPanel tablePanel = new JPanel(new GridBagLayout());

		        // Set constraints for table
		        GridBagConstraints gbc = new GridBagConstraints();
		        gbc.gridx = 0;
		        gbc.gridy = 0;
		        gbc.fill = GridBagConstraints.HORIZONTAL;
		        gbc.anchor = GridBagConstraints.CENTER;

		        // Add table to panel with constraints
		        tablePanel.add(new JScrollPane(table), gbc);

		        // Create panel for submit button
		        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        submitButton = new JButton("Submit");
		        submitButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	
		        
		                String[] rowData = new String[]{nameField.getText(), ageField.getText(), colorField.getText(), weightField.getText()};
		                tableModel.addRow(rowData);

		                // Clear product details fields
		                nameField.setText("");
		                ageField.setText("");
		                colorField.setText("");
		                weightField.setText("");
		                
		            }
		        });
		        buttonPanel.add(submitButton);

		        // Add panels to content pane

		        contentPane.add(productPanel, BorderLayout.WEST);
		        contentPane.add(tablePanel, BorderLayout.CENTER);
		        contentPane.add(buttonPanel, BorderLayout.SOUTH);
		        contentPane.add(headingLabel, BorderLayout.NORTH);
		        // Set size and visibility of window
		        setSize(800, 800);
		        setVisible(true);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == submitButton) {
	            dispose();
	            new CustomerDetails();
	        } 
			
	    }
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
			  public static void main(String[] args) {
				  
					    PetShopGUI3 gui = new PetShopGUI3();
					  }
				  }
	       

		
			
		}
	    }
	}





	    