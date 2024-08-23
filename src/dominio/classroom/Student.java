package dominio.classroom;

import dominio.bootcamp.courses.Course;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {

    private String name;

    private Double xp = 0.0;
    private Set<Course> courses = new LinkedHashSet<>();

    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(String name, Double xp) {
        this.name = name;
        this.xp = xp;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getXp() {
        return xp;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public void showCourses(){
        for (Course c : courses){
            System.out.println(c.getName());
        }
    }
    public void addCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
        }else System.out.println("Curso ja existe em sua grade");
    }
}
