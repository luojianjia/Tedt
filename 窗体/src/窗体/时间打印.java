package ����;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ʱ���ӡ extends JFrame {
	private boolean sss = true;

	public void name(JLabel sJLabel) {

		while (sss) {
			SimpleDateFormat sitDateFormat = new SimpleDateFormat("����ʱ�䣺" + "yyyy/MM/dd  HH:mm:ss");// ���ڸ�ʽ
			sJLabel.setText(sitDateFormat.format(new Date()));
			try {
				Thread.sleep(1000);// ��ʱһ��
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	public ʱ���ӡ() {
		setTitle("ʱ��");
		setBounds(500, 400, 400, 300);
		setLayout(new GridLayout(2, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		JLabel sJLabel = new JLabel();
		sJLabel.setForeground(Color.BLUE);
		sJLabel.setHorizontalAlignment(SwingConstants.CENTER);// ������ʾ
		sJLabel.setFont(new Font("����", Font.PLAIN, 20));
		container.add(sJLabel);
		setVisible(true);
		name(sJLabel);

	}

	public static void main(String[] args) {
		new ʱ���ӡ();
	}
}
