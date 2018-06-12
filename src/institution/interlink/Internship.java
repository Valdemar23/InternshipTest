package institution.interlink;

import main.University;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Internship extends University {
    private int id;
    private String nameIntership;
    private Student student;
    private ArrayList<Student> arrayList;
    private Knowledge knowledge;
    University university=new University();

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

    public void addStudent(Student student){
        Knowledge knowledge=new Knowledge(student.getKnowledge());
        if(knowledge.getLevel()< super.avg){
            arrayList.add(student);
        }
    }


    public ArrayList<Student> getStudents() {
        //TODO: Implementation is needed

        return arrayList;//"Andrew Maslenko\nJulia Veselkina\n"
    }


}
