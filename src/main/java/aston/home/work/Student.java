package aston.home.work;

public class Student {
    private String studentsName;
    private Course course;


    public Student(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getNameStudent() {
        return studentsName;
    }

    public void setNameStudent(String studentsName) {
        this.studentsName = studentsName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studying(){
        System.out.println("Студент " + studentsName + " обучается.");
    }


}
