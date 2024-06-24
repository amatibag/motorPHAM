package adminportal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import logregsystem.login;

import javax.swing.JTextPane;



public class newrecord {

	private JFrame frmCreateRecords;
	private JTextField txtID;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtbirthday;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtDepartment;
	private JTextField txtSupervisor;
	private JTextField DateHired;
	private JTextField txtJobTitle;
	private JTextField txtSSS;
	private JTextField txtPagibig;
	private JTextField txtPhilheath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newrecord window = new newrecord();
					window.frmCreateRecords.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newrecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateRecords = new JFrame();
		frmCreateRecords.setTitle("Create Records");
		frmCreateRecords.setResizable(false);
		frmCreateRecords.getContentPane().setBackground(new Color(0, 0, 0));
		frmCreateRecords.setBounds(100, 100, 843, 531);
		frmCreateRecords.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreateRecords.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 239, 239));
		panel.setBounds(10, 11, 807, 470);
		frmCreateRecords.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Enter Employee Details");
		lblNewLabel.setBounds(10, 10, 234, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblEmployeeID = new JLabel("Employee ID.:");
		lblEmployeeID.setBounds(10, 91, 101, 14);
		lblEmployeeID.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		txtID = new JTextField();
		txtID.setToolTipText("");
		lblEmployeeID.setLabelFor(txtID);
		txtID.setBounds(101, 88, 234, 20);
		txtID.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 118, 101, 14);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 146, 101, 13);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		txtfirstname = new JTextField();
		txtfirstname.setToolTipText("");
		txtfirstname.setBounds(101, 115, 234, 20);
		txtfirstname.setColumns(10);
		
		txtlastname = new JTextField();
		txtlastname.setToolTipText("");
		txtlastname.setBounds(101, 140, 234, 20);
		txtlastname.setColumns(10);
		panel.setLayout(null);
		panel.add(lblLastName);
		panel.add(txtfirstname);
		panel.add(txtlastname);
		panel.add(lblNewLabel);
		panel.add(lblEmployeeID);
		panel.add(txtID);
		panel.add(lblFirstName);
		
		txtbirthday = new JTextField();
		txtbirthday.setToolTipText("");
		txtbirthday.setColumns(10);
		txtbirthday.setBounds(101, 170, 234, 20);
		panel.add(txtbirthday);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBirthday.setBounds(10, 173, 101, 13);
		panel.add(lblBirthday);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStatus.setBounds(421, 232, 101, 14);
		panel.add(lblStatus);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPosition.setBounds(613, 230, 101, 14);
		panel.add(lblPosition);
		
		JTextPane txtaddress = new JTextPane();
		txtaddress.setBounds(101, 305, 234, 128);
		panel.add(txtaddress);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblGender.setBounds(20, 201, 101, 13);
		panel.add(lblGender);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEmail.setBounds(10, 255, 101, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(101, 252, 234, 20);
		panel.add(txtEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPhoneNumber.setBounds(10, 280, 101, 14);
		panel.add(lblPhoneNumber);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(101, 280, 234, 20);
		panel.add(txtPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAddress.setBounds(10, 305, 101, 14);
		panel.add(lblAddress);
		
		JComboBox Status = new JComboBox();
		Status.setBackground(new Color(255, 255, 255));
		Status.setToolTipText("Choose Status");
		Status.setModel(new DefaultComboBoxModel(new String[] {"Choose Status", "Regular", "Probationary", "LMat", "LPat", "Terminated"}));
		Status.setSelectedIndex(0);
		Status.setBounds(421, 250, 173, 23);
		panel.add(Status);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDepartment.setBounds(421, 298, 101, 14);
		panel.add(lblDepartment);
		
		txtDepartment = new JTextField();
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(532, 293, 234, 20);
		panel.add(txtDepartment);
		
		JLabel lblSupervisor = new JLabel("Supervisor:");
		lblSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSupervisor.setBounds(421, 326, 101, 14);
		panel.add(lblSupervisor);
		
		txtSupervisor = new JTextField();
		txtSupervisor.setColumns(10);
		txtSupervisor.setBounds(532, 323, 234, 20);
		panel.add(txtSupervisor);
		
		JComboBox Position = new JComboBox();
		Position.setBackground(new Color(255, 255, 255));
		Position.setToolTipText("Choose Position");
		Position.setModel(new DefaultComboBoxModel(new String[] {"Choose Position", "Chief Executive Officer", "Account Manager", "IT Operations and Systems", "HR Manager", "Accounting Head", "Sales & Marketing", "Supply Chain and Logistics", "Customer Service and Relations", "Payroll Manager", "HR Team Leader", "Account Team Leader", "Payroll Team Leader", "Account Rank and File", "HR Rank and File", "Customer Service Representative"}));
		Position.setSelectedIndex(0);
		Position.setBounds(611, 250, 155, 23);
		panel.add(Position);
		
		JComboBox Gender = new JComboBox();
		Gender.setBackground(new Color(255, 255, 255));
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Sex", "Male", "Female"}));
		Gender.setSelectedIndex(0);
		Gender.setBounds(101, 198, 234, 17);
		panel.add(Gender);
		
		JLabel lblDateHired = new JLabel("Date Hired:");
		lblDateHired.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDateHired.setBounds(421, 351, 101, 14);
		panel.add(lblDateHired);
		
		DateHired = new JTextField();
		DateHired.setColumns(10);
		DateHired.setBounds(532, 348, 234, 20);
		panel.add(DateHired);
		
		JLabel lblJobTitle = new JLabel("Job Title:");
		lblJobTitle.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblJobTitle.setBounds(421, 375, 101, 14);
		panel.add(lblJobTitle);
		
		txtJobTitle = new JTextField();
		txtJobTitle.setColumns(10);
		txtJobTitle.setBounds(532, 375, 234, 20);
		panel.add(txtJobTitle);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			private JFrame frmMotorphLoggedIn;

			public void actionPerformed(ActionEvent e) {
				
				frmMotorphLoggedIn = new JFrame ("Log Out");
				if (JOptionPane.showConfirmDialog(frmMotorphLoggedIn, "Confirm if you want to Log Out", "Log Out System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {	
					
					login info = new login();
					login.main(null);
					info.setVisible(true);
					frmCreateRecords.dispose();
			}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnLogOut.setBackground(new Color(255, 255, 255));
		btnLogOut.setBounds(708, 11, 89, 23);
		panel.add(btnLogOut);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String ID  = txtID.getText();
				 String Fname = txtfirstname.getText();
				 String Lname = txtlastname.getText();
				 String Bday = txtbirthday.getText();
				 String Email =  txtEmail.getText();
				 String Address = txtaddress.getText();
				 String Department = txtDepartment.getText();
				 String HiredDate = DateHired.getText();
				 String JobTitle = txtJobTitle.getText();
				 
				 String Sex = Gender.getSelectedItem().toString();
				 String Status1 = Status.getSelectedItem().toString();
				 String Position1 = Position.getSelectedItem().toString();
				 
				 
				  
				 try {
					FileWriter writer = new FileWriter("C:\\Users\\Dell_i5\\Desktop\\MMDC File\\T3CSV\\Edetails.csv", true);
					writer.write(""+ID+","+Fname+","+Lname+","+Bday+","+Sex+","+Email+","+Address+","+Department+","+HiredDate+","+JobTitle+","+Status1+","+Position1 );
					writer.write(System.getProperty("line.separator"));
					writer.close();
					JOptionPane.showMessageDialog(null, "Success");
					
					newrecord info = new newrecord();
					newrecord.main(null);
					info.setVisible(true);
					frmCreateRecords.dispose();
					
					
				} catch (IOException e1) {
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnCreate.setBounds(655, 407, 98, 26);
		panel.add(btnCreate);
		
		JLabel lblSssNumber = new JLabel("SSS Number:");
		lblSssNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSssNumber.setBounds(421, 89, 101, 14);
		panel.add(lblSssNumber);
		
		txtSSS = new JTextField();
		txtSSS.setToolTipText("");
		txtSSS.setColumns(10);
		txtSSS.setBounds(519, 87, 234, 20);
		panel.add(txtSSS);
		
		JLabel lblPagibigNumber = new JLabel("Pag-Ibig Number:");
		lblPagibigNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPagibigNumber.setBounds(421, 117, 101, 14);
		panel.add(lblPagibigNumber);
		
		txtPagibig = new JTextField();
		txtPagibig.setToolTipText("");
		txtPagibig.setColumns(10);
		txtPagibig.setBounds(519, 112, 234, 20);
		panel.add(txtPagibig);
		
		JLabel lblPhilhealthNumber = new JLabel("PhilHealth Number:");
		lblPhilhealthNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPhilhealthNumber.setBounds(421, 140, 101, 14);
		panel.add(lblPhilhealthNumber);
		
		txtPhilheath = new JTextField();
		txtPhilheath.setToolTipText("");
		txtPhilheath.setColumns(10);
		txtPhilheath.setBounds(519, 136, 234, 20);
		panel.add(txtPhilheath);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminaccess info = new adminaccess();
				adminaccess.main(null);
				info.setVisible(true);
				frmCreateRecords.dispose();
				
				
			}
		});
		btnMenu.setBackground(new Color(255, 255, 255));
		btnMenu.setBounds(10, 35, 80, 26);
		panel.add(btnMenu);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
