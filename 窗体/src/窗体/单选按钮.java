package ����;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ��ѡ��ť extends JFrame {

	public ��ѡ��ť() {
		setTitle("��ѡ��ť");
		setBounds(600, 300, 400, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(0, 10, 10));// ����������
		Container con = getContentPane();
		JPanel jpa = new JPanel();
//------------------------------------------------------------------------------
		con.add(jpa);
		JRadioButton jr1 = new JRadioButton("ѧ��֤");// ����4����ѡ��ť
		JRadioButton jr2 = new JRadioButton("���֤");
		JRadioButton jr3 = new JRadioButton("����֤");
		JRadioButton jr4 = new JRadioButton("����֤");
		ButtonGroup group = new ButtonGroup();// ��ѡ��ť������
		jpa.setLayout(new GridLayout(1, 4));
		jr1.setSelected(true);// ����Ĭ�ϰ�ťΪ��jr1
		con.add(jpa);
		group.add(jr1);
		group.add(jr2);
		group.add(jr3);
		group.add(jr4);
		jpa.add(jr1);
		jpa.add(jr2);
		jpa.add(jr3);
		jpa.add(jr4);
		JButton jbu = new JButton("��ӡ");// ��ť
		con.add(jbu);
		jbu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(jr1.getText() + "ѡ��״̬��" + jr1.isSelected());// ѡ��״̬
				System.out.println(jr2.getText() + "ѡ��״̬��" + jr2.isSelected());
				System.out.println(jr3.getText() + "ѡ��״̬��" + jr3.isSelected());
				System.out.println(jr4.getText() + "ѡ��״̬��" + jr4.isSelected());
				group.clearSelection();// ��յ�ѡѡ��
			}
		});
//-----------------------------------------------------------------------------------------
		JCheckBox jch1 = new JCheckBox("��ť1");// ��ѡ��ť
		JCheckBox jch2 = new JCheckBox("��ť2");
		JCheckBox jch3 = new JCheckBox("��ť3");
		con.add(jch1);
		con.add(jch2);
		con.add(jch3);
		JButton jbu1 = new JButton("��ӡ");
		jbu1.addActionListener(new ActionListener() {// ��ѡ��ѡ��״̬��������
			public void actionPerformed(ActionEvent e) {
				System.out.println(jch1.getText() + "ѡ��״̬��" + jch1.isSelected());// ѡ��״̬
				System.out.println(jch2.getText() + "ѡ��״̬��" + jch2.isSelected());
				System.out.println(jch3.getText() + "ѡ��״̬��" + jch3.isSelected());
			}
		});
		con.add(jbu1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ��ѡ��ť();
	}

}
