package aston.home.work;

public class Course {
    private String nameCourse;
    private Fakultati fakultati;

    public Course(String nameCourse, Fakultati fakultati) {
        this.nameCourse = nameCourse;
        this.fakultati = fakultati;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Fakultati getFaculty() {
        return fakultati;
    }

    public void setFaculty(Fakultati fakultati) {
        this.fakultati = fakultati;
    }
}