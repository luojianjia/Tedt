package ����;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ������1  {//������
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		������ p=������.getjdt();
		������ p2=������.getjdt();
	}
}

class ������ extends JFrame{
	private static final long serialVersionUID = 1L;
	private static ������ jdt = null;
	private Thread thread1;
	private Thread thread2;
	private JProgressBar progressBar1 = new JProgressBar();// ������
	private JProgressBar progressBar2 = new JProgressBar();
	int count = 0;

	private ������() {
		super();
		setBounds(300, 300, 200, 100);
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(progressBar1, BorderLayout.NORTH);// ������λ��
		contentPane.add(progressBar2, BorderLayout.SOUTH);
		progressBar1.setStringPainted(true);// ���ý�������ʾ��ֵ�ַ��ٷֱȵ�
		progressBar2.setStringPainted(true);
		progressBar1.setBackground(Color.yellow);// ������ɫ
		progressBar1.setForeground(Color.blue);// ��������ɫ
		progressBar1.setFont(new Font("����", Font.PLAIN, 16));// ���������С
		thread1 = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar1.setValue(++count);// ���ý�������ǰֵ
					try {
						Thread.sleep(20);
						if (count == 10) {// ���߳�1��30%ʱ�����߳�1ִ�У��߳�2ִ�������ټ���ִ���߳�һ
							thread2.join();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100) {
						count = 0;
					}
				}
			}
		});
		thread1.start();
		thread2 = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar2.setValue(++count);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100) {
						break;
					}
				}
			}
		});
		thread2.start();
		setVisible(true);
	}

	public static ������ getjdt() {
		if(jdt==null) {
			synchronized (������.class) {
				if(jdt==null) {
					jdt=new ������();
				}
			}
		}
		return jdt;
	}
}