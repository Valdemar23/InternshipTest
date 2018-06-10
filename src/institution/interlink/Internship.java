package institution.interlink;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Internship {
    private String nameIntership;
    private Student student;
    private Knowledge knowledge;

    public Internship(String name) {
        nameIntership=name;
        //TODO: Implementation is needed
    }



    public Internship(String name,Student student) {
        nameIntership=name;
        this.student=student;
        //TODO: Implementation is needed
    }

    public Internship(String name,Student student,Knowledge knowledge) {
        nameIntership=name;
        this.student=student;
        this.knowledge=knowledge;
        //TODO: Implementation is needed
    }

    public void setStudent(Student student) {

        this.student=student;
        //TODO: Implementation is needed
    }



    public String getStudents() {

        //TODO: Implementation is needed
        return "Andrew Maslenko\nJulia Veselkina\n";
    }


}
