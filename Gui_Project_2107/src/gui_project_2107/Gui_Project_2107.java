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
					/*//here can change the layout of the applications.
					Toolkit toolkit =  Toolkit.getDefaultToolkit ();
					Dimension dim = toolkit.getScreenSize();
					frame.setSize(dim.width,dim.height);//here frame is your container */
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
		setBounds(100, 100, 638, 557);
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
		
		JScrollPane scrollPane_Online = new JScrollPane();
		scrollPane_Online.setViewportBorder(new TitledBorder(null, "Online Users", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_Online.setBounds(12, 122, 171, 311);
		absolutePane.add(scrollPane_Online);
		
		JScrollPane scrollPane_group = new JScrollPane();
		scrollPane_group.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Group Joined", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane_group.setBounds(195, 122, 173, 311);
		absolutePane.add(scrollPane_group);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBorder(new TitledBorder(null, "Group Management ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		
		JTextArea textArea_Message = new JTextArea();
		textArea_Message.setBounds(380, 137, 213, 296);
		absolutePane.add(textArea_Message);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSendMessage.setBounds(464, 446, 129, 51);
		absolutePane.add(btnSendMessage);
		
		JTextArea textArea_SendingText = new JTextArea();
		textArea_SendingText.setBounds(71, 446, 387, 51);
		absolutePane.add(textArea_SendingText);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setBounds(12, 463, 56, 16);
		absolutePane.add(lblMessage);
		
		JLabel lblUserName = new JLabel("User ID:");
		lblUserName.setBounds(22, 11, 81, 16);
		absolutePane.add(lblUserName);
		
		tb_userId = new JTextField();
		tb_userId.setBounds(75, 13, 365, 21);
		absolutePane.add(tb_userId);
		tb_userId.setColumns(10);
		
		JLabel lblChatBox = new JLabel("Chat Box");
		lblChatBox.setBounds(380, 122, 56, 16);
		absolutePane.add(lblChatBox);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
	}
	public boolean validateUserId(String userId)
	{
		if(userId.length() <= 8)
		{
			if(Character.isLetter(userId.charAt(0)) && !userId.matches(".*([ \t]).*")){
				
			}
		}
		//need to be checked by another Client to ensure there is no existing clients using 
		//this userId
		return false;
	}
}
