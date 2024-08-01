package eBookmanagementSystem;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.regex.Pattern;

public class AdminLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField emailtext;
    private JTextField passwordtext;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminLogin frame = new AdminLogin();
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
    public AdminLogin() {
    	setTitle("AdminLoginForm");
        setForeground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1159, 841);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("E-Mail");
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 21));
        lblNewLabel_2.setBounds(573, 246, 103, 32);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Password");
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 21));
        lblNewLabel_3.setBounds(573, 354, 132, 42);
        contentPane.add(lblNewLabel_3);

        emailtext = new JTextField();
        emailtext.setBounds(718, 240, 395, 51);
        contentPane.add(emailtext);
        emailtext.setColumns(10);

        passwordtext = new JTextField();
        passwordtext.setBounds(718, 353, 395, 51);
        contentPane.add(passwordtext);
        passwordtext.setColumns(10);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	 String email = emailtext.getText().trim();
                 String password = passwordtext.getText();

             
                 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

             
                 Pattern pattern = Pattern.compile(emailRegex);

               
                 if (!pattern.matcher(email).matches()) {
                     JOptionPane.showMessageDialog(null, "Email should start with Capital letter");
                     return; // Exit the method if email is invalid
                 }
                try {
                	Class.forName("com.mysql.jdbc.Driver");
                	Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/e-bookmanagement","root","");
               Statement stmt = con.createStatement();
               String sql = "Select * from adminLogin where email='"+emailtext.getText()+"' and password ='"+passwordtext.getText()+"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()) {
                	JOptionPane.showMessageDialog(null, "Login Sucessfully...!");
                	AdminDashboard adminDashboard = new AdminDashboard();
                adminDashboard.setVisible(true);
                }
                else {
                	JOptionPane.showMessageDialog(null, "Incorrect email or password");
                }
                con.close();
                }catch(Exception e1) {
                	System.out.println(e1);
                }
            }
        });
        btnNewButton.setBackground(new Color(30, 144, 255));
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
        btnNewButton.setBounds(536, 528, 179, 56);
        contentPane.add(btnNewButton);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Arial", Font.BOLD, 18));
        btnCancel.setBackground(new Color(30, 144, 255));
        btnCancel.setBounds(736, 528, 179, 56);
        contentPane.add(btnCancel);
        
        JButton btnBack = new JButton("Back");
        btnBack.setFont(new Font("Arial", Font.BOLD, 18));
        btnBack.setBackground(new Color(30, 144, 255));
        btnBack.setBounds(934, 528, 179, 56);
        contentPane.add(btnBack);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\book-icon-138.png"));
        lblNewLabel_4.setBounds(10, 116, 512, 530);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblEbookManagementSystem = new JLabel("E-Book Management system");
        lblEbookManagementSystem.setFont(new Font("Arial", Font.BOLD, 32));
        lblEbookManagementSystem.setBounds(162, 10, 438, 64);
        contentPane.add(lblEbookManagementSystem);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(51, 204, 255));
        panel.setBounds(532, 85, 599, 539);
        contentPane.add(panel);
        panel.setLayout(null);
        
                JLabel lblNewLabel = new JLabel("Welcome Admin......!!!");
                lblNewLabel.setBounds(26, 67, 199, 64);
                panel.add(lblNewLabel);
                lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
                
                        JLabel lblNewLabel_1 = new JLabel("Admin Login Form");
                        lblNewLabel_1.setBounds(26, 25, 319, 56);
                        panel.add(lblNewLabel_1);
                        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 26));
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(30, 10, 80, 64);
        contentPane.add(lblNewLabel_5);
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\open-book (2).png"));
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               CustomerLoginPage loginPage = new  CustomerLoginPage();
                loginPage.setVisible(true);
                dispose(); 
            }
        });
        
        
    }
}
