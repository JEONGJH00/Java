//스윙 버튼 랜덤 배경색
package test01;

import java.awt.*;
import javax.swing.*;

class ColorFrame extends JFrame {
    private JPanel panel;
    private JButton[] buttons;

    public ColorFrame() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 3, 3));
        buttons = new JButton[20];
        int index = 0;
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 5; cols++) {
                buttons[index] = new JButton("" + index);
                int R = (int) (Math.random() * 256);
                int G = (int) (Math.random() * 256);
                int B = (int) (Math.random() * 256);
                Color color = new Color(R, G, B);
                buttons[index].setBackground(color);
                panel.add(buttons[index]);
                index++;
            }
        }
        add(panel, BorderLayout.CENTER);
        setSize(1000, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class T23 {
    public static void main(String[] args) {
        ColorFrame cf = new ColorFrame();
    }
}
