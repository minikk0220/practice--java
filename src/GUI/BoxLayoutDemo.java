package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class BoxLayoutDemo extends JFrame{
    Box baseBox,boxV1,boxV2;

    public BoxLayoutDemo(){

        boxV1 = Box.createVerticalBox();//���һ���������ͺ�ʽ���ֵĺ�ʽ����
        boxV1.add(new JLabel("�����������֣�"));
        boxV1.add(Box.createVerticalStrut(8));//��ֱ֧��
        boxV1.add(new JLabel("��������email:"));
        boxV1.add(Box.createVerticalStrut(8));//��ֱ֧��
        boxV1.add(new JLabel("��������ְҵ��"));

        boxV2 = Box.createVerticalBox();//���һ���������ͺ�ʽ���ֵĺ�ʽ����
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));//��ֱ֧��
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));//��ֱ֧��
        boxV2.add(new JTextField(16));

        baseBox = Box.createHorizontalBox();//���һ���������ͺ�ʽ���ֵĺ�ʽ����
        baseBox.add(boxV1);
        baseBox.add(Box.createHorizontalStrut(10));//ˮƽ֧��
        baseBox.add(boxV2);

        Container con = getContentPane();//��ÿ��JFrame�����ݴ����ڴ˻����ϲ�����Ҳ������JFrame���½�JPanel�����
        con.setLayout(new FlowLayout());
        con.add(baseBox);
        con.validate();//��֤�������������������
        setBounds(120,100,500,500);//���������λ�úʹ�С
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ��ڵ���һ�з���

        }

        public static void main(String[] args){
        BoxLayoutDemo box = new BoxLayoutDemo();
        }
}
