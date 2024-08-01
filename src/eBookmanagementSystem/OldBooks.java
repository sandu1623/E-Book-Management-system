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


public class OldBooks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OldBooks frame = new OldBooks();
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
	public OldBooks() {
		setTitle("old book page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1526, 815);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("E-Book Management System");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(659, 10, 444, 48);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 102));
		panel.setBounds(0, 0, 245, 778);
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
		btnNewButton.setBounds(34, 704, 139, 43);
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
		lblNewLabel_5.setBounds(0, -135, 245, 369);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\220px-Lolita_1955.jpg"));
		lblNewLabel_2.setBounds(308, 194, 235, 373);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\a-connecticut-yankee-in-king-arthurs-court-mark-twain.jpg"));
		lblNewLabel_2_1.setBounds(613, 194, 250, 373);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\download (2).jpg"));
		lblNewLabel_2_2.setBounds(921, 194, 260, 373);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\download.jpg"));
		lblNewLabel_2_3.setBounds(1245, 194, 257, 373);
		contentPane.add(lblNewLabel_2_3);
		
		JButton Lolitabtn = new JButton("Buy Now");
		Lolitabtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Lolitabtn.setBackground(new Color(30, 144, 255));
		Lolitabtn.setBounds(343, 711, 128, 39);
		contentPane.add(Lolitabtn);
		Lolitabtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 680.00; 
                String message = "Book: LOLITA\nAuthor: Vladimr Vabokov\nPrice: Rs. " + price
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
	
		
		JButton Kingbtn = new JButton("Buy Now");
		Kingbtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Kingbtn.setBackground(new Color(30, 144, 255));
		Kingbtn.setBounds(674, 711, 128, 39);
		contentPane.add(Kingbtn);
		Kingbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 790.00; 
                String message = "Book: A Connection Yankee In King Court \nAuthor: Mark twain\nPrice: Rs. " + price
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
		
		JButton Heidibtn = new JButton("Buy Now");
		Heidibtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Heidibtn.setBackground(new Color(30, 144, 255));
		Heidibtn.setBounds(975, 711, 128, 39);
		contentPane.add(Heidibtn);
		Heidibtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 580.00; 
                String message = "Book: HEIDI\nAuthor: JOhanna Spyri\nPrice: Rs. " + price
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
		
		JButton Rockbtn = new JButton("Buy Now");
		Rockbtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Rockbtn.setBackground(new Color(30, 144, 255));
		Rockbtn.setBounds(1329, 711, 128, 39);
		contentPane.add(Rockbtn);
		Rockbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 720.00; 
                String message = "Book: Brighton Rock\nAuthor: Graham Greene\nPrice: Rs. " + price
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
		
		JLabel LolitaLabel = new JLabel("LOLITA");
		LolitaLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LolitaLabel.setBounds(370, 577, 84, 33);
		contentPane.add(LolitaLabel);
		
		JLabel KingLabel = new JLabel("A Connection Yankee in King Court");
		KingLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		KingLabel.setBounds(613, 589, 260, 33);
		contentPane.add(KingLabel);
		
		JLabel HeidiLable = new JLabel("HEIDI");
		HeidiLable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HeidiLable.setBounds(1019, 589, 84, 33);
		contentPane.add(HeidiLable);
		
		JLabel Rocklable = new JLabel("Brighton Rock");
		Rocklable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Rocklable.setBounds(1324, 589, 145, 33);
		contentPane.add(Rocklable);
		
		JLabel lblNewLabel_3 = new JLabel("Vladimr Nabokov");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(343, 620, 174, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.              680.00");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(331, 657, 165, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mark Twain");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(678, 620, 113, 27);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Johanna Spyri");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(987, 620, 133, 27);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Graham Greene");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_3.setBounds(1311, 620, 139, 27);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Rs.              790.00");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(649, 657, 165, 27);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Rs.              580.00");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(975, 657, 165, 27);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Rs.              720.00");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_3.setBounds(1311, 657, 165, 27);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblOldBook = new JLabel("Old Book");
		lblOldBook.setForeground(new Color(0, 0, 0));
		lblOldBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOldBook.setBounds(308, 96, 125, 38);
		contentPane.add(lblOldBook);
	}
}
