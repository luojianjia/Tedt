package ����;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Tubiao implements Icon{		
	private int width;//ͼ���
	private int height;//ͼ�곤�ȡ�
	public Tubiao (int width,int height) {
		this.height=height;
		this.width=width;
	}	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {//��ָ��λ�û�ͼ
		// TODO �Զ����ɵķ������
		g.fillOval(x, y, width, height);
	}
	@Override
	public int getIconWidth() {//��ȡͼ����
		// TODO �Զ����ɵķ������
		return this.width;
	}
	@Override
	public int getIconHeight() {//��ȡͼ�곤��
		// TODO �Զ����ɵķ������
		return this.height;
	}
	public static void main(String[] args) {
		new jf();
	
		

	}

}

class jf extends JFrame{
	 public jf() {
		JFrame a=new JFrame("����һ������");
		a.setBounds(500, 400, 400, 300);
		a.setLocationByPlatform(true);
		a.setLayout(null);//ʹ�øô���ȡ�����ֹ���������
		a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		a.setBackground(Color.BLUE);
		JButton jb=new JButton();
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new dome(a);								
			}
		});
		JButton jb1=new JButton("��ť");		
		jb.setText("�����ȡ");
		jb.setBounds(250, 10, 90, 25);	
		jb1.setBounds(100, 50, 100, 40);
		Container con=a.getContentPane();
		con.add(jb);
		con.add(jb1);		
		// TODO �Զ����ɵĹ��캯�����
		a.setVisible(true);
	}
		
	
}
