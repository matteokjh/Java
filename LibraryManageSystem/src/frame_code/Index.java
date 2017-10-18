package frame_code;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table =null;

	/**
	 * Launch the application.
	 * WindowBuilder插件构建窗体
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Index() {
		setTitle("图书管理系统主界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("基本数据维护");
		mnNewMenu.setIcon(new ImageIcon(Index.class.getResource("/img/base.png")));

		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("图书类别管理");
		mnNewMenu_1.setIcon(new ImageIcon(Index.class.getResource("/img/bookTypeManager.png")));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem menuItem = new JMenuItem("图书类别添加");
		menuItem.setIcon(new ImageIcon(Index.class.getResource("/img/add.png")));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_bookType bookTypeAddInterFrm=new frame_bookType();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});

		mnNewMenu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("图书类别维护");
		menuItem_1.setIcon(new ImageIcon(Index.class.getResource("/img/edit.png")));
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_manage_type bookTypeManageInterFrm=new frame_manage_type();
				bookTypeManageInterFrm.setVisible(true);
				table.add(bookTypeManageInterFrm);
			}
		});

		mnNewMenu_1.add(menuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("图书管理");
		mnNewMenu_2.setIcon(new ImageIcon(Index.class.getResource("/img/bookManager.png")));
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("图书添加");
		menuItem_2.setIcon(new ImageIcon(Index.class.getResource("/img/add.png")));
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_book bookAddInterFrm=new frame_book();
				bookAddInterFrm.setVisible(true);
				table.add(bookAddInterFrm);
			}
		});



		mnNewMenu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("图书维护");
		menuItem_3.setIcon(new ImageIcon(Index.class.getResource("/img/edit.png")));
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_manage bookManageInterFrm=new frame_manage();
				bookManageInterFrm.setVisible(true);
				table.add(bookManageInterFrm);
			}
		});

		mnNewMenu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("安全退出");
		menuItem_4.setIcon(new ImageIcon(Index.class.getResource("/img/exit.png")));
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统？");
				//showConfirmDialog表示选择提示框
				if(result==0){
					dispose();
				}
			}
		});

		mnNewMenu.add(menuItem_4);
		
		JMenu menu = new JMenu("关于我们");
		menu.setIcon(new ImageIcon(Index.class.getResource("/img/about.png")));
		menuBar.add(menu);
		
		JMenuItem mntmjava = new JMenuItem("关于广工");
		mntmjava.setIcon(new ImageIcon(Index.class.getResource("/img/me.png"))); //图片用“/”表示绝对路径
		mntmjava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "广东工业大学！");
			}
		});

		menu.add(mntmjava);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table = new JDesktopPane();
		contentPane.add(table, BorderLayout.CENTER);
		
		
	}
}
