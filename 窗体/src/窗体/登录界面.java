package ����;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ��¼���� extends JFrame {
	/**
	 * luojianjia
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField jtex;
	public JLabel jtab;
	private JLabel jtab1;
	private JPasswordField jpass;
	private JButton jbutt;
	private JButton jbut;

	public ��¼����() {
		setTitle("��¼");
		setBounds(600, 400, 480, 300);// ���ô�Сλ��
		JLabel jtab3 = new JLabel("��¼����");
		jtab3.setFont(new Font("����", Font.PLAIN, 35));// ��������
		jtab3.setBounds(170, 0, 200, 60);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		Container con = getContentPane();
		con.add(jtab3);
		con.add(getJLabel());
		con.add(getJTextField());
		con.add(getJLabel1());
		con.add(getJPasswordField());
		con.add(getJButton());
		con.add(getJButton1());
		setResizable(false);
	}

	private JButton getJButton1() {
		jbut = new JButton("����");
		jbut.setFont(new Font("����", Font.PLAIN, 20));
		jbut.setBounds(260, 190, 100, 30);
		jbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtex.setText("");
				jpass.setText("");
			}
		});
		return jbut;
	}

	private JButton getJButton() {
		jbutt = new JButton("��¼");
		jbutt.setFont(new Font("����", Font.PLAIN, 20));
		jbutt.setBounds(140, 190, 100, 30);
		jbutt.addActionListener(new ActionListener() {// �����ȡ����
			public void actionPerformed(ActionEvent arg0) {
				if (jtex.getText().trim().equals("") && new String(jpass.getPassword()).trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");

				} else if (jtex.getText().trim().equals("1870161788")
						&& new String(jpass.getPassword()).trim().equals("123456")) {
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");

				} else {
					JOptionPane.showMessageDialog(null, "�û������������");
				}
				System.out.println(jtex.getText());
				// System.out.println(jpass.getText());// ��ȡ����
				System.out.println(jpass.getPassword());// ��ȡ����
			}
		});
		return jbutt;

	}

	private JLabel getJLabel() {
		jtab = new JLabel("�����˺ţ�");
		jtab.setBounds(80, 80, 100, 30);
		jtab.setFont(new Font("����", Font.PLAIN, 20));
		return jtab;
	}

	private JTextField getJTextField() {// ��ȡ�ı���
		jtex = new JTextField(20);
		jtex.setFont(new Font("����", Font.PLAIN, 20));
		jtex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(jtex.getText());
			}
		});
		jtex.setBounds(180, 80, 200, 30);
		return jtex;
	}

	private JLabel getJLabel1() {
		jtab1 = new JLabel("�������룺");
		jtab1.setFont(new Font("����", Font.PLAIN, 20));
		jtab1.setBounds(80, 120, 100, 30);
		return jtab1;
	}

	private JPasswordField getJPasswordField() {// ��ȡ�����
		jpass = new JPasswordField(20);
		jpass.setFont(new Font("����", Font.PLAIN, 20));
		jpass.setEchoChar('*');// �����������ʾ����
		jpass.setBounds(180, 120, 200, 30);
		jpass.addActionListener(new ActionListener() {// ���س�������Ӧ
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				System.out.println(jpass.getText());
			}
		});
		return jpass;

	}

	public static void main(String[] args) {
		��¼���� ads = new ��¼����();
		ads.setVisible(true);
	}

}
