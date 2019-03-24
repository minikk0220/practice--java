package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class BoxLayoutDemo extends JFrame{
    Box baseBox,boxV1,boxV2;

    public BoxLayoutDemo(){

        boxV1 = Box.createVerticalBox();//获得一个具有列型盒式布局的盒式容器
        boxV1.add(new JLabel("输入您的名字："));
        boxV1.add(Box.createVerticalStrut(8));//垂直支撑
        boxV1.add(new JLabel("输入您的email:"));
        boxV1.add(Box.createVerticalStrut(8));//垂直支撑
        boxV1.add(new JLabel("输入您的职业："));

        boxV2 = Box.createVerticalBox();//获得一个具有列型盒式布局的盒式容器
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));//垂直支撑
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));//垂直支撑
        boxV2.add(new JTextField(16));

        baseBox = Box.createHorizontalBox();//获得一个具有行型盒式布局的盒式容器
        baseBox.add(boxV1);
        baseBox.add(Box.createHorizontalStrut(10));//水平支撑
        baseBox.add(boxV2);

        Container con = getContentPane();//获得框架JFrame的内容窗格并在此基础上操作，也可以在JFrame内新建JPanel后操作
        con.setLayout(new FlowLayout());
        con.add(baseBox);
        con.validate();//验证此容器及其所有子组件
        setBounds(120,100,500,500);//定义组件的位置和大小
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口的另一中方法

        }

        public static void main(String[] args){
        BoxLayoutDemo box = new BoxLayoutDemo();
        }
}
