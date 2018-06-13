package main;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class University {
    private int id;
    private String name;
    private Student student;
    private ArrayList<Student> students;
    private float avg;
    public University(String name) {
        this.name=name;
        students=new ArrayList<>();
        //TODO: Implementation is needed
    }

    public University() {
    }

    public void setStudent(Student student) {

        //TODO: Implementation is needed
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
        //TODO: Implementation is needed
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
