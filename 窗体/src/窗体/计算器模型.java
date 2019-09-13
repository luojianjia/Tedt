package ����;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ������ģ�� extends JFrame {
	public JTextField display;
	private ActionListener insert = new CommandAction();

	public ������ģ��(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 300, 300);
		Container c = getContentPane();
		setLayout(new BorderLayout());

		JPanel displayPanel = new JPanel();// JPanel��javaͼ�λ��������ʹ�õ�������ʵ�����ڴ��������һ����ɫ�����
		c.add(displayPanel, BorderLayout.NORTH);// ����������������϶�

		display = new JTextField();// �����ı���
		display.setText("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);//�ұ���ʾ����
		display.setEditable(false);// ���ò���������
		display.setFont(new Font("΢���ź�", Font.PLAIN, 20));// Font.PLAINΪ����ȡ��ʽ
		display.setColumns(13);
		displayPanel.add(display);

		JPanel displayPanel2 = new JPanel();// JPanel��javaͼ�λ��������ʹ�õ�������ʵ�����ڴ��������һ����ɫ�����

		c.add(displayPanel2, BorderLayout.CENTER);
		displayPanel2.setLayout(new GridLayout(4, 4, 5, 5));

		JButton l7 = new JButton("7");
		l7.addActionListener(insert);//��Ӷ�������
		l7.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l7);

		JButton l8 = new JButton("8");
		l8.addActionListener(insert);
		l8.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l8);

		JButton l9 = new JButton("9");
		l9.addActionListener(insert);
		l9.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l9);

		JButton lc = new JButton("/");
		lc.addActionListener(insert);
		lc.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(lc);

		JButton l4 = new JButton("4");
		l4.addActionListener(insert);
		l4.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l4);

		JButton l5 = new JButton("5");
		l5.addActionListener(insert);
		l5.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l5);

		JButton l6 = new JButton("6");
		l6.addActionListener(insert);
		l6.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l6);

		JButton lcf = new JButton("*");
		lcf.addActionListener(insert);
		lcf.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(lcf);

		JButton l1 = new JButton("1");
		l1.addActionListener(insert);
		l1.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l1);

		JButton l2 = new JButton("2");
		l2.addActionListener(insert);
		l2.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l2);

		JButton l3 = new JButton("3");
		l3.addActionListener(insert);
		l3.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l3);

		JButton lj = new JButton("-");
		lj.addActionListener(insert);
		lj.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(lj);

		JButton ld = new JButton(".");
		ld.addActionListener(insert);
		ld.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(ld);

		JButton l0 = new JButton("0");
		l0.addActionListener(insert);
		l0.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(l0);

		JButton lden = new JButton("=");
		lden.addActionListener(insert);
		lden.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(lden);

		JButton ljia = new JButton("+");
		ljia.addActionListener(insert);
		ljia.setFont(new Font("����", Font.PLAIN, 25));
		displayPanel2.add(ljia);
		setVisible(true);
		pack();// �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ��֡�����ô��ں�/�����������Բ�����ʾ���������ڼ�����ѡ��С֮ǰ��ÿ���ʾ���ڼ�����ѡ��С֮�󣬽�����֤��
				// Window��
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ������ģ��("������1.0").setVisible(true);
		;
	}

	private class CommandAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			display.setText("");
			String input = e.getActionCommand();
			display.setText(input);

		}

	}
}
