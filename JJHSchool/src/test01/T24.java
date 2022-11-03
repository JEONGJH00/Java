package test01;

import java.awt.*;

import javax.swing.*;

class RandomLabel extends JFrame {
    JLabel[] lbl = new JLabel[10];

    RandomLabel() {
        this.setLayout(null);
        for (int i = 0; i < 10; i++) {
            lbl[i] = new JLabel("");
            lbl[i].setText("" + i);
            lbl[i].setSize(15, 15);
            int x = (int) (Math.random() * 250);
            int y = (int) (Math.random() * 250);
            lbl[i].setLocation(x, y);
            this.add(lbl[i]);
        }
        this.setSize(300, 300);
        this.setVisible(true);
    }
}

public class T24 {
    public static void main(String[] args) {
        RandomLabel lbl = new RandomLabel();
    }
}
