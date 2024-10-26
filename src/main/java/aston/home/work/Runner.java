package aston.home.work;

public class Runner {
    public static void main(String[] args) {
        Fakultati faculty = new Fakultati("IT", "Р.А. Абрамович");
        Course courseEngineer = new Course("QA Engineer", faculty);
        Course courseDevOps = new Course("DevOps", faculty);
        Prepod PrepodOne = new Prepod("Г.Г. Романыч", courseEngineer);
        Prepod PrepodTwo = new Prepod("И.К. Жданов", courseDevOps);
        Student student1 = new Student("Дима");
        Student student2 = new Student("Катя");
        Student student3 = new Student("Николай");
        PrepodOne.registrationStudent(student1);
        PrepodOne.registrationStudent(student2);
        PrepodTwo.registrationStudent(student3);
        student1.studying();
        student2.studying();
        student3.studying();
        PrepodOne.evaluationStudent(3, student1);
        PrepodOne.evaluationStudent(4, student2);
        PrepodTwo.evaluationStudent(5, student3);

    }
}
