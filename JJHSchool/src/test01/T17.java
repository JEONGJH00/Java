package test01;

import java.util.*;

abstract class Sprite {
    int x = 3, y = 3;

    abstract void move(char c);
}

class Main extends Sprite {
    void move(char c) {
        if (c == 'h')
            --x;
        else if (c == 'j')
            --y;
        else if (c == 'k')
            ++y;
        else if (c == 'l')
            ++x;
    }
}

class Monster extends Sprite {
    public Monster() {
        x = y = 7;
    }

    void move(char c) {
        x += (Math.random() - 0.5) > 0 ? 1 : -1;
        y += (Math.random() - 0.5) > 0 ? 1 : -1;
    }
}

public class T17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] game = new String[10][17];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 17; j++) {
                game[i][j] = " ";
            }
        }
        game[7][2] = "G";
        Main i = new Main();
        game[i.y][i.x] = "@";
        Monster m = new Monster();
        game[m.y][m.x] = "M";
        while (true) {
            System.out.print("###################\n");
            for (int k = 0; k < 10; k++) {
                System.out.print("#");
                for (int j = 0; j < 17; j++) {
                    System.out.print(game[k][j]);
                }
                System.out.print("#\n");
            }
            System.out.print("###################\n");
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
            char input = sc.next().charAt(0);
            game[i.y][i.x] = " ";
            i.move(input);
            game[m.y][m.x] = " ";
            int my = m.y, mx = m.x;
            m.move(input);
            if (m.y < 10 && m.x < 17) {
                game[i.y][i.x] = "@";
                game[m.y][m.x] = "M";
            } else {
                game[i.y][i.x] = "@";
                game[my][mx] = "M";
            }
            if (i.y == 7 && i.x == 2) {
                System.out.println("골드 획득! \nYOU WIN");
                break;
            }
            if (i.y == m.y && i.x == m.x) {
                System.out.println("몬스터에게 잡혔습니다! \nGAME OVER");
                break;
            }
        }
        sc.close();
    }
}
