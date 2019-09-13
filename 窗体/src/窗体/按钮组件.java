package ����;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ��ť��� extends JFrame {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	public JButton label1;

	public ��ť���() {
		setTitle("��ť���");
		setBounds(500, 400, 500, 200);//λ�� ��С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		setLayout(new GridLayout(2, 4, 20, 20));
		JButton[] a = new JButton[6];
		for (int x = 0; x < 6; x++) {
			a[x] = new JButton("��ť" + (x + 1));
			con.add(a[x]);
		}
		a[0].setEnabled(false);// ���ð�ť������
		a[0].setToolTipText("��ť������");// ���ı������ͣ��ʾ
		a[1].setBackground(Color.RED);// ���ð�ť������ɫ
		a[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				do_button2_actionPerformed(e);
			}
		});
		a[1].setToolTipText("��ť������ɫ");// ���ı������ͣ��ʾ

		a[2].setBorderPainted(false);// ���ð�ť�ޱ߿�
		a[2]. setForeground(Color.BLUE);//����������ɫ
		a[2].setToolTipText("��ť�ޱ߿�");// ���ı������ͣ��ʾ

		a[3].setBorder(BorderFactory.createLineBorder(Color.GREEN));// ���ñ߿���ɫ
		a[3].setToolTipText("��ť��ɫ�߿�");// ���ı������ͣ��ʾ

		Icon icon = new ImageIcon("src/java1.png");// ����ͼƬ
		a[4].setIcon(icon);// ���ͼƬ��ť
		a[4].setToolTipText("ͼƬ��ť");// ���ı������ͣ��ʾ
		
		a[5].setForeground(Color.yellow);//�ı�������ɫ
		a[5].addActionListener(new ActionListener() {// ��Ӽ����¼�

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(��ť���.this, "�����Ի���");
			}
		});
		label1 = new JButton("123");
		con.add(label1);
		setVisible(true);
	}

	protected void do_button2_actionPerformed(ActionEvent e) {
		setColor(label1);
	}

	private void setColor(JButton label) {
		Color color = label.getBackground();// ��ȡԭ���İ�ť������ɫ����
		// ��ʾ��ɫѡ��Ի���
		Color newColor = JColorChooser.showDialog(this, "ѡ����ɫ", color);// һ����̬�ı���������ʾһ��ģ̬��ɫѡ�����Ի��򲢷����û�ѡ�����ɫ��
	
		label.setBackground(newColor);// �ѻ�ȡ����ɫ����Ϊ��ǩ�ı���ɫ
	}

	public static void main(String[] args) {
		new ��ť���();
	}
}
