package Final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MissingDetails extends JFrame implements ActionListener { 
	

	

	    private JLabel nameLabel, ageLabel, weightLabel, featuresLabel, imageLabel;
	    private JTextField nameTextField, ageTextField, weightTextField, featuresTextField;
	    private JButton submitButton;
	    private JButton uploadButton;
	    private ImageIcon imageIcon;

	    public MissingDetails() {
	        super("Missing Details");

	        nameLabel = new JLabel("Product Name");
	        ageLabel = new JLabel("Age");
	        weightLabel = new JLabel("Weight");
	        featuresLabel = new JLabel("Unique Features");
	        imageLabel = new JLabel();

	        nameTextField = new JTextField(20);
	        ageTextField = new JTextField(20);
	        weightTextField = new JTextField(20);
	        featuresTextField = new JTextField(20);

	        submitButton = new JButton("Submit");
	        submitButton.addActionListener(this);

	        uploadButton = new JButton("Upload Image");
	        uploadButton.addActionListener(this);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        panel.add(nameLabel, constraints);
	        panel.setBackground(Color.BLUE);
	        constraints.gridx = 1;
	        panel.add(nameTextField, constraints);
	        panel.setBackground(Color.blue);
	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        panel.add(ageLabel, constraints);
	        panel.setBackground(Color.blue);
	        constraints.gridx = 1;
	        panel.add(ageTextField, constraints);

	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        panel.add(weightLabel, constraints);
	        panel.setBackground(Color.blue);
	        constraints.gridx = 1;
	        panel.add(weightTextField, constraints);

	        constraints.gridx = 0;
	        constraints.gridy = 3;
	        panel.add(featuresLabel, constraints);
	        panel.setBackground(Color.blue);
	        constraints.gridx = 1;
	        panel.add(featuresTextField, constraints);

	        constraints.gridx = 0;
	        constraints.gridy = 4;
	        panel.add(uploadButton, constraints);
	        panel.setBackground(Color.blue);
	        constraints.gridx = 1;
	        constraints.gridy = 4;
	        panel.add(submitButton, constraints);

	        constraints.gridx = 0;
	        constraints.gridy = 5;
	        constraints.gridwidth = 2;
	        panel.add(imageLabel, constraints);

	        add(panel);
	        setSize(500, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == submitButton) {
	            String name = nameTextField.getText();
	            String age = ageTextField.getText();
	            String weight = weightTextField.getText();
	            String features = featuresTextField.getText();

	            // TODO: Do something with the form data

	            JOptionPane.showMessageDialog(this, "Form submitted successfully");
	        } else if (e.getSource() == uploadButton) {
	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(this);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
	                imageIcon = new ImageIcon(filePath);
	                imageLabel.setIcon(imageIcon);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        new MissingDetails();
	    }
	}