package Final;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class CustomerDetails extends JFrame {
	
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneField;
    private JTextField transactionIdField;
    private JTextField amountField;
    JButton OKButton;
    JButton submitButton;

    public CustomerDetails() {
        // Set title of window
        setTitle("Customer Details Form");

        // Set layout of content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // Create panel for customer details
        JPanel customerPanel = new JPanel(new GridLayout(0, 2));
        customerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        customerPanel.setBackground(new Color(204, 229, 250));
        customerPanel.add(new JLabel("Customer Name:"));
        nameField = new JTextField(10);
        customerPanel.add(nameField);
        customerPanel.add(new JLabel("Customer Address:"));
        addressField = new JTextField(10);
        customerPanel.add(addressField);
        customerPanel.add(new JLabel("Customer Phone Number:"));
        phoneField = new JTextField(10);
        customerPanel.add(phoneField);
        customerPanel.add(new JLabel("Transaction id"));
        transactionIdField = new JTextField(10);
        customerPanel.add(transactionIdField);
        customerPanel.add(new JLabel("amountField"));
        amountField = new JTextField(10);
        customerPanel.add(amountField);
        
        

        // Create table with table model
        tableModel = new DefaultTableModel(new Object[][]{}, new String[]{"Transaction ID", "Amount"});
        table = new JTable(tableModel);
        table.setPreferredSize(new Dimension(550, 450));
        table.setBackground(Color.cyan);

        // Create table panel with GridBagLayout
        JPanel tablePanel = new JPanel();

        // Set constraints for table
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;

        // Add table to panel with constraints
        tablePanel.add(new JScrollPane(table), gbc);

        

        // Create panel for submit button
     // Create panel for submit button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
       
        // Create and add Ok button
        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 // Add customer and transaction details to table
                String[] rowData = new String[]{transactionIdField.getText(), amountField.getText()};
                tableModel.addRow(rowData);
                
                transactionIdField.setText("");
                amountField.setText("");
            }
       
        });
        buttonPanel.add(okButton);
        
        // Create and add Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 MissingDetails  MissingDetails= new MissingDetails();
                // ...
            }
        });
        buttonPanel.add(submitButton);

        // Add panels to content pane
        contentPane.add(customerPanel, BorderLayout.NORTH);
        contentPane.add(tablePanel, BorderLayout.CENTER);
        contentPane.add(tablePanel, BorderLayout.WEST);
        contentPane.add(buttonPanel, BorderLayout.AFTER_LAST_LINE);

        // Set size and visibility of window
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CustomerDetails();
    }

	public JButton getSubmitButton() {
		return submitButton;
	}

	}