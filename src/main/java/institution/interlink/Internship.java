package institution.interlink;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="internship")
public class Internship extends University {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String nameIntership;
    private Student student;
    private ArrayList<Student> arrayList=new ArrayList<Student>();


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
            Knowledge knowledge= st.getKnowledge();
            if(knowledge.getLevel()> n) this.arrayList.add(st);
        }
    }

    public ArrayList<Student> getStudents() {
        //TODO: Implementation is needed
        return arrayList;
    }
}
