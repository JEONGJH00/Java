package test01;

import javax.swing.*;

import java.awt.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(600, 200);
        setLocation(200, 300);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.white);
        JLabel lbl1 = new JLabel("자바는 재미있나요?");
        JLabel lbl2 = new JLabel("");
        JButton btn1 = new JButton("Yes");
        JButton btn2 = new JButton("No");
        this.add(lbl1);
        this.add(btn1);
        this.add(btn2);
        this.add(lbl2);
        btn1.addActionListener(event -> {
            lbl2.setText("구라치지마세요");
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class T22 {
    public static void main(String[] args) {
        JFrame j = new MyFrame();

    }
}
