package person;

import person.consciousness.Knowledge;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    private Knowledge personKnowledge;
    @Column(name="name")
    private String name;
    public Student(String name){
        this.name=name;
    }

    public Student(String name,Knowledge knowledge) {
        this.name=name;
        personKnowledge=knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        personKnowledge=knowledge;
        //TODO: Implementation is needed
    }

    public Knowledge getKnowledge(){
        return personKnowledge;
    }

    public String getName() {
        return name;
    }
}
