
package ����;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class �߽粼�� extends JFrame {
	JPanel p = new JPanel();
	// JPanel �� Javaͼ���û�����(GUI)���߰�swing�е���������࣬������javax.swing
	// ���У���һ�����������������Լ��뵽JFrame�����С�JPanelĬ�ϵĲ��ֹ�������FlowLayout��
	// ���������Ƕ����ϣ��ڲ�ͬ�������пɰ����������(component),��JButton��JTextArea��JTextField
	// ��
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	public �߽粼��() {
		setTitle("�߾಼����ͼ");//�������֡�
		setBounds(470, 250, 600, 400);//��Сλ�� 
		//setResizable(false);//��С�����Ըı䡣
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رշ�ʽ��
		Container c = getContentPane();// ��ȡ����
		c.setLayout(new BorderLayout());// ����Ϊ�߽粼��
		
		JButton b = new JButton("��");// ��ť
		JButton d1 = new JButton("345");
		JButton d2 = new JButton("111");
	
		p.setLayout(new FlowLayout(0, 10, 10));//�����
		for (int x = 1; x <= 10; x++) {
			JButton f = new JButton(String.valueOf(x));
			p.add(f); // ����ť��ӵ������
		}
		p1.setLayout(new FlowLayout(1, 10, 10));// �������� ���в���   ����4����ť
		for (int x = 1; x <= 4; x++) {
			JButton f = new JButton(String.valueOf(x));// ��ȡ���Ӧ��xֵ
			p1.add(f); // ����ť��ӵ������
		}
		
		/*����ʱÿ���ؼ�ֻ����һ��
		����
		JButton d1 = new JButton("345");
		��������
		c.add(d1,BorderLayout.EAST);//�ұ�
		c.add(d1,BorderLayout.WEST);//���
		�ұ����ˣ�����Ͳ��������ˡ�*/
		
		
		p2.setLayout(new FlowLayout(1, 10, 10));// �������� ���в���   ����4����ť
		for (int x = 1; x <= 10; x++) {
			JButton f = new JButton(String.valueOf(x));// ��ȡ���Ӧ��xֵ
			p2.add(f); // ����ť��ӵ������
		}
		setTitle("�߾಼����ͼ");
//-----------------------------------------------------
		//p.setLayout(null);                  ���뷽��һ
		//JButton d = new JButton("345");
		// d.setBounds(100, 50, 100, 30);
		// p.add(d);
		//c.add(p,BorderLayout.CENTER);
//-------------------------------------------------------	
		//���뷽ʽ2.
		// getContentPane().add("South", new JButton("South"));
		// getContentPane().add("East", new JButton("East"));
		// getContentPane().add("West", new JButton("West"));
//--------------------------------------------------------------
		//���뷽��3.
		/*getContentPane().add("East", d1);
		getContentPane().add("West", d2);
		getContentPane().add("South", p1);
		getContentPane().add("Center", p);*/
//----------------------------------------------------------------	
		//���뷽��4.
		c.add(b, BorderLayout.NORTH);// ���ϰ�ť�������ϱ�
		c.add(d1,BorderLayout.EAST);//�ұ�
		c.add(d2,BorderLayout.WEST);//���
		c.add(p,BorderLayout.CENTER);//�м�
		c.add(p1,BorderLayout.SOUTH);//����
//----------------------------------------------------------------
		setVisible(true);
	}
	public static void main(String[] args) {
		new �߽粼��();
	}

}
