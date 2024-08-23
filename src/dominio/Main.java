package dominio;

import dominio.bootcamp.courses.Atribute;
import dominio.bootcamp.courses.Course;
import dominio.classroom.Student;
import dominio.classroom.Teacher;

import java.time.chrono.ChronoLocalDate;

public class Main {

    public static void main(String[] args) {

        Course angular = new Course(new Atribute("Angular","Curso para iniciantes em programacao",50,200,3));
        Course java = new Course(new Atribute("Java","Curso para iniciantes em programacao",50,200,3));
        Course spring = new Course(new Atribute("Spring","Curso para iniciantes em programacao",50,200,3));

        Student carlos= new Student("Carlos");
        Student eduardo= new Student("Eduardo");
        Student ariovaldo = new Student("Ariovaldo");
        Student irineu = new Student("Irineu");
        Student roberta= new Student("Roberta");

        Teacher jubileu = new Teacher("Jubileu");

        angular.addStudent(carlos);
        java.addStudent(carlos);
        angular.addStudent(roberta);
        angular.addStudent(eduardo);
        angular.addStudent(ariovaldo);
        angular.addStudent(irineu);
        angular.addStudent(roberta);
        spring.addStudent(roberta);

        angular.showStudents();

        carlos.showCourses();

        System.out.println("--------------------------------------");

        roberta.showCourses();

        angular.addTeacher(jubileu);
        java.addTeacher(jubileu);
        spring.addTeacher(jubileu);

        jubileu.showCourses();

        System.out.println("-----------");

        angular.showStudents();
    }
}
