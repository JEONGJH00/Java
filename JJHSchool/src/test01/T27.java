package test01;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TicTacToe extends JPanel implements ActionListener {

    JButton btnArr[][] = new JButton[3][3];
    int arr[][] = new int[3][3];
    int turn = 0;

    JButton winBtn = new JButton();
    JButton reBtn = new JButton();

    TicTacToe() {

        this.setLayout(null);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btnArr[i][j] = new JButton();
                btnArr[i][j].setSize(100, 100);
                btnArr[i][j].setLocation(43 + j * 100, 30 + i * 100);
                btnArr[i][j].addActionListener(this);
                this.add(btnArr[i][j]);
                arr[i][j] = 0;
            }
        }
        winBtn.setText("Winner?");
        winBtn.setSize(160, 40);
        winBtn.setLocation(43, 350);
        winBtn.addActionListener(this);
        this.add(winBtn);

        reBtn.setText("다시하기");
        reBtn.setSize(120, 40);
        reBtn.setLocation(223, 350);
        reBtn.addActionListener(this);
        this.add(reBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == btnArr[i][j]) {
                    if (turn % 2 == 0) {
                        btnArr[i][j].setText("O");
                        arr[i][j] = 1;
                    } else {
                        btnArr[i][j].setText("X");
                        arr[i][j] = 2;
                    }
                    btnArr[i][j].setEnabled(false);
                    turn++;
                }
            }
        }

        if (e.getSource() == reBtn) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    btnArr[i][j].setText(i * 3 + j + 1 + "");
                    btnArr[i][j].setEnabled(true);
                    arr[i][j] = 0;
                }
            }
            winBtn.setText("Winner?");
            turn = 0;
        }

        if (check() == 1) {
            winBtn.setText("P1 WIN!");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    btnArr[i][j].setEnabled(false);
                }
            }
        }
        if (check() == 2) {
            winBtn.setText("P2 WIN!");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    btnArr[i][j].setEnabled(false);
                }
            }
        }
    }

    int check() {

        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i][j] == 1 && arr[i][j + 1] == 1 && arr[i][j + 2] == 1) {
                return 1;
            } else if (arr[i][j] == 2 && arr[i][j + 1] == 2 && arr[i][j + 2] == 2) {
                return 2;
            }
        }

        int i = 0;
        for (j = 0; j < 3; j++) {
            if (arr[i][j] == 1 && arr[i + 1][j] == 1 && arr[i + 2][j] == 1) {
                return 1;
            } else if (arr[i][j] == 2 && arr[i + 1][j] == 2 && arr[i + 2][j] == 2) {
                return 2;
            }
        }

        // 대각선 검사(\)
        i = 0;
        if (arr[i][i] == 1 && arr[i + 1][i + 1] == 1 && arr[i + 2][i + 2] == 1) {
            return 1;
        } else if (arr[i][i] == 2 && arr[i + 1][i + 1] == 2 && arr[i + 2][i + 2] == 2) {
            return 2;
        }

        // 대각선 검사(/)
        i = 0;
        if (arr[i][i + 2] == 1 && arr[i + 1][i + 1] == 1 && arr[i + 2][i] == 1) {
            return 1;
        } else if (arr[i][i + 2] == 2 && arr[i + 1][i + 1] == 2 && arr[i + 2][i] == 2) {
            return 2;
        }

        return 0;
    }
}

public class T27 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tic Tac Toe");

        frame.setSize(400, 460);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();
        frame.setLocation((size.width - 400) / 2, (size.height - 460) / 2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(new TicTacToe());

        frame.revalidate();
    }
}
