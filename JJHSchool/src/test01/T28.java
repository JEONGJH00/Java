package test01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    private JTextField tf;
    private JPanel panel;
    private double result;
    private String op;
    private boolean state = false;

    String[] nums = { "Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "1", "2",
            "3", "-", "1/x", "0", "+/-", ".", "+", "=" };

    public Calculator() {
        this.setSize(520, 180);
        tf = new JTextField(20);
        add(tf, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));
        add(panel, BorderLayout.CENTER);
        for (int i = 0; i < 25; i++) {
            JButton btn = new JButton("" + nums[i]);
            if (i % 5 == 3 || i % 5 == 4) {
                btn.setForeground(Color.red);
            }
            btn.setBackground(Color.yellow);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100, 30));
            panel.add(btn);
        }
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String gac = e.getActionCommand();
        if (gac.charAt(0) >= 48 && gac.charAt(0) < 58) {

            tf.setText(tf.getText() + gac);
        } else {

            if (state && gac.equals("=")) {
                state = false;

                if (op.equals("+"))
                    tf.setText((Double.parseDouble(tf.getText()) + result) + "");
                else if (op.equals("-"))
                    tf.setText((result - Double.parseDouble(tf.getText())) + "");
                else if (op.equals("/"))
                    tf.setText((result / Double.parseDouble(tf.getText())) + "");
                else if (op.equals("*"))
                    tf.setText((Double.parseDouble(tf.getText()) * result) + "");
                else if (op.equals("%"))
                    tf.setText((result % Double.parseDouble(tf.getText())) + "");
            } else {
                state = true;
                result = Double.parseDouble(tf.getText());
                op = gac;
                tf.setText("");
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }

}