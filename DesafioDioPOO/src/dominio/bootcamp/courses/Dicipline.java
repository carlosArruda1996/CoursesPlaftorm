package dominio.bootcamp.courses;


import dominio.classroom.Student;
import dominio.classroom.Teacher;

import java.util.Set;

public class Dicipline {

    private Atribute atribute;
    private Set<Content> contents;


    public void addContents(Content content){
        contents.add(content);
    }
    public void removeContent(Content content){
        contents.remove(content);
    }
}
