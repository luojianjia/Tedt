package ����;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class ������ extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ������() {
		setTitle("������");
		setBounds(500, 250, 400, 250);
		// setResizable(false);//�����Ըı��С
		setLayout(new FlowLayout(1, 10, 10));
		// ���������� 1��������һ��Ϊ0Ϊ����� ��Ϊ1Ϊ���ж��� ��Ϊ2Ϊ�Ҷ��롣2���ڶ�������Ϊÿ���ؼ�֮���x��ࣨˮƽ��ࣩ������������Ϊ�ؼ�y��ࣨ��ֱ��ࣩ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		for (int x = 1; x <= 10; x++) {
			c.add(new JButton("��ť" + x));
		}
		setVisible(true);//���ô���ɼ�
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ������();
	}

}
