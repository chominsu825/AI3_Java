package gui.builder.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JLabelJButton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelJButton window = new JLabelJButton();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JLabelJButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("레이블, 버튼, 이미지");
		frame.setBounds(100, 100, 540, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("자바 프로그램 응용");
		lblNewLabel.setOpaque(true);
		
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 10, 341, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chomi\\OneDrive\\바탕 화면\\images\\img\\beauty.jpg"));
		lblNewLabel_1.setBounds(63, 76, 400, 412);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnCall = new JButton("Call Me !");
		btnCall.setIcon(new ImageIcon("C:\\Users\\chomi\\OneDrive\\바탕 화면\\images\\img\\normalIcon.gif"));
		btnCall.setPressedIcon(new ImageIcon("C:\\Users\\chomi\\OneDrive\\바탕 화면\\images\\img\\pressedIcon.gif"));
		btnCall.setRolloverIcon(new ImageIcon("C:\\Users\\chomi\\OneDrive\\바탕 화면\\images\\img\\rolloverIcon.gif"));
		btnCall.setBounds(136, 498, 254, 84);
		frame.getContentPane().add(btnCall);
	}
}
