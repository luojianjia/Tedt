package ����;

import java.awt.Color;
import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class jdialog extends JDialog {
	
	private  Container c = getContentPane();// ��ȡ����
	public jdialog(���������Ի��� d1) {
		super(d1, "�Ự��1", true);// �����Ի���
		setBounds(550, 300, 300, 200);// ��С
		c.setLayout(null);// ����Ϊ���Բ���
		JLabel jl = new JLabel("������Ͻ�X�رնԻ���");// ���尴ť
		jl.setForeground(Color.BLUE);// ��ť��ɫ
		jl.setFont(new Font("����", Font.BOLD, 18));// �������� �Ӵ� �ֺš�
		c.add(jl);// ��ť��������
		jl.setBounds(40, 30, 250, 50);// ��ť��Сλ��
		int y=this.getHeight()/2-jl.getHeight();
		
		System.out.println(y);
		new Thread() {
			public void run() {
				while (true) {
					int x = 0-jl.getWidth()+10;//��ȡ���ȺͿ��
					while (x <= c.getHeight()+jl.getWidth()/2) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						x += 5;
						System.out.println(jl.getHeight());
						jl.setBounds(x, y, 230, 50);
					}
					x = 0-jl.getWidth()+10;//��ȡ���ȺͿ��
				}
			};
		}.start();
		setResizable(false);// ���岻���Ըı��С
	}
}

public class ���������Ի��� extends JFrame {
	public ���������Ի���() {
		new JFrame("123...");
		setTitle("�����Ի���");
		setLayout(null);
		Container c = getContentPane();
		JButton jb = new JButton("�����ť����");
		jb.setBackground(Color.GREEN);
		jb.setBounds(180, 150, 120, 30);
		jb.addActionListener(new ActionListener() {// ��Ӽ���
			public void actionPerformed(ActionEvent e) {
				new jdialog(���������Ի���.this).setVisible(true);
			}
		});
		c.add(jb);
		setBounds(450, 200, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ���������Ի���();

	}

}