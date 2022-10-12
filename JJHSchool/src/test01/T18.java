package test01;

interface GetInfo {
    double getValue();
}

class Student implements GetInfo {
    private double score;

    public Student(double score) {
        this.score = score;
    }

    @Override
    public double getValue() {
        return score;
    }

}

public class T18 {
    public static void main(String args[]) {
        Student[] student = new Student[4];
        student[0] = new Student(3.5);
        student[1] = new Student(3.75);
        student[2] = new Student(4.0);
        student[3] = new Student(4.2);
        double average = average(student);
        System.out.println(average);
    }

    public static double average(Student[] objects) {
        double sum = 0;
        for (Student obj : objects) {
            double measure = obj.getValue();
            sum = sum + measure;
        }
        double result = sum / objects.length;
        return result;
    }
}
