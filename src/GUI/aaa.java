package GUI;

/**
 * 用匿名类，匿名对象实现actionTest
 */
import shiyan.Eight.WindowDestroyer;

import java.awt.*;
import java.awt.event.*;
public class aaa extends Frame{
    Button b1,b2;
    //Panel p1;
    public aaa(){
        super("DEMO");
        b1 = new Button("RED");
        b2 = new Button("BLUE");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                if(b1.getActionCommand().equals("RED"))
                    setBackground(Color.red);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                if(b2.getActionCommand().equals("BLUE"))
                    setBackground(Color.blue);
            }
        });
        setLayout(new FlowLayout());
        add(b1);add(b2);//add(p1,new BorderLayout().CENTER);

        addWindowListener(new WindowDestroyer());
        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args){
        new aaa();
    }


}
