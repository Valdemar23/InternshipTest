package institution.interlink;

import main.University;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Internship extends University {
    private int id;
    private String nameIntership;
    private Student student;
    private ArrayList<Student> arrayList=new ArrayList<>();
    private Knowledge knowledge;
    University university=new University();

    public Internship(String name) {
        nameIntership=name;
        //TODO: Implementation is needed
    }

    public void setStudent(Student student) {

        //this.student=student;
        //TODO: Implementation is needed
    }

    public void addStudents(University university,float n){// ArrayList<Student> students
        ArrayList<Student> students=university.getStudents();
        for(Student st:students){
            System.out.println("Name "+st.getName());
            Knowledge knowledge=st.getKnowledge();
            if(knowledge.getLevel()> n){
                this.arrayList.add(st);
            }
        }
    }


    public ArrayList<Student> getStudents() {
        //TODO: Implementation is needed

        return arrayList;//"Andrew Maslenko\nJulia Veselkina\n"
    }


}
