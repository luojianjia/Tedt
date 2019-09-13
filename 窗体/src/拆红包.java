
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ���� extends JFrame { // ����OpenBag��̳�JFrame
	// ���������еĳ�Ա���
	private JPanel contentPane;
	private JLabel lblBag;

	/**
	 * ������
	 */
	public static void main(String[] args) {
		���� frame = new ����(); // ����OpenBag����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	private int x = 10; // ��ʼͼ��ĺ�����
	private int y = 10; // ��ʼͼ���������

	public ����() { // OpenBag�Ĺ��췽��
		setTitle("���Կ����ܲ���������"); // ���ô�����Ŀ
		setResizable(false); // ���ɸı䴰����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(getWidth() / 2, getHeight() / 2, 705, 420); // ���ô����λ�úͿ��
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı߾�Ͳ��֣��߽粼�֣�
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		/**
		 * �������panel�������contentPane�е��м�
		 */
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		/**
		 * ������ǩlabel�������panel�У��������ͼ�����ǩ�Ŀ��
		 */
		lblBag = new JLabel("");
		lblBag.setLocation(x, y); // ���ñ�ǩ������е�λ��
		lblBag.addMouseListener(new MouseAdapter() { // ͼ����������¼�
			@Override
			public void mouseEntered(MouseEvent e) { // �������ʱ���¼�
				if (x >= 10 && x <= 144 && y >= 10 && y <= 192) { // ��������ڵ���10��С�ڵ���144����������ڵ���10��С�ڵ���192ʱ
					// �����겻�ϼ�134�������겻�ϼ�182
					x += 134;
					y += 182;
					lblBag.setLocation(x, y); // �������ñ�ǩ������е�λ��
				}
				if (x > 144 || y > 192) { // ���������144�����������192
					// �����겻�ϼ�134�������겻�ϼ�182
					x += 134;
					y -= 182;
					lblBag.setLocation(x, y); // �������ñ�ǩ������е�λ��
				}
				if (x == 680 && y == -172) { // ���������680�����������-172
					x = 10;
					y = 192;
					lblBag.setLocation(x, y); // �������ñ�ǩ������е�λ��
				}
				if (x == 546 && y == -172) { // ���������546�����������-172
					x = 546;
					y = 192;
					lblBag.setLocation(x, y); // �������ñ�ǩ������е�λ��
				}
				if (x == 680 && y == 10) { // ���������680�����������10
					x = 10;
					y = 10;
					lblBag.setLocation(x, y); // �������ñ�ǩ������е�λ��
				}
			}
		});
		lblBag.setHorizontalAlignment(SwingConstants.CENTER);
		lblBag.setIcon(new ImageIcon(����.class.getResource("1.png")));
		lblBag.setSize(134, 182);
		panel.add(lblBag);
	}
}
