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
        float avg=0;
        avg=university.calculateAvg(studentArrayList);

        for(Student student:university.getStudents()){
            Knowledge knowledge=student.getKnowledge();
            System.out.println(student.getName()+" "+knowledge.getLevel());
        }

        System.out.println("AVG: "+avg);
        Internship internship = new Internship("Interlink");
        internship.addStudents(university,avg);
        System.out.println("List of internship's students:");
        ArrayList<Student>students=internship.getStudents();
        for(Student student:students){
            Knowledge knowledge=student.getKnowledge();
            System.out.println(student.getName() +" " +knowledge.getLevel());
        }




        University university1 = new University("CHDTU");
        university1.addStudent(new Student("Andrew",new Knowledge(6)));
        university1.addStudent(new Student("Julia",new Knowledge(8)));
        university1.addStudent(new Student("Maria",new Knowledge(7)));
        university1.addStudent(new Student("Nastya",new Knowledge(10)));
        university1.addStudent(new Student("Vova",new Knowledge(9)));
        System.out.println("List CHDTU");
        for(Student student:university1.getStudents()){
            Knowledge knowledge=student.getKnowledge();
            System.out.println(student.getName()+" "+knowledge.getLevel());
        }
        //
        studentArrayList=null;
        //studentArrayList.add();
        university1.setStudents(studentArrayList);
        avg=university1.calculateAvg(studentArrayList);
        System.out.println("AVG2: "+avg);

        internship.addStudents(university1,avg);
        for(Student student:students){
            Knowledge knowledge=student.getKnowledge();
            System.out.println(student.getName() +" " +knowledge.getLevel());
        }
    }
}
