package ����;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ��ѡ�� extends JFrame {

	private static final long serialVersionUID = 1L;
	public JButton jbutt;// ��ť
	private JButton jbt;
	private JButton jbt1;
	public JButton jbutt2;
	private JTextArea jt;// �ı���
	private JRadioButton jr1;// ��ѡ��
	private JRadioButton jr2;
	private JRadioButton jr3;
	private JCheckBox jc1;// ��ѡ��
	private JCheckBox jc2;
	private JCheckBox jc3;
	private ButtonGroup buton;// ��ѡ����
	private JComboBox<String> jcoComboBox;// �����б�
	private JList<String> jlis;

	public ��ѡ��() {
		setTitle("��ѡ��");
		setBounds(500, 400, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		jt = new JTextArea();
		// jt.setBackground(Color.YELLOW);//�����ı��򱳾���ɫ
		JScrollPane jsc = new JScrollPane(jt);
		con.add(jsc);
		con.add(JButton1());
		setLayout(new GridLayout(3, 2));

		JPanel j1 = new JPanel();
		j1.setLayout(new FlowLayout());
		butt();
		j1.add(jr1);
		j1.add(jr2);
		j1.add(jr3);
		j1.add(jbutton());
		con.add(j1);

		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		JCheckBox();
		jp2.add(jc1);
		jp2.add(jc2);
		jp2.add(jc3);
		jp2.add(jbutton2());
		con.add(jp2);

		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		con.add(jp3);
		JLabel l = new JLabel("��ѡ��֤����");
		jp3.add(l);
		jp3.add(jcom());
		jp3.add(jbutton3());

		JPanel jp4 = new JPanel();
		jp4.setLayout(new FlowLayout());
		con.add(jlist());
		setVisible(true);
	}

	public JList<String> jlist() {
		// ---------------����1---------------------�����ʼ��
		String[] str = new String[] { "�б�1", "�б�2", "�б�3", "�б�4" };
		jlis = new JList<String>(str);
		// ----------------����2---------------------Vector������������ʼ������
		Vector<String> cont = new Vector<String>();
		jlis = new JList<String>(cont);
		cont.add("�б�1");
		cont.add("�б�2");
		cont.add("�б�3");
		cont.add("�б�4");
		cont.add("�б�5");
		// ----------------����2--------------------------DefaultListModel�ഴ���б�
		String[] str1 = new String[] { "�б�1", "�б�2", "�б�3", "�б�4", "�б�5", "�б�6", "�б�7", "�б�8", "�б�9", "�б�10" };
		DefaultListModel<String> ilte = new DefaultListModel<String>();
		jlis = new JList<String>(ilte);
		for (int i = 0; i < str1.length; i++) {
			ilte.addElement(str1[i]);
		}
		return jlis;
	}

	private JComboBox<String> jcom() {
		String[] abs = new String[] { "���֤", "ѧ��֤", "��ʻ֤" };
		String lj = "��ʦ֤";
		String l = "����";
		jcoComboBox = new JComboBox<String>(abs);
		jcoComboBox.insertItemAt(lj, 2);// ����������
		jcoComboBox.insertItemAt(l, 4);
		jcoComboBox.setEnabled(true);
		jcoComboBox.setEditable(true);// ����Ϊ�����Լ��༭ģʽ
		return jcoComboBox;
	}

	private void JCheckBox() {
		jc1 = new JCheckBox("ѧ��֤");
		jc2 = new JCheckBox("���֤");
		jc3 = new JCheckBox("��ʻ֤");

	}

	private JButton jbutton3() {
		jbutt2 = new JButton("¼��");
		jbutt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt.setForeground(Color.RED);// ����������ɫ
			
				jt.setFont(new Font("����", Font.PLAIN, 20));// ����������ʽ����С
				jt.append(jcoComboBox.getSelectedItem() + "������Ϊ��" + jcoComboBox.getSelectedIndex() + "\n");// ��ȡ����
				jt.append(jcoComboBox.getSelectedItem() + "\n");// ��ȡ����
			}
		});

		return jbutt2;
	}

	private JButton jbutton2() {
		jbt1 = new JButton("¼��");
		jbt1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt.setForeground(Color.RED);// ����������ɫ
				jt.setFont(new Font("����", Font.PLAIN, 20));// ����������ʽ����С
				if (jc1.isSelected()) {
					jt.append(jc1.getText() + "ѡ��״̬��" + jc1.isSelected() + "��ѡ�У�" + "!" + '\n');
				}
				if (jc2.isSelected()) {
					jt.append(jc2.getText() + "ѡ��״̬��" + jc2.isSelected() + "��ѡ�У�" + "!" + '\n');
				}
				if (jc3.isSelected()) {
					jt.append(jc3.getText() + "ѡ��״̬��" + jc3.isSelected() + "��ѡ�У�" + "!" + '\n');
				}
				jt.append("" + '\n');
				jt.append(jc1.getText() + "ѡ��״̬��" + jc1.isSelected() + "!" + '\n' + jc2.getText() + "ѡ��״̬��"
						+ jc2.isSelected() + "!" + '\n' + jc3.getText() + "ѡ��״̬��" + jc3.isSelected() + "!" + '\n');
			}
		});
		return jbt1;
	}

	private JButton jbutton() {
		jbt = new JButton("��ӡ");
		jbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jr1.isSelected()) {
					jt.setText("");
					jt.setForeground(Color.RED);// ����������ɫ
					jt.setFont(new Font("����", Font.PLAIN, 20));// ����������ʽ����С
					jt.append(jr1.getText() + "ѡ��״̬��" + jr1.isSelected() + "(ѡ��)" + '\n');
					jt.append(jr2.getText() + "ѡ��״̬��" + jr2.isSelected() + "(ûѡ��)" + '\n');
					jt.append(jr3.getText() + "ѡ��״̬��" + jr3.isSelected() + "(ûѡ��)" + '\n');
				}
				if (jr2.isSelected()) {
					jt.setText("");
					jt.setForeground(Color.RED);
					jt.setFont(new Font("����", Font.PLAIN, 20));
					jt.append(jr1.getText() + "ѡ��״̬��" + jr1.isSelected() + "(ûѡ��)" + '\n');
					jt.append(jr2.getText() + "ѡ��״̬��" + jr2.isSelected() + "(ѡ��)" + '\n');
					jt.append(jr3.getText() + "ѡ��״̬��" + jr3.isSelected() + "(ûѡ��)" + '\n');
				}
				if (jr3.isSelected()) {
					jt.setText("");
					jt.setForeground(Color.RED);
					jt.setFont(new Font("����", Font.PLAIN, 20));
					jt.append(jr1.getText() + "ѡ��״̬��" + jr1.isSelected() + "(ûѡ��)" + '\n');
					jt.append(jr2.getText() + "ѡ��״̬��" + jr2.isSelected() + "(ûѡ��)" + '\n');
					jt.append(jr3.getText() + "ѡ��״̬��" + jr3.isSelected() + "(ѡ��)" + '\n');

				}
			}
		});
		return jbt;
	}

	private void butt() {
		buton = new ButtonGroup();
		jr1 = new JRadioButton("1");
		jr1.setSelected(true);// Ĭ��ѡ��
		jr1.setBackground(Color.YELLOW);
		jr2 = new JRadioButton("2");
		jr3 = new JRadioButton("3");
		buton.add(jr1);
		buton.add(jr2);
		buton.add(jr3);

	}

	public JButton JButton1() {
		jbutt = new JButton();
		jbutt.setText("ȷ��");
		jbutt.setBounds(30, 100, 100, 30);
		jbutt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbutt.setText("�ұ�����ˣ�");
				Color color = jbutt.getBackground();
				Color col = JColorChooser.showDialog(jbutt, "ѡ����ɫ", color);
				jbutt.setBackground(col);
				jt.setForeground(col);
				//jt.setBackground(col);//���ñ�����ɫ
				//JOptionPane.showMessageDialog(jbutt, "û�����������ˣ����ȷ�����ء�");
				jbutt.setText("ȷ��");
			}
		});
		return jbutt;
	}

	public static void main(String[] args) {
		new ��ѡ��();

	}
}
