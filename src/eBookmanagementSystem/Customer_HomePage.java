package eBookmanagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Customer_HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_HomePage frame = new Customer_HomePage();
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
	Color DefaultColor,ClickedColor;
	public Customer_HomePage() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 1111);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 245, 845);
		panel.setBackground(new Color(51, 153, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Catagoureis");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 230, 225, 51);
		panel.add(lblNewLabel);
		
		JLabel NewBookLabel = new JLabel("1) New Book");
		NewBookLabel.addMouseListener(new MouseAdapter() {
			
			
			
			
			public void mouseClicked(MouseEvent e) {
				
				NewBooks newbooks = new NewBooks();
				newbooks.setVisible(true);
                dispose(); // Close the current login frame
			}
		
		});
		NewBookLabel.setForeground(new Color(255, 255, 255));
		NewBookLabel.setLabelFor(this);
		NewBookLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		NewBookLabel.setBounds(68, 291, 139, 38);
		panel.add(NewBookLabel);
		
		JLabel OldBookLabel = new JLabel("2) Old Book");
		OldBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OldBooks oldbooks = new OldBooks();
				oldbooks.setVisible(true);
                dispose();
				
			}
		});
		OldBookLabel.setForeground(new Color(255, 255, 255));
		OldBookLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		OldBookLabel.setBounds(68, 371, 125, 38);
		panel.add(OldBookLabel);
		
		JLabel NavalLabel = new JLabel("3) Novel");
		NavalLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Novels novels = new Novels();
				novels.setVisible(true);
                dispose();
				
				
			}
		});
		NavalLabel.setForeground(new Color(255, 255, 255));
		NavalLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		NavalLabel.setBounds(68, 450, 103, 38);
		panel.add(NavalLabel);
		
		JLabel KidsLabel = new JLabel("4) kids story");
		KidsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KidsStorry kidbooks = new KidsStorry();
				kidbooks.setVisible(true);
                dispose();
				
				
			}
		});
		KidsLabel.setForeground(new Color(255, 255, 255));
		KidsLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		KidsLabel.setBounds(68, 536, 154, 38);
		panel.add(KidsLabel);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(34, 723, 139, 43);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                dispose(); 
            }
        });
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(34, 630, 137, 43);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 CustomerLoginPage loginPage = new  CustomerLoginPage();
                loginPage.setVisible(true);
                dispose(); 
            }
        });
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(47, 0, 147, 198);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\portfolio.png"));
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, NewBookLabel, OldBookLabel, NavalLabel, KidsLabel, btnNewButton, lblNewLabel_5, btnNewButton_1}));
		
		JLabel lblNewLabel_6 = new JLabel("E-Book Management System");
		lblNewLabel_6.setBounds(496, 23, 444, 48);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("All Books");
		lblNewLabel_1.setBounds(275, 118, 238, 39);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(275, 154, 267, 373);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Madol_Duwa_poster.jpg"));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price            Rs. 350.00");
		lblNewLabel_3.setBounds(306, 624, 199, 21);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_3);
		
		JButton btnMadolduwa = new JButton("Buy Now");
		btnMadolduwa.setBounds(332, 666, 128, 39);
		btnMadolduwa.setBackground(new Color(30, 144, 255));
		btnMadolduwa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(btnMadolduwa);
		 btnMadolduwa.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 350.00; 
	                String message = "Book: Madol Doova\nAuthor: Martin Wickramasinghe\nPrice: Rs. " + price
	                        + "\n\nDo you want to proceed with the purchase?";
	                
	                int option = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase",
	                        JOptionPane.YES_NO_OPTION);

	                if (option == JOptionPane.YES_OPTION) {
	                    // If user confirms purchase
	                    Object[] paymentOptions = { "Visa Card", "Bank Card", "Other" };
	                    int paymentOption = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment Options",
	                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, paymentOptions,
	                            paymentOptions[0]);

	                    if (paymentOption != JOptionPane.CLOSED_OPTION) {
	                        // User selected a payment option
	                        String selectedPaymentMethod = (String) paymentOptions[paymentOption];
	                        String cardDetails = JOptionPane.showInputDialog(null, "Enter your " + selectedPaymentMethod + " details:");
	                        if (cardDetails != null && !cardDetails.isEmpty()) {
	                            // Payment successful
	                            JOptionPane.showMessageDialog(null,
	                                    "Payment Successful!\nTotal Amount: Rs. " + price + "\nPayment Method: "
	                                            + selectedPaymentMethod + "\nCard Details: " + cardDetails);
	                            // Here you can add further actions like updating inventory or generating a bill
	                        } else {
	                            // Payment cancelled or empty input
	                            JOptionPane.showMessageDialog(null, "Payment Cancelled or Empty Input");
	                        }
	                    } else {
	                        // User closed the payment options dialog
	                        JOptionPane.showMessageDialog(null, "Payment Cancelled");
	                    }
	                } else {
	                    // If user cancels purchase
	                    JOptionPane.showMessageDialog(null, "Purchase Cancelled");
	                }
	            }
	        });
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(596, 154, 267, 373);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Always-Anjali-400x507.jpg"));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(915, 154, 267, 373);
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\you-stole-my-name-400x257.jpg"));
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(1216, 154, 314, 373);
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Chrysanthemum-1.jpg"));
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Price            Rs. 450.00");
		lblNewLabel_3_1.setBounds(631, 624, 199, 21);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price            Rs. 200.00");
		lblNewLabel_3_2.setBounds(948, 624, 199, 21);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Price            Rs. 420.00");
		lblNewLabel_3_3.setBounds(1296, 624, 199, 21);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_3_3);
		
		JButton btnAngali = new JButton("Buy Now");
		btnAngali.setBounds(663, 666, 128, 39);
		btnAngali.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAngali.setBackground(new Color(30, 144, 255));
		contentPane.add(btnAngali);
		btnAngali.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 450.00; 
	                String message = "Book: Anjali\nAuthor: Jessica Blank\nPrice: Rs. " + price
	                        + "\n\nDo you want to proceed with the purchase?";
	                
	                int option = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase",
	                        JOptionPane.YES_NO_OPTION);

	                if (option == JOptionPane.YES_OPTION) {
	                    // If user confirms purchase
	                    Object[] paymentOptions = { "Visa Card", "Bank Card", "Other" };
	                    int paymentOption = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment Options",
	                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, paymentOptions,
	                            paymentOptions[0]);

	                    if (paymentOption != JOptionPane.CLOSED_OPTION) {
	                        // User selected a payment option
	                        String selectedPaymentMethod = (String) paymentOptions[paymentOption];
	                        String cardDetails = JOptionPane.showInputDialog(null, "Enter your " + selectedPaymentMethod + " details:");
	                        if (cardDetails != null && !cardDetails.isEmpty()) {
	                            // Payment successful
	                            JOptionPane.showMessageDialog(null,
	                                    "Payment Successful!\nTotal Amount: Rs. " + price + "\nPayment Method: "
	                                            + selectedPaymentMethod + "\nCard Details: " + cardDetails);
	                            // Here you can add further actions like updating inventory or generating a bill
	                        } else {
	                            // Payment cancelled or empty input
	                            JOptionPane.showMessageDialog(null, "Payment Cancelled or Empty Input");
	                        }
	                    } else {
	                        // User closed the payment options dialog
	                        JOptionPane.showMessageDialog(null, "Payment Cancelled");
	                    }
	                } else {
	                    // If user cancels purchase
	                    JOptionPane.showMessageDialog(null, "Purchase Cancelled");
	                }
	            }
	        });
		
		JButton btnYouStole = new JButton("Buy Now");
		btnYouStole.setBounds(989, 666, 128, 39);
		btnYouStole.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnYouStole.setBackground(new Color(30, 144, 255));
		contentPane.add(btnYouStole);
		btnYouStole.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 200.00; 
                String message = "Book: You Stole My Name\nAuthor: Cendav Marsal\nPrice: Rs. " + price
                        + "\n\nDo you want to proceed with the purchase?";
                
                int option = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase",
                        JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    // If user confirms purchase
                    Object[] paymentOptions = { "Visa Card", "Bank Card", "Other" };
                    int paymentOption = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment Options",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, paymentOptions,
                            paymentOptions[0]);

                    if (paymentOption != JOptionPane.CLOSED_OPTION) {
                        // User selected a payment option
                        String selectedPaymentMethod = (String) paymentOptions[paymentOption];
                        String cardDetails = JOptionPane.showInputDialog(null, "Enter your " + selectedPaymentMethod + " details:");
                        if (cardDetails != null && !cardDetails.isEmpty()) {
                            // Payment successful
                            JOptionPane.showMessageDialog(null,
                                    "Payment Successful!\nTotal Amount: Rs. " + price + "\nPayment Method: "
                                            + selectedPaymentMethod + "\nCard Details: " + cardDetails);
                            // Here you can add further actions like updating inventory or generating a bill
                        } else {
                            // Payment cancelled or empty input
                            JOptionPane.showMessageDialog(null, "Payment Cancelled or Empty Input");
                        }
                    } else {
                        // User closed the payment options dialog
                        JOptionPane.showMessageDialog(null, "Payment Cancelled");
                    }
                } else {
                    // If user cancels purchase
                    JOptionPane.showMessageDialog(null, "Purchase Cancelled");
                }
            }
        });
		
		JButton btnChrymum = new JButton("Buy Now");
		btnChrymum.setBounds(1337, 666, 128, 39);
		btnChrymum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnChrymum.setBackground(new Color(30, 144, 255));
		contentPane.add(btnChrymum);
		btnChrymum .addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 420.00; 
                String message = "Book: Chrysanthemum\nAuthor: Kevin Henkes\nPrice: Rs. " + price
                        + "\n\nDo you want to proceed with the purchase?";
                
                int option = JOptionPane.showConfirmDialog(null, message, "Confirm Purchase",
                        JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    // If user confirms purchase
                    Object[] paymentOptions = { "Visa Card", "Bank Card", "Other" };
                    int paymentOption = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment Options",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, paymentOptions,
                            paymentOptions[0]);

                    if (paymentOption != JOptionPane.CLOSED_OPTION) {
                        // User selected a payment option
                        String selectedPaymentMethod = (String) paymentOptions[paymentOption];
                        String cardDetails = JOptionPane.showInputDialog(null, "Enter your " + selectedPaymentMethod + " details:");
                        if (cardDetails != null && !cardDetails.isEmpty()) {
                            // Payment successful
                            JOptionPane.showMessageDialog(null,
                                    "Payment Successful!\nTotal Amount: Rs. " + price + "\nPayment Method: "
                                            + selectedPaymentMethod + "\nCard Details: " + cardDetails);
                            // Here you can add further actions like updating inventory or generating a bill
                        } else {
                            // Payment cancelled or empty input
                            JOptionPane.showMessageDialog(null, "Payment Cancelled or Empty Input");
                        }
                    } else {
                        // User closed the payment options dialog
                        JOptionPane.showMessageDialog(null, "Payment Cancelled");
                    }
                } else {
                    // If user cancels purchase
                    JOptionPane.showMessageDialog(null, "Purchase Cancelled");
                }
            }
        });
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Madol Doova");
		lblNewLabel_4.setBounds(332, 544, 110, 34);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Martin Wickramasinghe");
		lblNewLabel_7.setBounds(306, 579, 261, 34);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("AnJali");
		lblNewLabel_4_1.setBounds(681, 544, 110, 34);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("You Stole My Name");
		lblNewLabel_4_2.setBounds(989, 544, 178, 34);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Chrysanthemum");
		lblNewLabel_4_3.setBounds(1355, 544, 151, 34);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("Jessica Blank");
		lblNewLabel_7_1.setBounds(650, 579, 178, 34);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Cendav Marsal");
		lblNewLabel_7_2.setBounds(997, 580, 185, 34);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Kevin Henkes");
		lblNewLabel_7_3.setBounds(1344, 579, 151, 34);
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_7_3);

		

	}
}
