package dominio.bootcamp.courses;


import dominio.classroom.Student;
import dominio.classroom.Teacher;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Course {

    private Atribute atributes = new Atribute();
    private Set<Dicipline> diciplines = new HashSet<>();

    private Set<Teacher> teachers = new HashSet<>();

    private Set<Student> students = new LinkedHashSet<>();

    public Course(Atribute atributes) {
        this.atributes = atributes;
    }
    public Course(){

    }

    public void addDiciplines(Dicipline dicipline){
        diciplines.add(dicipline);
    }

    public void removeDiciplines(Dicipline dicipline){
        diciplines.remove(dicipline);
    }
    public void addStudent(Student student){
        if (!students.contains(student)){
            this.students.add(student);
            student.addCourse(this);
        }else System.out.println("Aluno ja esta matriculado no curso");
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void addTeacher(Teacher teacher){teachers.add(teacher);teacher.addCourse(this);}
    public void removeTeacher(Teacher teacher){teachers.remove(teacher);}

    public void showStudents(){
        for(Student s: students){
            System.out.println(s.getName());
        }
    }

    public String getName(){
        return atributes.name;
    }
    public void setName(String name){
        this.atributes.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Dicipline> getDiciplines() {
        return diciplines;
    }

    public void setDiciplines(Set<Dicipline> diciplines) {
        this.diciplines = diciplines;
    }
}
