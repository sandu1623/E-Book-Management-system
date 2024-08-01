package eBookmanagementSystem;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class AdminDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField NameField;
	private JTextField AuthorField;
	private JTextField QuantityField;
	private JTextField priceField;
	private JTable table;
	protected String imgPath;
	protected DefaultTableModel model;
	private JTextField searchIDField;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AdminDashboard() {
		setTitle("Admin Dashbord");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1269, 695);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(0, 0, 145, 658);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Back = new JLabel("Back");
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 AdminLogin loginPage = new AdminLogin();
	                loginPage.setVisible(true);
	                dispose(); 

			}
		});
		Back.setFont(new Font("Tahoma", Font.BOLD, 16));
		Back.setBounds(37, 468, 61, 20);
		panel.add(Back);
		
		JLabel alogaout = new JLabel("Log Out");
		alogaout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  dispose(); 

			}
		});
		alogaout.setFont(new Font("Tahoma", Font.BOLD, 16));
		alogaout.setBounds(37, 532, 79, 27);
		panel.add(alogaout);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\EAD_CW_Project\\src\\eBookmanagementSystem\\books.png"));
		lblNewLabel_3.setBounds(0, 0, 145, 158);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("E-Book management System Admin Dashbord");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(370, 10, 680, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Manage Books");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(170, 58, 275, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel IdLable = new JLabel("Book ID");
		IdLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		IdLable.setBounds(168, 103, 90, 25);
		contentPane.add(IdLable);
		
		JLabel NameLable = new JLabel("Book Name");
		NameLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		NameLable.setBounds(170, 151, 116, 25);
		contentPane.add(NameLable);
		
		JLabel AuthorLable = new JLabel("Author Name");
		AuthorLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		AuthorLable.setBounds(170, 195, 116, 25);
		contentPane.add(AuthorLable);
		
		JLabel QuantityLabel = new JLabel("Quntity");
		QuantityLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		QuantityLabel.setBounds(168, 239, 90, 25);
		contentPane.add(QuantityLabel);
		
		JLabel PriceLabel = new JLabel("Price");
		PriceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		PriceLabel.setBounds(168, 283, 90, 25);
		contentPane.add(PriceLabel);
		
		JLabel CtegorieLabel = new JLabel("Catogery");
		CtegorieLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		CtegorieLabel.setBounds(170, 332, 90, 25);
		contentPane.add(CtegorieLabel);
		
		JLabel PhotoLabel1 = new JLabel("");
		PhotoLabel1.setFont(new Font("Tahoma", Font.BOLD, 16));
		PhotoLabel1.setBounds(291, 380, 221, 148);
		contentPane.add(PhotoLabel1);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id.setBounds(291, 93, 221, 34);
		contentPane.add(id);
		id.setColumns(10);
		
		NameField = new JTextField();
		NameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NameField.setColumns(10);
		NameField.setBounds(291, 142, 221, 34);
		contentPane.add(NameField);
		
		AuthorField = new JTextField();
		AuthorField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AuthorField.setColumns(10);
		AuthorField.setBounds(291, 191, 221, 34);
		contentPane.add(AuthorField);
		
		QuantityField = new JTextField();
		QuantityField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		QuantityField.setColumns(10);
		QuantityField.setBounds(291, 235, 221, 34);
		contentPane.add(QuantityField);
		
		priceField = new JTextField();
		priceField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceField.setColumns(10);
		priceField.setBounds(291, 279, 221, 34);
		contentPane.add(priceField);
		
		JComboBox CategoriescomboBox = new JComboBox();
		CategoriescomboBox.setModel(new DefaultComboBoxModel(new String[] {"Novel", "Kids Storry", "old Book", "New Book"}));
		CategoriescomboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CategoriescomboBox.setBounds(291, 336, 221, 34);
		contentPane.add(CategoriescomboBox);
		
		JLabel kk = new JLabel("Photo");
		kk.setFont(new Font("Tahoma", Font.BOLD, 16));
		kk.setBackground(UIManager.getColor("Button.light"));
		kk.setForeground(UIManager.getColor("CheckBox.foreground"));
		kk.setBounds(169, 380, 117, 38);
		contentPane.add(kk);
		
		JButton Browsbtn = new JButton("Brows");
		Browsbtn.addMouseListener(new MouseAdapter() {
			public ImageIcon ResizePhoto(String ImagePath, byte[] pic)
			{
			ImageIcon MyImage = null;
			if(ImagePath != null)
			{
				MyImage = new ImageIcon(ImagePath);
				}
			else {
				MyImage = new ImageIcon(pic);
			}
			Image img = MyImage.getImage();
			Image newImg = img.getScaledInstance(PhotoLabel1.getWidth(),PhotoLabel1.getHeight(),Image.SCALE_SMOOTH);
			ImageIcon image = new ImageIcon(newImg);
			return image;
			}

			public void mouseClicked(MouseEvent e) {

				JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));

				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
				file.addChoosableFileFilter(filter);
				int result = file.showSaveDialog(file);

				if(result == JFileChooser.APPROVE_OPTION)
				{
				File selectedFile = file.getSelectedFile();
				String path = selectedFile.getAbsolutePath();
				
				PhotoLabel1.setIcon(ResizePhoto(path,null));
				imgPath = path;
				}
			else if(result == JFileChooser.CANCEL_OPTION)
			{
				JOptionPane.showMessageDialog(null, "No file Selected");
			}

				
				
				
			}
		});
		
		

		Browsbtn.setBackground(new Color(51, 153, 204));
		Browsbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		Browsbtn.setBounds(348, 538, 85, 21);
		contentPane.add(Browsbtn);
		
		JButton Insertbtn = new JButton("Insert");
		Insertbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		    	
		        String bookId = id.getText();
		        String bookName = NameField.getText();
		        String authorName = AuthorField.getText();
		        String category = CategoriescomboBox.getSelectedItem().toString();
		        String price = priceField.getText();
		        String quantity = QuantityField.getText();
		        byte[] photoBytes = null;
		        
		     

		        // Check if any required field is empty
		        if (bookId.isEmpty() || bookName.isEmpty() || authorName.isEmpty() || category.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill in all the required fields", "Error", JOptionPane.ERROR_MESSAGE);
		            return; // Exit the method if any required field is empty
		        }

		        // Get photo as byte array
		        if (imgPath != null) {
		            try {
		                File imgFile = new File(imgPath);
		                FileInputStream fis = new FileInputStream(imgFile);
		                ByteArrayOutputStream bos = new ByteArrayOutputStream();
		                byte[] buf = new byte[1024];
		                for (int readNum; (readNum = fis.read(buf)) != -1;) {
		                    bos.write(buf, 0, readNum);
		                }
		                photoBytes = bos.toByteArray();
		                fis.close();
		                bos.close();
		            } catch (IOException ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
		            }
		        }

		        try {
		            // Database connection and insertion code...
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/e-bookmanagement","root","");
		            String query = "INSERT INTO booktablee (BookId, BookName, AuthorName, BookCat, BookPrice, BookQt, BookPt) VALUES (?, ?, ?, ?, ?, ?, ?)";
		            PreparedStatement preparedStatement = connection.prepareStatement(query);
		            
		           
		            preparedStatement.setString(1, bookId);
		            preparedStatement.setString(2, bookName);
		            preparedStatement.setString(3, authorName);
		            preparedStatement.setString(4, category);
		            preparedStatement.setString(5, price);
		            preparedStatement.setString(6, quantity);
		            preparedStatement.setBytes(7, photoBytes);
		            int rowsInserted = preparedStatement.executeUpdate();
		            
		            
		            if (rowsInserted > 0) {
		                Object[] rowData = {bookId, bookName, authorName, quantity, price, category, photoBytes};
		                model.addRow(rowData);
		                JOptionPane.showMessageDialog(null, "Insert Successfully");
		            }
		            preparedStatement.close();
		            connection.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		     // Insert into JTable model
		        Object[] rowData = {bookId, bookName, authorName, quantity, price, category, photoBytes};
		        model.addRow(rowData);
		        JOptionPane.showMessageDialog(null, "Data inserted successfully");
		    
		    }
		});



		Insertbtn.setBackground(new Color(51, 153, 204));
		Insertbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		Insertbtn.setBounds(175, 605, 111, 34);
		contentPane.add(Insertbtn);
		
		JButton Deletebtn = new JButton("Delete");
		Deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			
				
				  String url = "Jdbc:mysql://localhost:3306/e-bookmanagement";
			    	String username = "root";
			    	String password = "";
			    	
			    	
			    	try {
			    		
			    		String bid;
			    		
			    		bid = id.getText();
			    		
			    		Class.forName("com.mysql.jdbc.Driver");
			    		
//			    		Connection connection = Connection
			            Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/e-bookmanagement","root","");
			            
			            Statement st = connection.createStatement();
			            
			            String deleteQuery = "DELETE FROM booktablee WHERE BookId = ?";
			            
//			            PrepareStatement delete = connection.prepareStatement(deleteQuery);
			            PreparedStatement delete = connection.prepareStatement(deleteQuery);
			            
			            delete.setString(1, bid);
			            
			            delete.executeUpdate();
			            
			            
				        JOptionPane.showMessageDialog(null, "Data Deleted successfully");
				        
				        id.setText("");
				        NameField.setText("");
				        AuthorField.setText("");
				        QuantityField.setText("");
				        priceField.setText("");
				        CategoriescomboBox.setSelectedItem("");
				        kk.setIcon(null);
				        
				        
				        

			            
			            connection.close();

			    	}
			    	catch(Exception ex) {
			    		
			    		System.out.println(ex);
			    		JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());			    	}
			    	
				

			}
		});
		Deletebtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		Deletebtn.setBackground(new Color(51, 153, 204));
		Deletebtn.setBounds(334, 605, 111, 34);
		contentPane.add(Deletebtn);
		
		JButton Updatebtn = new JButton("Update");
		Updatebtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				model.setValueAt(id.getText(),i,0);
				model.setValueAt(NameField.getText(),i,1);
				model.setValueAt(AuthorField.getText(),i,2);
				model.setValueAt(QuantityField.getText(),i,3);
				model.setValueAt(priceField.getText(),i,4);
				model.setValueAt(CategoriescomboBox.getSelectedIndex(),i,5);
				model.setValueAt(PhotoLabel1.getText(),i,6);
				
				JOptionPane.showMessageDialog(null,"Update succesfully ");
				

			}
			
		});
		Updatebtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		Updatebtn.setBackground(new Color(51, 153, 204));
		Updatebtn.setBounds(505, 605, 111, 34);
		contentPane.add(Updatebtn);
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				NameField.setText("");
				AuthorField.setText("");
				QuantityField.setText("");
				
				priceField.setText("");
				PhotoLabel1.setIcon(null);
				JOptionPane.showMessageDialog(null,"Clear succesfully ");

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(new Color(51, 153, 204));
		btnClear.setBounds(700, 605, 111, 34);
		contentPane.add(btnClear);
		

			
			
		JLabel lblNewLabel_4_1 = new JLabel("Book Table");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(672, 68, 275, 25);
		contentPane.add(lblNewLabel_4_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(669, 93, 553, 488);
		contentPane.add(scrollPane);
		
		table= new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		model=new DefaultTableModel();
		Object[] column = {"Book ID","Book Name","Author name","Quantity","Price","Categories","Photo"};
	
		@SuppressWarnings("unused")
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
                	Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/e-bookmanagement","root","");
                	Statement statement = con.createStatement();
                	
                	String selectQuery = "SELECT * FROM booktable WHERE BookId = ?";
                	PreparedStatement selectStatement = con.prepareStatement(selectQuery);
                	
              String searchID = searchIDField.getText(); 	
              
               
               ResultSet res = selectStatement.executeQuery();
               
               if(res.next()) {
            	   String BookName = res.getString("Bookname");
            	   String AuthorName = res.getString("AuthorName");
            	   String BookQt = res.getString("Quantity");
            	   String BookPrice= res.getString("price");
            	   String BookCat = res.getString("Catogery");
            	   String totalBill =res.getString("TotalBill");
            	   
            	  String message="BookId :    "+searchID +"\n\n" +
            			  "BookName :    "+BookName +"\n\n" +
            			  "AuthorName :    "+AuthorName+"\n\n" +
            			  " Quantity:    "+BookQt +"\n\n" +
            			  "price :    "+BookPrice +"\n\n" +
            			  "Catogery :    "+BookCat +"\n\n" +
            			  "totalBill:    "+totalBill ;
            	  
            	  JOptionPane.showMessageDialog(null, message,"Message",JOptionPane.INFORMATION_MESSAGE);
            	  
               }
               res.close();
               con.close();
               
               }catch(SQLException ex) {
            	   JOptionPane.showMessageDialog(null,"eroor:"+ ex.getMessage());
            	   ex.printStackTrace();
               }
			 catch(Exception ex) {
          	   JOptionPane.showMessageDialog(null,"eroor:"+ ex.getMessage());
          	   ex.printStackTrace();
             }
				
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBackground(new Color(51, 153, 204));
		btnSearch.setBounds(1098, 605, 111, 34);
		contentPane.add(btnSearch);
		
		searchIDField = new JTextField();
		searchIDField.setFont(new Font("Tahoma", Font.BOLD, 16));
		searchIDField.setBounds(912, 605, 188, 34);
		contentPane.add(searchIDField);
		searchIDField.setColumns(10);
		
		       

		     
		
		
		 

	}
}
