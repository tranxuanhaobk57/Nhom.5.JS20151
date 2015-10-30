package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLable1;
	private JLabel jLable2;
	private JLabel jLable3;
	private JLabel jLable4;
	private JTextField jtfUserName;
	private JButton jbLogin;
	private JButton jbExit;
	private JPasswordField jpfPassword;

	public Login() {
		jLable1 = new JLabel();
		jLable2 = new JLabel("Please enter username and password!");
		jLable3 = new JLabel("UserName");
		jLable4 = new JLabel("Password");
		jtfUserName = new JTextField();
		jbLogin = new JButton("Login");
		jbExit = new JButton("Exit");
		jpfPassword = new JPasswordField();
		// set Lable1
		jLable1.setIcon(new ImageIcon(getClass().getResource("/Icon/manager.png")));

		// set Lable2
		jLable2.setFont(new Font("Tohama", 1, 12));
		jLable2.setForeground(new Color(0, 0, 255));
		jLable2.setHorizontalAlignment(SwingConstants.CENTER);
		jLable2.setIcon(new ImageIcon(getClass().getResource("/Icon/login_iconSmall.png")));
		// set Lable3
		jLable3.setFont(new Font("Tohama", 1, 12));
		// set Lable4
		jLable4.setFont(new Font("Tomaha", 1, 12));
		// set jtfUserName
		jtfUserName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				// jtfUsernameKeyReleased(evt);
			}
		});
		// set button Exit
		jbExit.setFont(new Font("Tohama", 1, 12));
		jbExit.setForeground(new Color(0, 0, 204));
		jbExit.setIcon(new ImageIcon(getClass().getResource("/Icon/Logoff.png")));
		/*jbExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				// jbExitActionPerformed(evt);
			}
		});
		jbExit.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				// jbExitKeyReleased(evt);
			}
		});*/
		// set button Login
		jbLogin.setFont(new Font("Tohama", 1, 12));
		jbLogin.setForeground(new Color(0, 0, 204));
		jbLogin.setIcon(new ImageIcon(getClass().getResource("/Icon/login.png")));
		/*jbLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				// jbLoginActionPerformed(evt);
			}
		});
		jbLogin.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				// jbLoginKeyReleased(evt);
			}
		});*/
		// set password
		/*jpfPassword.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				// jpfPasswordKeyReleased(evt);
			}
		});*/
		// creat groupLayout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jLable1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jLable2, GroupLayout.DEFAULT_SIZE, 310, GroupLayout.DEFAULT_SIZE)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLable3)
								.addComponent(jLable4).addComponent(jbLogin))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jtfUserName)
								.addComponent(jpfPassword).addComponent(jbExit))));
		layout.linkSize(SwingConstants.HORIZONTAL, jbLogin, jbExit);
		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(jLable1).addComponent(jLable2)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLable3)
						.addComponent(jtfUserName))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLable4)
						.addComponent(jpfPassword))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jbLogin)
						.addComponent(jbExit)));
		setTitle("Login");
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                                  "javax.swing.plaf.metal.MetalLookAndFeel");
                                //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                                //UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new Login().setVisible(true);
            }
        });
	}
}
