package ����;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cBorderLayout extends JFrame {
	JPanel p = new JPanel();
	private JButton jbutton;
	
	public cBorderLayout() {

		setLayout(new BorderLayout(5, 5));
		JButton jbutton1=new JButton("South");
		setFont(new Font("Helvetica", Font.PLAIN, 14));
		jbutton=new JButton("North");
		getContentPane().add("North", jbutton);

		getContentPane().add("South",jbutton1);
		jbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getColor();
			}
		});

		getContentPane().add("East", new JButton("East"));

		getContentPane().add("West", new JButton("West"));

//�������Ϊ��ʽ���־�����ʾ������ᡢ�ݼ��Ϊ5������

		p.setLayout(new FlowLayout(1, 10, 10));

//ʹ��ѭ����Ӱ�ť��ע��ÿ����ӵİ�ť�������ƶ���b

		// ����ťÿ�ξ�����new�����ɵģ����д���ͬ�İ�ť����

		for (int i = 1; i < 10; i++) {

//String.valueOf(i)��������ת��Ϊ�ַ���

			JButton b = new JButton(String.valueOf(i));

			p.add(b); // ����ť��ӵ������

		}
	
		
		getContentPane().add("Center", p); // �������ӵ��м�λ��
		 // pack();
	}

	private void getColor() {   
		Color color=jbutton.getBackground();		
		Color newColor = JColorChooser.showDialog(this, "ѡ����ɫ", color);
		jbutton.setBackground(newColor);
	} 
	public static void main(String[] args) {
	
		cBorderLayout f = new cBorderLayout();
		f.setTitle("�߽粼��");
		f.pack(); // �ô�������Ӧ�齨��С
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
	
	}
}
