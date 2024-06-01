package loginsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import employee_Details.Data;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class loginsystem {

	private JFrame frmMotorphPayrollSystem;
	private JTextField txtusername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginsystem window = new loginsystem();
					window.frmMotorphPayrollSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMotorphPayrollSystem = new JFrame();
		frmMotorphPayrollSystem.setTitle("MotorPh Payroll System");
		frmMotorphPayrollSystem.getContentPane().setBackground(new Color(64, 0, 64));
		frmMotorphPayrollSystem.setBounds(100, 100, 521, 312);
		frmMotorphPayrollSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorphPayrollSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 234, 234));
		panel.setBounds(10, 11, 485, 251);
		frmMotorphPayrollSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtusername = new JTextField();
		txtusername.setBackground(new Color(255, 255, 255));
		txtusername.setBounds(124, 67, 296, 30);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lblWelcome = new JLabel("WELCOME TO YOUR PORTAL");
		lblWelcome.setBounds(94, 5, 296, 30);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblWelcome);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(56, 75, 70, 14);
		panel.add(lblusername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(56, 116, 70, 14);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBounds(124, 108, 296, 30);
		panel.add(passwordField);
		
		JButton btnlogin = new JButton("Log In");
		btnlogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String password = passwordField.getText();
				String username = txtusername.getText();
				
				if (password.contains("king") && username.contains("one")) {
					passwordField.setText(null);
					txtusername.setText(null);
					
					Data info = new Data();
					Data.main(null);
					this.dispose();
					
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid Log In Details","Log In error", JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					txtusername.setText(null);
					
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
					
			
		});
		btnlogin.setBackground(new Color(255, 255, 255));
		btnlogin.setBounds(318, 149, 102, 30);
		panel.add(btnlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				regsiter info = new regsiter();
				regsiter.main(null);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setBounds(124, 149, 102, 30);
		panel.add(btnRegister);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				JFrame frmLoginSystem = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "Login system",
						JOptionPane.OK_OPTION)== JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		btnexit.setBackground(new Color(255, 255, 255));
		btnexit.setBounds(373, 210, 102, 30);
		panel.add(btnexit);
	}
}
