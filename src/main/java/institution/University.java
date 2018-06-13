package institution;

import person.Student;
import person.consciousness.Knowledge;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name="university")
//@MappedSuperclass
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    private Student student;
    private ArrayList<Student> students;
    private float avg;
    public University(String name) {
        this.name=name;
        students=new ArrayList<Student>();
    }

    public University() {
    }

    public void setStudent(Student student) {
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.student=student;
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public float calculateAvg(ArrayList<Student> arr){
        float sum=0;
        for(Student student:arr){
            Knowledge knowledge=student.getKnowledge();
            sum+=knowledge.getLevel();//Integer.parseInt(String.valueOf(student.getKnowledge()))
        }

        avg=sum/arr.size();
        return avg;
    }
}
