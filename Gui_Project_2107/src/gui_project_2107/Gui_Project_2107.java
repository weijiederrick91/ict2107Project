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
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class Gui_Project_2107 extends JFrame {

	private JPanel absolutePane;
	private JTextField text_Register;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Project_2107 frame = new Gui_Project_2107();
					frame.setVisible(true);
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
		setBounds(100, 100, 450, 300);
		absolutePane = new JPanel();
		absolutePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(absolutePane);
		absolutePane.setLayout(null);
		
		JButton btn_Register = new JButton("Register User");
		btn_Register.setBounds(6, 6, 117, 29);
		absolutePane.add(btn_Register);
		
		text_Register = new JTextField();
		text_Register.setBounds(124, 6, 320, 26);
		absolutePane.add(text_Register);
		text_Register.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 261, 94, -139);
		absolutePane.add(scrollPane);
		
		JScrollPane scrollPane_Online = new JScrollPane();
		scrollPane_Online.setViewportBorder(new TitledBorder(null, "Online Users", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_Online.setBounds(6, 93, 108, 142);
		absolutePane.add(scrollPane_Online);
		
		JScrollPane scrollPane_group = new JScrollPane();
		scrollPane_group.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Group Joined", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane_group.setBounds(128, 93, 108, 142);
		absolutePane.add(scrollPane_group);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Group Management ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(144, 28, 300, 65);
		absolutePane.add(panel);
		
		JButton btnCreate = new JButton("Create");
		panel.add(btnCreate);
		
		JButton btnEdit = new JButton("Edit");
		panel.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
		JTextArea textArea_Message = new JTextArea();
		textArea_Message.setBounds(248, 93, 196, 136);
		absolutePane.add(textArea_Message);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSendMessage.setBounds(6, 243, 117, 29);
		absolutePane.add(btnSendMessage);
		
		JTextArea textArea_SendingText = new JTextArea();
		textArea_SendingText.setBounds(124, 248, 320, 16);
		absolutePane.add(textArea_SendingText);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
