package dominio.classroom;

import dominio.bootcamp.courses.Course;

import java.util.LinkedHashSet;
import java.util.Set;

public class Teacher {

    private String name;

    private Set<Course> courses = new LinkedHashSet<>();

    public  Teacher(String name, Course course){
        this.name = name;
        if(courses.contains(course)){
            courses.add(course);
        }
    }
    public Teacher(String name){
        this.name = name;
    }
    public Teacher(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addCourse(Course course){courses.add(course);}
    public void removeCourse(Course course){courses.remove(course);}
    public void getStudentsByCourse(Course course){course.showStudents();}
    public void showCourses(){ courses.getClass().getName();for (Course c : courses){
        System.out.println(c.getName());
        }
    }
}
