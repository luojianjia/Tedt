package ����;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class ����ͼƬ extends JFrame {

	public ����ͼƬ() {
		JFrame jf = new JFrame();
		jf.setBounds(750, 350, 400, 300);
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		Container co = jf.getContentPane();
		
		//JTextArea v=new JTextArea(20,50);
		//co.add(v);
		//JScrollPane D=new JScrollPane(v);
		//co.add(co);
		JButton jb = new JButton();

		JLabel s = new JLabel();
		Icon icon = new ImageIcon("src/java.png");// ��ȡͼƬ
		s.setIcon(icon);// ��ͼƬ����s��ǩ�С�
		co.add(s);

		jb.setText("sssssss");
		co.add(jb);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dome de = new dome(jf);
				de.setVisible(true);
			}
		});
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new ����ͼƬ();
	}
}
