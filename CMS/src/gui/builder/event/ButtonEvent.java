package gui.builder.event;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class ButtonEvent {

	private JFrame frmButtonEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEvent window = new ButtonEvent();
					window.frmButtonEvent.setLocationRelativeTo(null);
					window.frmButtonEvent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ButtonEvent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonEvent = new JFrame();
		frmButtonEvent.setTitle("버튼 이벤트");
		frmButtonEvent.setBounds(100, 100, 450, 300);
		frmButtonEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonEvent.getContentPane().setLayout(null);
		
		JButton btnAction = new JButton("Action");
		btnAction.setBackground(SystemColor.activeCaption);
		btnAction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAction.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAction.setBackground(new Color(255, 255, 0));
			}
		});
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = btnAction.getText();
				
				if(str.equals("Action")) {
					btnAction.setText("Test");
				} else {
					btnAction.setText("Action");
				}
				
			}
		});
		btnAction.setFont(new Font("굴림", Font.BOLD, 20));
		btnAction.setBounds(85, 94, 265, 75);
		frmButtonEvent.getContentPane().add(btnAction);
	}
}
