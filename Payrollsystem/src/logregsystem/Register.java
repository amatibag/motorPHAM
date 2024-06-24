package logregsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class Register {

	private JFrame frmMotorphSignUp;
	private JTextField txtname;
	private JTextField txtUser;
	private JTextField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frmMotorphSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMotorphSignUp = new JFrame();
		frmMotorphSignUp.setTitle("MotorPh Sign Up Page");
		frmMotorphSignUp.getContentPane().setBackground(new Color(255, 255, 255));
		frmMotorphSignUp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 364, 402);
		frmMotorphSignUp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblmessage = new JLabel("Sign Up");
		lblmessage.setForeground(new Color(255, 255, 255));
		lblmessage.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblmessage.setBounds(140, 11, 84, 25);
		panel.add(lblmessage);
		
		txtname = new JTextField();
		txtname.setBounds(34, 70, 302, 35);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(160, 108, 44, 14);
		panel.add(lblName);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(34, 151, 302, 35);
		panel.add(txtUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(150, 194, 64, 14);
		panel.add(lblUsername);
		
		txtpassword = new JTextField();
		txtpassword.setColumns(10);
		txtpassword.setBounds(34, 236, 302, 35);
		panel.add(txtpassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(150, 279, 64, 14);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String name  = txtname.getText();
				 String uname = txtUser.getText();
				 String npass = txtpassword.getText();
				 
				 try {
					FileWriter writer = new FileWriter("C:\\Users\\Dell_i5\\Desktop\\MMDC File\\T3CSV\\elogins.csv", true);
					writer.write(""+uname+","+npass+","+name );
					writer.write(System.getProperty("line.separator"));
					writer.close();
					JOptionPane.showMessageDialog(null, "Success");
					this.dispose();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(221, 305, 115, 25);
		panel.add(btnNewButton);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login info = new login();
				login.main(null);
				frmMotorphSignUp.dispose();
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnLogIn.setBounds(34, 305, 115, 25);
		panel.add(btnLogIn);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				JFrame frmLoginSystem = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "Login system",
						JOptionPane.OK_OPTION)== JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(239, 366, 115, 25);
		panel.add(btnExit);
		frmMotorphSignUp.setBounds(100, 100, 400, 463);
		frmMotorphSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
