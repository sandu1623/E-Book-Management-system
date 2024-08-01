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


public class NewBooks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBooks frame = new NewBooks();
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
	public NewBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("E-Book Management System");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(655, 29, 444, 48);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(0, 0, 245, 794);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Book Catagoureis");
		lblNewLabel.setForeground(Color.WHITE);
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


		NewBookLabel.setForeground(Color.WHITE);
		NewBookLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		NewBookLabel.setBounds(68, 291, 139, 38);
		panel.add(NewBookLabel);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\book.png"));
		lblNewLabel_1.setBounds(34, 21, 167, 153);
		panel.add(lblNewLabel_1);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Customer_HomePage customerHomePage = new Customer_HomePage();
                customerHomePage.setVisible(true);
                dispose(); 
            }
        });
		
		JLabel lblNewBook = new JLabel("New Books");
		lblNewBook.setForeground(new Color(0, 0, 0));
		lblNewBook.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewBook.setBounds(278, 109, 198, 38);
		contentPane.add(lblNewBook);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\The-New-Education-e1634665514677.png"));
		lblNewLabel_2.setBounds(185, 169, 351, 373);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\133708_16464623_2980308_f4627893_thumbnail.png"));
		lblNewLabel_2_1.setBounds(571, 156, 267, 373);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\51a+BbaKwjL._SL500_.jpg"));
		lblNewLabel_2_2.setBounds(871, 156, 313, 373);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("The New Education");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(322, 552, 159, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("N.Davidson");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(311, 596, 261, 34);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Price            Rs. 750.00");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(311, 641, 199, 21);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewEducation = new JButton("Buy Now");
		btnNewEducation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewEducation.setBackground(new Color(30, 144, 255));
		btnNewEducation.setBounds(337, 689, 128, 39);
		contentPane.add(btnNewEducation);
		btnNewEducation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 750.00; 
                String message = "Book: The New Education\nAuthor: N.Davidson\nPrice: Rs. " + price
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
		
		JButton btnOrganic = new JButton("Buy Now");
		btnOrganic.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOrganic.setBackground(new Color(30, 144, 255));
		btnOrganic.setBounds(621, 689, 128, 39);
		contentPane.add(btnOrganic);
		btnOrganic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 990.00; 
                String message = "Book: Organic Chemistry\nAuthor: Peter C. Vollhard\nPrice: Rs. " + price
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
		
		JButton btnSchool = new JButton("Buy Now");
		btnSchool.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSchool.setBackground(new Color(30, 144, 255));
		btnSchool.setBounds(936, 689, 128, 39);
		contentPane.add(btnSchool);
		btnSchool.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 1200.00; 
                String message = "Book: The School of Life\nAuthor: Maxwith Navon\nPrice: Rs. " + price
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
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\cutting_school_pb_final.jpg"));
		lblNewLabel_2_2_1.setBounds(1217, 156, 267, 373);
		contentPane.add(lblNewLabel_2_2_1);
		
		JButton btnCuttingS = new JButton("Buy Now");
		btnCuttingS.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCuttingS.setBackground(new Color(30, 144, 255));
		btnCuttingS.setBounds(1302, 689, 128, 39);
		contentPane.add(btnCuttingS);
		btnCuttingS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                double price = 950.00; 
                String message = "Book: Cutting the.. School\nAuthor: Tayari Jesica\nPrice: Rs. " + price
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
		
		JLabel lblNewLabel_4_1 = new JLabel("Organic Chemistry");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(627, 552, 159, 34);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("The School of Life");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(952, 552, 159, 34);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Cutting the.. School");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_3.setBounds(1271, 552, 159, 34);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel nameLable = new JLabel("Peter C. Vollhard");
		nameLable.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nameLable.setBounds(637, 596, 144, 34);
		contentPane.add(nameLable);
		
		JLabel lblNewLabel_7_2 = new JLabel("Maxwith Navon");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_2.setBounds(962, 596, 183, 34);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("Tayari jesica");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_7_1.setBounds(1286, 596, 144, 34);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Price            Rs. 990.00");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(602, 641, 199, 21);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price            Rs. 1200.00");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(918, 641, 199, 21);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Price            Rs. 950.00");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_3.setBounds(1254, 641, 199, 21);
		contentPane.add(lblNewLabel_3_3);
	}
}
