package adminportal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import logregsystem.login;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;

public class adminaccess {

	private JFrame frmAdminPortalSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminaccess window = new adminaccess();
					window.frmAdminPortalSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminaccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminPortalSystem = new JFrame();
		frmAdminPortalSystem.getContentPane().setBackground(new Color(0, 0, 0));
		frmAdminPortalSystem.setTitle("Admin Portal System");
		frmAdminPortalSystem.setResizable(false);
		frmAdminPortalSystem.setBounds(100, 100, 517, 410);
		frmAdminPortalSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminPortalSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 482, 349);
		frmAdminPortalSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLabel = new JLabel("Great you are now in Admin Portal System (APS)");
		lblLabel.setBounds(66, 11, 349, 26);
		lblLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
		panel.add(lblLabel);
		
		JButton btnemployeedetails = new JButton("Create New Record");
		btnemployeedetails.setBounds(36, 96, 185, 43);
		btnemployeedetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				newrecord info = new newrecord();
				newrecord.main(null);
				info.setVisible(true);
				frmAdminPortalSystem.dispose();
				
			}
		});
		btnemployeedetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnemployeedetails);
		
		JButton btnSearch = new JButton("Search Employees");
		btnSearch.setBounds(36, 170, 185, 43);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edata info = new edata();
				edata.main(null);
				info.setVisible(true);
				frmAdminPortalSystem.dispose();
				
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnSearch);
		
		JButton btnSalary = new JButton("Salary");
		btnSalary.setBounds(267, 96, 185, 43);
		btnSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnSalary);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.setBounds(373, 273, 97, 26);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(frmAdminPortalSystem, "Confirm if you want to Log Out", "Log Out System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {	
					
					login info = new login();
					login.main(null);
					info.setVisible(true);
					frmAdminPortalSystem.dispose();
					
				}
			}
		});
		panel.add(btnNewButton_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
