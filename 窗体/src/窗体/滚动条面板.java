package ����;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ��������� extends JFrame{
    public ���������() {
    	setTitle ("�������ı���");
    	setBounds(400, 400, 500, 450);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//JPanel jpan9=new JPanel();
    	Container jpan=getContentPane();
    	JTextArea jte=new JTextArea(20,10);//�����ַ�����
        JScrollPane js=new JScrollPane(jte); //�����������������  
    	jte.setSize(200,200);
    	jpan.add(js);
    	setVisible(true);
    }
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ���������();

	}

}
