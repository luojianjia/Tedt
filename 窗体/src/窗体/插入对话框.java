package ����;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

class dome extends JDialog {

	public dome() {
		// һ�����������������Ի��� ��һ���������ĸ����� �� ���Ի������� ����trueΪ�������� falseΪ������
		Container c = getContentPane();// ��ȡ����
		JLabel v = new JLabel("����һ���Ի���");
		v.setForeground(Color.GREEN);// ������ɫ�ı�
		v.setFont(new Font("����", Font.BOLD, 20));// �����Լ���С
		c.add(v);// ��������v
		c.setBackground(Color.CYAN);// ������ɫ
		this.setResizable(false);// �����Ըı��С
		this.setLayout(new FlowLayout());// ���ָ�ʽ���ó������֡�
		// setVisible(true);
		JLabel v1 = new JLabel("����һ��2�Ի���");
		c.add(v1);
		JButton ton = new JButton();
		ton.setText("��ť2");
		c.add(ton);
		ton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����Ի��� c = new ����Ի���();
				c.setVisible(true);

			}
		});
		setBounds(900, 500, 200, 150);// �����С

	}

	public dome(JFrame d) {	
		super(d, "�Ի���1", true);
		setLayout(null);
		Container c = getContentPane();
		JLabel f = new JLabel("����һ���Ի���");
		f.setBounds(10, 10, 100, 40);
		c.add(f);
		c.setBackground(Color.GRAY);
		this.setResizable(false);// ���ÿ��Ըı��С
		
		setBounds(400, 500, 200, 150);
		setVisible(true);//�ɼ�
		// TODO �Զ����ɵĹ��캯�����
	}

}

public class ����Ի��� extends JFrame {
	private JPanel contentPane;

	public ����Ի���(int x) {

		setTitle("\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));//
		setContentPane(contentPane);
	}

	public ����Ի���() {

		JFrame jf = new JFrame();// ����һ������
		jf.setLocationByPlatform(true);// java.awt.Window�е�һ���������������´δ��ڿɼ�ʱ��������Ӧ��ʾλ��
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));//
		setContentPane(contentPane);
		jf.setTitle("һ��JFrame����");
		jf.setVisible(true);// ���ô���Ϊ�ɼ���
		jf.setBounds(760, 400, 500, 300);// ���ڴ�С λ��
		jf.setLayout(null);// ʹ�øô���ȡ�����ֹ���������, �����Լ�����λ��
		jf.setResizable(false);// ��ֹ�ı䴰���С
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ڹرշ�ʽ
		Container container = jf.getContentPane();// ��ȡ��������
		container.setBackground(Color.WHITE);// ����������ɫ

		JLabel s = new JLabel("�޽��� ���� gogogo...");// ������ǩ������
		// s.setText("");// �ı��ǩ����
		s.setFont(new Font("����", Font.BOLD, 18));// ���ñ�ǩ��Ӧ�����塢��ʽ���Ӵ֣�����С��
		s.setForeground(Color.CYAN);// ������ɫ
		s.setBounds(200, 50, 200, 40);
		// jf.setLayout(new FlowLayout());//������������Ϊ������ʾ
		// new JLabel("����һ���Ի���")
		// s.setHorizontalAlignment(SwingConstants.CENTER);//��ǩλ�þ���
		container.add(s);// ����ǩ��ӵ�����
		JButton c = new JButton("�����Ի���");// ����һ����ť��
		c.setSize(50, 15);// ���ð�ť��С
		c.setBounds(100, 50, 100, 40);// ���ð�ťλ�� ��С
		container.add(c);// ����ť��ӵ�����������
		c.addActionListener(new ActionListener() {// ����ť��Ӽ�������
			@Override
			public void actionPerformed(ActionEvent e) {
				dome da = new dome();
				da.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		����Ի��� v = new ����Ի���();
		v.setVisible(true);
		new ����Ի���(1);

	}
}
