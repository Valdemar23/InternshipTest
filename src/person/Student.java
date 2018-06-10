package person;

import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Student {
    private Knowledge personKnowledge;
    private String name;

    public Student(String name){
        this.name=name;
    }

    public Student(String name,Knowledge knowledge) {
        this.name=name;
        personKnowledge=knowledge;
        //TODO: Implementation is needed
    }

    public void setKnowledge(Knowledge knowledge) {
        personKnowledge=knowledge;
        //TODO: Implementation is needed
    }

    public Knowledge getKnowledge(){
        return personKnowledge;
    }

    //public ArrayList<>
}
