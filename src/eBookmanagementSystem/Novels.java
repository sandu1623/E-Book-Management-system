package eBookmanagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Novels extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Novels frame = new Novels();
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
	public Novels() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 822);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 102));
		panel.setBounds(0, 0, 245, 785);
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
		
		JLabel KidsLabel = new JLabel("4) kids story");
		KidsLabel.setForeground(Color.WHITE);
		KidsLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		KidsLabel.setBounds(68, 536, 154, 38);
		panel.add(KidsLabel);
		KidsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KidsStorry kidbooks = new KidsStorry();
				kidbooks.setVisible(true);
                dispose();
				
				
			}
		});
		
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
		lblNewLabel_5.setBounds(0, -180, 245, 415);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E-Book Management System");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(674, 10, 444, 48);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\Madol_Duwa_poster.jpg"));
		lblNewLabel_2.setBounds(255, 162, 267, 373);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\41cmTFPesBL.jpg"));
		lblNewLabel_2_1.setBounds(561, 162, 267, 373);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\images (1).jpg"));
		lblNewLabel_2_2.setBounds(930, 162, 188, 373);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\images.jpg"));
		lblNewLabel_2_3.setBounds(1169, 162, 267, 373);
		contentPane.add(lblNewLabel_2_3);
		
		JButton btnMadolduwa = new JButton("Buy Now");
		btnMadolduwa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMadolduwa.setBackground(new Color(30, 144, 255));
		btnMadolduwa.setBounds(309, 714, 128, 39);
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
		
		JButton btnLostName = new JButton("Buy Now");
		btnLostName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLostName.setBackground(new Color(30, 144, 255));
		btnLostName.setBounds(641, 714, 128, 39);
		contentPane.add(btnLostName);
		btnLostName.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 550.00; 
	                String message = "Book: The Book of Lost name\nAuthor: Heatrhen Moris\nPrice: Rs. " + price
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
		
		
		JButton btnNarrowRoad = new JButton("Buy Now");
		btnNarrowRoad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNarrowRoad.setBackground(new Color(30, 144, 255));
		btnNarrowRoad.setBounds(950, 714, 128, 39);
		contentPane.add(btnNarrowRoad);
		btnNarrowRoad.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 450.00; 
	                String message = "Book: The Narrow Road Between Desirs \nAuthor: Ptrick Rothfuss\nPrice: Rs. " + price
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
		
		JButton btnLove = new JButton("Buy Now");
		btnLove.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLove.setBackground(new Color(30, 144, 255));
		btnLove.setBounds(1237, 714, 128, 39);
		contentPane.add(btnLove);
		btnLove.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                double price = 550.00; 
	                String message = "Book: Other name For Love\nAuthor: Taymour Soomro\nPrice: Rs. " + price
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
		
		
		JLabel lblNovels = new JLabel("Novels");
		lblNovels.setForeground(Color.BLACK);
		lblNovels.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNovels.setBounds(255, 85, 198, 38);
		contentPane.add(lblNovels);
		
		JLabel lblNewLabel_4 = new JLabel("Madol Doova");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(309, 561, 110, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Martin Wickramasinghe");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(273, 603, 261, 34);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Price            Rs. 350.00");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(273, 657, 199, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("The Book of Lost Name");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(603, 561, 198, 34);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("The Narrow Road ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(940, 545, 188, 34);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Between Desirs");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_3.setBounds(950, 573, 155, 34);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Other Name For Love");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_4.setBounds(1219, 561, 178, 34);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_7_1 = new JLabel("Heatrher Moris");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_1.setBounds(629, 603, 172, 34);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Ptrick Rothfuss");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_2.setBounds(960, 603, 155, 34);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Taymour Soomro");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_3.setBounds(1207, 603, 163, 34);
		contentPane.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Price            Rs. 550.00");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(603, 657, 199, 21);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price            Rs. 450.00");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(930, 657, 199, 21);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Price            Rs. 500.00");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_3.setBounds(1198, 657, 199, 21);
		contentPane.add(lblNewLabel_3_3);
	}

}
