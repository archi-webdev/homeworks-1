package aston.home.work;

public class Evuluation {
    private int evaluation;
    private Student student;

    public Evuluation(int evaluation, Student student) {
        this.evaluation = evaluation;
        this.student = student;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public Student getStudent() {
        return student;
    }
}
