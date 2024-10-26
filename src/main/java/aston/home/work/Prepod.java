package aston.home.work;

public class Prepod {
    private String nameLecturer;
    private Course course;

    public Prepod(String nameLecturer, Course course) {
        this.nameLecturer = nameLecturer;
        this.course = course;
    }

    public String getNameLecturer() {
        return nameLecturer;
    }

    public void setNameLecturer(String nameLecturer) {
        this.nameLecturer = nameLecturer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void registrationStudent (Student student) {
        student.setCourse(course);
        System.out.printf("Студент %s поступил на курс %s.", student.getNameStudent(), course.getNameCourse());
    }

    public void evaluationStudent(int evaluation, Student student) {
        Arhiv.addEvaluationToArchive(new Evuluation(evaluation, student));
        System.out.printf("%s оценка %d за курс %s. \n Оценка перешла в архив.\n", student.getNameStudent(), evaluation, student.getCourse().getNameCourse());

    }
}
