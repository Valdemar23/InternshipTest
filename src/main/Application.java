package main;

import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Student student1=new Student("JC",new Knowledge(12));
        Student student2=new Student("Alex");
        Student student3=new Student("Pool");
        Student student4=new Student("Vader");
        Student student5=new Student("Vasya");
        Student student6=new Student("Ivan",new Knowledge(4));
        student2.setKnowledge(new Knowledge(5));
        student3.setKnowledge(new Knowledge(8));
        student4.setKnowledge(new Knowledge(7));
        student5.setKnowledge(new Knowledge(2));
        ArrayList <Student>studentArrayList=new ArrayList<>();
        studentArrayList.add(student6);
        studentArrayList.add(student5);
        studentArrayList.add(student4);
        studentArrayList.add(student3);
        studentArrayList.add(student2);
        studentArrayList.add(student1);

        University university = new University("CH.U.I.");

        university.setStudents(studentArrayList);

        university.addStudent(new Student("Andrew Kostenko",new Knowledge(7)));
        university.addStudent(new Student("Julia Veselkina",new Knowledge(7)));
        university.addStudent(new Student("Maria Perechrest",new Knowledge(7)));
        float avg=university.calculateAvg(studentArrayList);



        for(Student student:university.getStudents()){
            Knowledge knowledge=student.getKnowledge();
            System.out.println(student.getName()+" "+knowledge.getLevel());
        }


        Internship internship = new Internship("Interlink");
        //internship.
        internship.addStudents(university,avg);
        System.out.println("List of internship's students:");
        ArrayList<Student>students=new ArrayList<>();
        for(Student student:students) System.out.println(String.valueOf(student.getName().toString()));
        System.out.println(internship.getStudents());
        System.out.println("AVG: "+avg);
    }
}
