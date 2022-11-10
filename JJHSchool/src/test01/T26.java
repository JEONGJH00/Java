package test01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickButton extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    private int count = 0;

    public ClickButton() {
        setLayout(new FlowLayout());
        setSize(300, 200);
        setTitle("Problem #1");

        JPanel panel = new JPanel();
        label = new JLabel("클릭 횟수");
        panel.add(label);
        button = new JButton("버튼을 눌러보세요");
        panel.add(button);

        button.addActionListener(this);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        count++;
        label.setText("클릭 횟수: " + count);

    }

}

public class T26 {
    public static void main(String[] args) {
        ClickButton cb = new ClickButton();
    }
}
