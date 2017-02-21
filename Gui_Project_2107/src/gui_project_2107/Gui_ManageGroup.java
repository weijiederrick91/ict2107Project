package gui_project_2107;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Group;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Gui_ManageGroup extends JFrame {

	private JPanel contentPane;
	private JButton btn_remove;
	private static JTextField tb_groupName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_ManageGroup frame = new Gui_ManageGroup();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_ManageGroup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGroupName = new JLabel("Group Name:");
		lblGroupName.setBounds(22, 13, 91, 16);
		contentPane.add(lblGroupName);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 74, 218, 349);
		contentPane.add(scrollPane);
		
		JList lb_friendList = new JList();
		scrollPane.setViewportView(lb_friendList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(312, 74, 218, 349);
		contentPane.add(scrollPane_1);
		
		JList lb_groupParticipants = new JList();
		scrollPane_1.setViewportView(lb_groupParticipants);
		
		JButton btn_add = new JButton(">");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_add.setBounds(252, 174, 48, 43);
		contentPane.add(btn_add);
		
		btn_remove = new JButton("<");
		btn_remove.setBounds(252, 232, 48, 43);
		contentPane.add(btn_remove);
		
		tb_groupName = new JTextField();
		tb_groupName.setEditable(false);
		tb_groupName.setBounds(106, 10, 424, 27);
		contentPane.add(tb_groupName);
		tb_groupName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Friend List:");
		lblNewLabel.setBounds(22, 56, 77, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Group Participants:");
		lblNewLabel_1.setBounds(310, 56, 112, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(322, 436, 97, 25);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui_ManageGroup.this.dispose();
			}
		});
		btnCancel.setBounds(431, 436, 97, 25);
		contentPane.add(btnCancel);
	}
}
