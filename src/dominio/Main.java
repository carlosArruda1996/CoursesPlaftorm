package dominio;

import dominio.bootcamp.courses.Atribute;
import dominio.bootcamp.courses.Course;
import dominio.classroom.Student;

import java.time.chrono.ChronoLocalDate;

public class Main {

    public static void main(String[] args) {
        Course angular = new Course(new Atribute("Angular","Curso para iniciantes em programacao",50,200,3));
        Course java = new Course(new Atribute("Java","Curso para iniciantes em programacao",50,200,3));
        Course spring = new Course(new Atribute("Spring","Curso para iniciantes em programacao",50,200,3));
        Student carlos= new Student("Carlos");
        Student roberta= new Student("Roberta");
        angular.addStudent(carlos);
        java.addStudent(carlos);
        angular.addStudent(roberta);
        spring.addStudent(roberta);

        angular.showStudents();
        carlos.showCourses();
        System.out.println("--------------------------------------");
        roberta.showCourses();
    }
}
