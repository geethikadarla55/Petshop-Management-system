package Final;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;
public class ProductDetailsGUI1 extends JFrame {

		    private JTable table;
		    private DefaultTableModel tableModel;
		    private JTextField nameField;
		    private JTextField ageField;
		    private JTextField colorField;
		    private JTextField weightField;
		    JButton OKButton;
		    JButton submitButton;


		    public ProductDetailsGUI1() {
		        // Set title of window
		        setTitle("Product Details Form");

		        // Set layout of content pane
		        Container contentPane = getContentPane();
		        contentPane.setLayout(new BorderLayout());

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

		        // Create panel for buttons
		        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        
		        // Create and add Ok button
		        JButton okButton = new JButton("Ok");
		        okButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Add product details to table
		                String[] rowData = new String[]{nameField.getText(), ageField.getText(), colorField.getText(), weightField.getText()};
		                tableModel.addRow(rowData);

		                // Clear product details fields
		                nameField.setText("");
		                ageField.setText("");
		                colorField.setText("");
		                weightField.setText("");
		            }
		        });
		        buttonPanel.add(okButton);
		        
		        // Create and add Submit button
		        JButton submitButton = new JButton("Submit");
		        submitButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	 CustomerDetails customerDetails = new CustomerDetails();
		                // ...
		            }
		        });
		        buttonPanel.add(submitButton);

		        // Add panels to content pane
		        contentPane.add(productPanel, BorderLayout.WEST);
		        contentPane.add(tablePanel, BorderLayout.CENTER);
		        contentPane.add(buttonPanel, BorderLayout.SOUTH);

		        // Set size and visibility of window
		        setSize(800, 800);
		        setVisible(true);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

		        public static  void main(String[] args) {
			        new ProductDetailsGUI1();
			    }
		        }
		        
		        

		        
		    



		        
		    

		
		       