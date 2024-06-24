package adminportal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import logregsystem.login;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class edata {

	private JFrame frmPayrollData;
	private JTextField txtsearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					edata window = new edata();
					window.frmPayrollData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public edata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayrollData = new JFrame();
		frmPayrollData.setTitle("Payroll Data");
		frmPayrollData.setBounds(100, 100, 800, 695);
		frmPayrollData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayrollData.getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(10, 11, 776, 647);
		frmPayrollData.getContentPane().add(contentPane);
		
		JLabel lblLabel = new JLabel("Great! Welcome to your payroll portal");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLabel.setBounds(10, 11, 344, 35);
		contentPane.add(lblLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 57, 754, 2);
		contentPane.add(separator);
		
		JLabel lblename = new JLabel("Employee No.");
		lblename.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblename.setBackground(new Color(64, 0, 64));
		lblename.setBounds(10, 100, 84, 25);
		contentPane.add(lblename);
		
		JLabel lblemployeeName = new JLabel("Employee Name:");
		lblemployeeName.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblemployeeName.setBackground(new Color(64, 0, 64));
		lblemployeeName.setBounds(10, 123, 102, 25);
		contentPane.add(lblemployeeName);
		
		JLabel lblbirthday = new JLabel("Birthday:");
		lblbirthday.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblbirthday.setBackground(new Color(64, 0, 64));
		lblbirthday.setBounds(10, 145, 102, 27);
		contentPane.add(lblbirthday);
		
		JLabel lbladdress = new JLabel("Address:");
		lbladdress.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lbladdress.setBackground(new Color(64, 0, 64));
		lbladdress.setBounds(10, 195, 102, 25);
		contentPane.add(lbladdress);
		
		JTextPane txtID = new JTextPane();
		txtID.setEditable(false);
		txtID.setBounds(104, 100, 145, 20);
		contentPane.add(txtID);
		
		JTextPane txtname = new JTextPane();
		txtname.setEditable(false);
		txtname.setBounds(104, 123, 145, 20);
		contentPane.add(txtname);
		
		JTextPane txtbirthday = new JTextPane();
		txtbirthday.setEditable(false);
		txtbirthday.setBounds(104, 145, 145, 20);
		contentPane.add(txtbirthday);
		
		JTextPane txtaddress = new JTextPane();
		txtaddress.setEditable(false);
		txtaddress.setBounds(104, 195, 145, 69);
		contentPane.add(txtaddress);
		
		JLabel lblSssNo = new JLabel("SSS No.");
		lblSssNo.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblSssNo.setBackground(new Color(64, 0, 64));
		lblSssNo.setBounds(259, 98, 84, 25);
		contentPane.add(lblSssNo);
		
		JLabel lblpagibig = new JLabel("Pag-ibig No.");
		lblpagibig.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblpagibig.setBackground(new Color(64, 0, 64));
		lblpagibig.setBounds(259, 124, 84, 25);
		contentPane.add(lblpagibig);
		
		JTextPane txtEmail = new JTextPane();
		txtEmail.setEditable(false);
		txtEmail.setBounds(104, 171, 145, 20);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblEmail.setBackground(new Color(64, 0, 64));
		lblEmail.setBounds(10, 169, 102, 25);
		contentPane.add(lblEmail);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblPosition.setBackground(new Color(64, 0, 64));
		lblPosition.setBounds(525, 100, 84, 25);
		contentPane.add(lblPosition);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblStatus.setBackground(new Color(64, 0, 64));
		lblStatus.setBounds(525, 123, 84, 25);
		contentPane.add(lblStatus);
		
		JLabel lblDateHired = new JLabel("Date Hired:");
		lblDateHired.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblDateHired.setBackground(new Color(64, 0, 64));
		lblDateHired.setBounds(525, 149, 84, 25);
		contentPane.add(lblDateHired);
		
		JTextPane txtposition = new JTextPane();
		txtposition.setEditable(false);
		txtposition.setBounds(589, 100, 174, 20);
		contentPane.add(txtposition);
		
		JTextPane txtstatus = new JTextPane();
		txtstatus.setEditable(false);
		txtstatus.setBounds(589, 123, 174, 20);
		contentPane.add(txtstatus);
		
		JTextPane txtdatehired = new JTextPane();
		txtdatehired.setEditable(false);
		txtdatehired.setBounds(589, 145, 174, 20);
		contentPane.add(txtdatehired);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblDepartment.setBackground(new Color(64, 0, 64));
		lblDepartment.setBounds(259, 166, 84, 25);
		contentPane.add(lblDepartment);
		
		JTextPane txtDepartment = new JTextPane();
		txtDepartment.setBounds(345, 166, 164, 20);
		contentPane.add(txtDepartment);
		
		JLabel lblSupervisor = new JLabel("Supervisor: ");
		lblSupervisor.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblSupervisor.setBackground(new Color(64, 0, 64));
		lblSupervisor.setBounds(259, 190, 84, 25);
		contentPane.add(lblSupervisor);
		
		JTextPane txtSupervisor = new JTextPane();
		txtSupervisor.setBounds(345, 190, 164, 20);
		contentPane.add(txtSupervisor);
		
		JLabel lbljobtitle = new JLabel("Job Title:");
		lbljobtitle.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lbljobtitle.setBackground(new Color(64, 0, 64));
		lbljobtitle.setBounds(259, 214, 84, 25);
		contentPane.add(lbljobtitle);
		
		JTextPane txtJobTitle = new JTextPane();
		txtJobTitle.setBounds(345, 214, 164, 20);
		contentPane.add(txtJobTitle);
		
		JLabel lblphealth = new JLabel("Philhealth No.");
		lblphealth.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblphealth.setBackground(new Color(64, 0, 64));
		lblphealth.setBounds(259, 147, 84, 25);
		contentPane.add(lblphealth);
		
		JTextPane txtsss = new JTextPane();
		txtsss.setEditable(false);
		txtsss.setBounds(345, 98, 164, 20);
		contentPane.add(txtsss);
		
		JTextPane txtpagibig = new JTextPane();
		txtpagibig.setEditable(false);
		txtpagibig.setBounds(345, 121, 164, 20);
		contentPane.add(txtpagibig);
		
		JTextPane txtphilhealth = new JTextPane();
		txtphilhealth.setBounds(345, 143, 164, 20);
		contentPane.add(txtphilhealth);
		
		JButton btnlogout = new JButton("Log Out");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				login info = new login();
				login.main(null);
				frmPayrollData.dispose();
				
			}
		});
		btnlogout.setBounds(662, 17, 102, 27);
		contentPane.add(btnlogout);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(11, 275, 753, 2);
		contentPane.add(separator_1);
		
		txtsearch = new JTextField();
		txtsearch.setColumns(10);
		txtsearch.setBounds(10, 64, 239, 25);
		contentPane.add(txtsearch);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		btnSearch.setBounds(256, 65, 89, 23);
		contentPane.add(btnSearch);
		

		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminaccess info = new adminaccess();
				adminaccess.main(null);
				info.setVisible(true);
				frmPayrollData.dispose();
			}
		});
		btnMenu.setBounds(551, 19, 102, 27);
		contentPane.add(btnMenu);
		
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
