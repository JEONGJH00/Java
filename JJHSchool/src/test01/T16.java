package test01;

interface A {
    int add(int a, int b);
}

interface B {
    int sub(int a, int b);
}

class C implements A, B {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class T16 {

    public static void d() {
        System.out.println("d");
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.add(3, 5));
        System.out.println(c.sub(8, 4));
    }
}
