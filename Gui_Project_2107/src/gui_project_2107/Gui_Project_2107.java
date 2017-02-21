package gui_project_2107;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.List;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;

import classes.Group;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class Gui_Project_2107 extends JFrame {

	private JPanel absolutePane;
	private JTextField text_GroupName;
	private JTextField tb_userId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Project_2107 frame = new Gui_Project_2107();
					frame.setVisible(true);
					frame.setResizable(false);
					/*
					 * //here can change the layout of the applications. Toolkit
					 * toolkit = Toolkit.getDefaultToolkit (); Dimension dim =
					 * toolkit.getScreenSize();
					 * frame.setSize(dim.width,dim.height);//here frame is your
					 * container
					 */
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_Project_2107() {
		setTitle("Wave Chat ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 568);
		absolutePane = new JPanel();
		absolutePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(absolutePane);
		absolutePane.setLayout(null);

		JButton btn_Register = new JButton("Register User");
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userId = tb_userId.getText().toString();
				validateUserId(userId);

			}
		});
		btn_Register.setBounds(452, 11, 141, 29);
		absolutePane.add(btn_Register);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 261, 94, -139);
		absolutePane.add(scrollPane);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBorder(
				new TitledBorder(null, "Group Management ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 47, 581, 60);
		absolutePane.add(panel);

		JLabel lblGroupName = new JLabel("Group Name:");
		panel.add(lblGroupName);

		text_GroupName = new JTextField();
		panel.add(text_GroupName);
		text_GroupName.setColumns(20);

		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui_ManageGroup groupFrame = new Gui_ManageGroup();
				groupFrame.setVisible(true);
			}

			private Group Group(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		panel.add(btnCreate);

		JButton btnEdit = new JButton("Edit");
		panel.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		panel.add(btnDelete);

		JLabel lblUserName = new JLabel("User ID:");
		lblUserName.setBounds(22, 11, 81, 16);
		absolutePane.add(lblUserName);

		tb_userId = new JTextField();
		tb_userId.setBounds(75, 13, 365, 21);
		absolutePane.add(tb_userId);
		tb_userId.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 140, 245, 379);
		absolutePane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(
				new TitledBorder(null, "Online Users", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
				JScrollPane scrollPane_Online = new JScrollPane();
				scrollPane_Online.setBounds(12, 27, 225, 301);
				panel_1.add(scrollPane_Online);
				//scrollPane_Online.setViewportBorder(
					//	new TitledBorder(null, "Online Users", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				
				JButton btnDirectMessage = new JButton("Direct Message");
				btnDirectMessage.setBounds(12, 341, 225, 25);
				panel_1.add(btnDirectMessage);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(269, 140, 245, 379);
				absolutePane.add(panel_2);
				panel_2.setLayout(null);
				panel_2.setBorder(
						new TitledBorder(null, "Groups Joined", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				
						JScrollPane scrollPane_group = new JScrollPane();
						scrollPane_group.setBounds(12, 29, 221, 299);
						panel_2.add(scrollPane_group);
						//scrollPane_group.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
								//"Group Joined", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
						
						JButton btnNewButton = new JButton("Chat in Group");
						btnNewButton.setBounds(12, 341, 221, 25);
						panel_2.add(btnNewButton);
						
						JPanel panel_3 = new JPanel();
						panel_3.setBounds(520, 140, 222, 379);
						absolutePane.add(panel_3);
						panel_3.setLayout(null);
						panel_3.setBorder(
								new TitledBorder(null, "Notification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
						
								JTextArea textArea_Message = new JTextArea();
								textArea_Message.setBounds(12, 26, 189, 302);
								panel_3.add(textArea_Message);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}

	public boolean validateUserId(String userId) {
		if (userId.length() >=1 && userId.length() <= 8) {
			if (Character.isLetter(userId.charAt(0)) && !userId.matches(".*([ \t]).*")) {
				// need to be checked by another Client to ensure there is no
				// existing clients using
				// this userId
				JOptionPane.showMessageDialog(Gui_Project_2107.this, "user ID ok");

			} else {
				JOptionPane.showMessageDialog(Gui_Project_2107.this, "Invalid User ID. Please re-enter again.");
			}
			
		} else if(userId.length()>8){
			JOptionPane.showMessageDialog(Gui_Project_2107.this, "Invalid User ID. Please re-enter again.");
		}
		else {
			JOptionPane.showMessageDialog(Gui_Project_2107.this, "Please enter a User ID.");
		}
		
		
		return false;
	}
}
