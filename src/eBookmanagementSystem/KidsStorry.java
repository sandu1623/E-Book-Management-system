package eBookmanagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class KidsStorry extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsStorry frame = new KidsStorry();
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
	public KidsStorry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1452, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("E-Book Management System");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(471, 10, 444, 48);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 102));
		panel.setBounds(0, 0, 245, 802);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Book Catagoureis");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 230, 225, 51);
		panel.add(lblNewLabel);
		
		JLabel NewBookLabel = new JLabel("1) New Book");
		NewBookLabel.setForeground(Color.WHITE);
		NewBookLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		NewBookLabel.setBounds(68, 291, 139, 38);
		panel.add(NewBookLabel);
NewBookLabel.addMouseListener(new MouseAdapter() {
			
			
			
			
			public void mouseClicked(MouseEvent e) {
				
				NewBooks newbooks = new NewBooks();
				newbooks.setVisible(true);
                dispose(); // Close the current login frame
			}
		
		});
		
		JLabel OldBookLabel = new JLabel("2) Old Book");
		OldBookLabel.setForeground(Color.WHITE);
		OldBookLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		OldBookLabel.setBounds(68, 371, 125, 38);
		panel.add(OldBookLabel);
		OldBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OldBooks oldbooks = new OldBooks();
				oldbooks.setVisible(true);
                dispose();
				
			}
		});
		
		JLabel NavalLabel = new JLabel("3) Novel");
		NavalLabel.setForeground(Color.WHITE);
		NavalLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		NavalLabel.setBounds(68, 450, 103, 38);
		panel.add(NavalLabel);
		NavalLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Novels novels = new Novels();
				novels.setVisible(true);
                dispose();
				
				
			}
		});
		
		JLabel KidsLabel = new JLabel("4) kids story");
		KidsLabel.setForeground(Color.WHITE);
		KidsLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		KidsLabel.setBounds(68, 536, 154, 38);
		panel.add(KidsLabel);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(34, 723, 139, 43);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                dispose(); 
            }
        });
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(34, 630, 137, 43);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Customer_HomePage customerHomePage = new Customer_HomePage();
                customerHomePage.setVisible(true);
                dispose(); 
            }
        });
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Stuff to Read While You're Pretending to Work_ 12_6_19 - Tony Gentilcore.jpg"));
		lblNewLabel_5.setBounds(0, -180, 245, 400);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Always-Anjali-400x507.jpg"));
		lblNewLabel_2.setBounds(255, 155, 267, 373);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Andy-Thats-My-Name-400x329.jpg"));
		lblNewLabel_2_1.setBounds(552, 155, 267, 373);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Chrysanthemum-1.jpg"));
		lblNewLabel_2_2.setBounds(871, 155, 267, 373);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\you-stole-my-name-400x257.jpg"));
		lblNewLabel_2_3.setBounds(1171, 155, 267, 373);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Anjali");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(327, 565, 110, 34);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Jessica Blank");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_1.setBounds(304, 609, 178, 34);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3 = new JLabel("Price            Rs. 350.00");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(283, 660, 199, 21);
		contentPane.add(lblNewLabel_3);
		
		JButton btnAjali = new JButton("Buy Now");
		btnAjali.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAjali.setBackground(new Color(30, 144, 255));
		btnAjali.setBounds(304, 709, 128, 39);
		contentPane.add(btnAjali);
		btnAjali.addActionListener(new ActionListener() {
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
		
		JButton btnAnny = new JButton("Buy Now");
		btnAnny.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAnny.setBackground(new Color(30, 144, 255));
		btnAnny.setBounds(639, 709, 128, 39);
		contentPane.add(btnAnny);
		btnAnny.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 250.00; 
	                String message = "Book: Anny\nAuthor: Tomie Depaark\nPrice: Rs. " + price
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
		
		JButton btnChrysmum = new JButton("Buy Now");
		btnChrysmum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnChrysmum.setBackground(new Color(30, 144, 255));
		btnChrysmum.setBounds(959, 709, 128, 39);
		contentPane.add(btnChrysmum);
		btnChrysmum .addActionListener(new ActionListener() {
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
		
		JButton btnYouStole = new JButton("Buy Now");
		btnYouStole.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnYouStole.setBackground(new Color(30, 144, 255));
		btnYouStole.setBounds(1254, 709, 128, 39);
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
		
		JLabel lblKidsStory = new JLabel("Kids Story");
		lblKidsStory.setForeground(Color.BLACK);
		lblKidsStory.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblKidsStory.setBounds(265, 87, 198, 38);
		contentPane.add(lblKidsStory);
		
		JLabel lblNewLabel_4_2 = new JLabel("You Stole My Name");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(1239, 565, 178, 34);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Cendav Marsal");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_2.setBounds(953, 609, 185, 34);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price            Rs. 200.00");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(1218, 660, 199, 21);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Cendav Marsal");
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_2_1.setBounds(1249, 609, 185, 34);
		contentPane.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("Chrysanthemum");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_3.setBounds(937, 565, 151, 34);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Price            Rs. 420.00");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_3.setBounds(937, 660, 199, 21);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Price            Rs. 250.00");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(602, 660, 199, 21);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Anny");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1_1.setBounds(658, 565, 75, 34);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Tomie Depaark");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_1_1.setBounds(639, 609, 128, 34);
		contentPane.add(lblNewLabel_7_1_1);
	}

}
