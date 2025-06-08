package gui.builder.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JCheckBoxJRadioButton {

	private JFrame frame;
	private int sum = 0;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxJRadioButton window = new JCheckBoxJRadioButton();
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
	public JCheckBoxJRadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("체크박스와 라디오버튼");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("사과는 100원, 배는 500원, 체리는 1,000원");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 412, 27);
		frame.getContentPane().add(lblNewLabel);

		JCheckBox chckbxNewCheckBox = new JCheckBox("사과");
		chckbxNewCheckBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if (i == ItemEvent.SELECTED) {

					sum += 100;
				} else {
					sum -= 100;
				}

				lblResult.setText("현재 " + sum + "원 입니다.");
			}
		});
		chckbxNewCheckBox.setBounds(12, 59, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("배");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if (i == ItemEvent.SELECTED) {

					sum += 500;
				} else {
					sum -= 500;
				}

				lblResult.setText("현재 " + sum + "원 입니다.");
			}
		});
		chckbxNewCheckBox_1.setBounds(154, 59, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("체리");
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();

				if (i == ItemEvent.SELECTED) {

					sum += 1000;
				} else {
					sum -= 1000;
				}

				lblResult.setText("현재 " + sum + "원 입니다.");
			}
		});
		chckbxNewCheckBox_2.setBounds(296, 59, 107, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);

		lblResult = new JLabel("현재 0 원 입니다.");
		lblResult.setOpaque(true);
		lblResult.setBackground(new Color(255, 255, 0));
		lblResult.setForeground(new Color(255, 0, 0));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(12, 110, 412, 27);
		frame.getContentPane().add(lblResult);
	}
}
