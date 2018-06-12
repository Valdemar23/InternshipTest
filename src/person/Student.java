package person;

import person.consciousness.Knowledge;

public class Student {
    private int id;
    private Knowledge personKnowledge;
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
