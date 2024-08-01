package eBookmanagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.*;
import java.util.regex.Pattern;

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NameField;
	private JTextField emailField;
	private JTextField telField;
	private JTextField passwordField;
	private JTextField confiPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public RegisterPage() {
		setAutoRequestFocus(false);
		setTitle("RegisterForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1165, 779);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1157, 742);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\book-icon-138.png"));
		lblNewLabel.setBounds(10, 154, 525, 512);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-Book Management System ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(133, 14, 553, 68);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		panel_1.setBounds(536, 73, 553, 659);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		confiPasswordField = new JTextField();
		confiPasswordField.setBounds(169, 542, 295, 41);
		panel_1.add(confiPasswordField);
		confiPasswordField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Password");
		lblNewLabel_9.setBounds(43, 546, 110, 25);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_8 = new JLabel("Confirm\r\n ");
		lblNewLabel_8.setBounds(43, 510, 96, 25);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setBounds(43, 444, 110, 25);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		passwordField = new JTextField();
		passwordField.setBounds(169, 440, 296, 41);
		panel_1.add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("T-Number");
		lblNewLabel_6.setBounds(43, 367, 110, 25);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		telField = new JTextField();
		telField.setBounds(169, 363, 295, 41);
		panel_1.add(telField);
		telField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(43, 298, 81, 25);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		emailField = new JTextField();
		emailField.setBounds(169, 294, 295, 41);
		panel_1.add(emailField);
		emailField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setBounds(43, 228, 110, 25);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		NameField = new JTextField();
		NameField.setBounds(169, 224, 295, 41);
		panel_1.add(NameField);
		NameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Register Here.....");
		lblNewLabel_2.setBounds(43, 135, 352, 57);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JLabel lblNewLabel_3 = new JLabel("Registration Form");
		lblNewLabel_3.setBounds(43, 58, 352, 34);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		
		JButton registerbtn = new JButton("Register");
		registerbtn.setBounds(92, 610, 123, 34);
		panel_1.add(registerbtn);
		registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = NameField.getText();
		        String email = emailField.getText();
		        String telephone = telField.getText();
		        String password = passwordField.getText();
		        String confiPassword = confiPasswordField.getText();
		        
		     // Regular expression for email validation
		        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		        // Compile the regex pattern
		        Pattern pattern = Pattern.compile(emailRegex);

		        // Check if email matches the pattern
		        if (!pattern.matcher(email).matches()) {
		            JOptionPane.showMessageDialog(null, "Email should Start with capital letter and include @ and .com", "Email Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }

		        if (Name.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter your name", "Field Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }

		        if (telephone.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter your telephone number", "Field Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }

		        if (password.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter a password", "Field Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }

		        if (confiPassword.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please confirm your password", "Field Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }

		        if (!password.equals(confiPassword)) {
		            JOptionPane.showMessageDialog(null, "Passwords do not match", "Password Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method
		        }
		        
		        
		       
		        
		        try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-bookmanagement","root","");
		            PreparedStatement pstmt = con.prepareStatement("INSERT INTO  registerpage ( Name, email, telephone, password,confiPassword) VALUES ( ?, ?, ?,?,?)");
		           
		            pstmt.setString(1, Name);
		            pstmt.setString(2, email);
		            pstmt.setString(3, telephone);
		            pstmt.setString(4, password);
		            pstmt.setString(5, confiPassword);
		            int rowsAffected = pstmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Registration successful!");
		                
		                Customer_HomePage  customerHomePage= new Customer_HomePage();
		                customerHomePage.setVisible(true);
		                dispose(); 
		            } else {
		                JOptionPane.showMessageDialog(null, "Registration failed", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		            con.close();
		        } catch (Exception ex) {
		            System.out.println(ex);
		            JOptionPane.showMessageDialog(null, "An error occurred", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		
		registerbtn.setBackground(new Color(30, 144, 255));
		registerbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(309, 609, 136, 36);
		panel_1.add(btnBack);
		btnBack.setBackground(new Color(30, 144, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\open-book (2).png"));
		lblNewLabel_10.setBounds(23, 14, 100, 64);
		panel.add(lblNewLabel_10);
		 btnBack.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 CustomerLoginPage loginPage = new  CustomerLoginPage();
	                loginPage.setVisible(true);
	                dispose(); 
	            }
	        });
	}
}
