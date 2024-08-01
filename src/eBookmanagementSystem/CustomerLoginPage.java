package eBookmanagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class CustomerLoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Email_text;
	private JTextField password_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLoginPage frame = new CustomerLoginPage();
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
	public CustomerLoginPage() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1162, 638);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel IconLable = new JLabel("");
		IconLable.setBounds(0, 99, 530, 539);
		IconLable.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\book-icon-138.png"));
		panel.add(IconLable);
		
		JLabel Topic = new JLabel("E-Book Management System");
		Topic.setBounds(27, 22, 702, 40);
		Topic.setFont(new Font("Tahoma", Font.BOLD, 32));
		panel.add(Topic);
		
		

		
		 JButton admin_btn = new JButton("Admin");
		 admin_btn.setBounds(1034, 22, 103, 37);
	        admin_btn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                AdminLogin adminLogin = new AdminLogin();
	                adminLogin.setVisible(true);
	                dispose(); // Close the current login frame
	            }
	        });
	        admin_btn.setBackground(new Color(0, 153, 204));
	        admin_btn.setFont(new Font("Arial", Font.BOLD, 17));
	        admin_btn.setForeground(new Color(0, 0, 0));
	        panel.add(admin_btn);
	        
	        JLabel perspnIcon = new JLabel("");
	        perspnIcon.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\user.png"));
	        perspnIcon.setBounds(994, 22, 29, 33);
	        panel.add(perspnIcon);
	        
	        JLabel LogLabel = new JLabel("Login Form");
	        LogLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
	        LogLabel.setBounds(619, 84, 232, 40);
	        panel.add(LogLabel);
	        
	        JLabel Emailbtn = new JLabel("E Mail");
	        Emailbtn.setFont(new Font("Tahoma", Font.BOLD, 19));
	        Emailbtn.setBounds(619, 242, 130, 20);
	        panel.add(Emailbtn);
	        
	        JLabel Passwordbtn = new JLabel("Password");
	        Passwordbtn.setFont(new Font("Tahoma", Font.BOLD, 19));
	        Passwordbtn.setBounds(619, 317, 95, 26);
	        panel.add(Passwordbtn);
	        
	        JLabel lblNewLabel_6 = new JLabel("If You Don't Have an Account");
	        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
	        lblNewLabel_6.setBounds(625, 514, 226, 26);
	        panel.add(lblNewLabel_6);
	        
	        JButton Loginbtn = new JButton("Login");
	       
	        Loginbtn.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		try {
	        			 
	                     	Class.forName("com.mysql.jdbc.Driver");
	                     	Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/e-bookmanagement","root","");
	                    Statement stmt = con.createStatement();
	                    String sql = "Select * from customerlogin where email='"+Email_text.getText()+"' and password ='"+password_text.getText()+"'";
	                     ResultSet rs = stmt.executeQuery(sql);
	                  if(rs.next()) {
	                	  
	                JOptionPane.showMessageDialog(null, "Login Sucessfully...!");
					Customer_HomePage homePage = new Customer_HomePage();
		             homePage.setVisible(true);
		            
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong Email or Password","Message",JOptionPane.ERROR_MESSAGE);
					}
	                  con.close();
	        			 }
	        		catch(Exception E) {
	        			System.out.println(E);
	        		}
	        		
	        	}
	        });
	        Loginbtn.setBackground(new Color(0, 153, 204));
	        Loginbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
	        Loginbtn.setBounds(687, 409, 119, 40);
	        panel.add(Loginbtn);
	        
	        JButton Exitbtn = new JButton("Exit");
	        Exitbtn.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		System.exit(0);
	        	}
	        });
	        Exitbtn.setBackground(new Color(0, 153, 204));
	        Exitbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
	        Exitbtn.setBounds(905, 409, 119, 40);
	        panel.add(Exitbtn);
	        
	        
	        Email_text = new JTextField();
	        Email_text.setBounds(759, 236, 307, 37);
	        panel.add(Email_text);
	        Email_text.setColumns(10);
	        
	        password_text = new JTextField();
	        password_text.setBounds(759, 313, 307, 40);
	        panel.add(password_text);
	        password_text.setColumns(10);
	        
	        JLabel lblNewLabel = new JLabel("Welcome Our Customer......!!");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel.setBounds(619, 134, 316, 26);
	        panel.add(lblNewLabel);
	        
	        JLabel lblLoginHere = new JLabel("Login Here...");
	        lblLoginHere.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
	        lblLoginHere.setBounds(619, 170, 95, 26);
	        panel.add(lblLoginHere);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(153, 204, 255));
	        panel_1.setBounds(568, 76, 522, 498);
	        panel.add(panel_1);
	        panel_1.setLayout(null);
	        
	        JLabel lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\person-circle-question (2).png"));
	        lblNewLabel_1.setBounds(280, 433, 38, 24);
	        panel_1.add(lblNewLabel_1);
	        
	        JButton Registerbtn = new JButton("Register");
	        Registerbtn.setBounds(328, 433, 103, 26);
	        panel_1.add(Registerbtn);
	        Registerbtn.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		RegisterPage registerPage = new RegisterPage();
	        		registerPage.setVisible(true);
		             dispose(); 
	        	}
	        });
	        Registerbtn.setBackground(new Color(0, 153, 204));
	        Registerbtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        
	       
	       

	}
}
