# Courses Platform

<h2>Descrição</h2>

o CoursesPlatform é uma aplicação simples para criação e gerenciamentos de cursos baseada unicamente em puro Java,
como foi apenas um desafio da plataforma de cursos DIO eu apenas criei um esboço para mostrar dominio dos
pilares da orientação a objetos, porém é uma API totalmente funcional e escalavel com possiveis incrementações no futuro,
tais como adição de banco de dados, cloud, injeção de dependencia com Spring, possibilidade de desenvolvimento da interface
de usuarios com alguma linguagem de front-end e etc...

<h2>Diagrama de classes</h2>

``` mermaid
classDiagram
    class Course {
        - Atribute atribute
        - Set<Dicipline> dicipline
        - Set<Student> students
        - Set<Teacher> teachers
        + addStudent(Student Student)
        + removeStudent(Student Student)
        + addTeacher(Teacher teacher)
        + removeTeacher(Teacher teacher)
        + addDicipline(Dicipline dicipline)
        + removeDicipline(Dicipline dicipline)
    }

    class Student {
        - String name
        - Double xp = 0.0
        - Set<Course> courses = new LinkedHashSet<>()

        + Student()
        + Student(String name)
        + Student(String name, Double xp)
        + Set<Course> getCourses()
        + void showCourses()
        + void addCourse(Course course)
    }
    class Teacher {
        -String name
        -Set<Course> courses
        +Teacher(String name, Course course)
        +Teacher(String name)
        +Teacher()
        +void addCourse(Course course)
        +void removeCourse(Course course)
        +void getStudentsByCourse(Course course)
        +void showCourses()
    }
    class Atribute {
        - String titulo
        - String descricao
        - int xp
    }
    class Dicipline {
        - Atribute atribute
        - Set Content 
        + addContent()
        + removeContent()
    }
    class Content {
        - Atribute atribute
        - Set<LiveMentoring> lives
        - int xp
        - int workload
        - int contentDificulty

        + Content(Atribute atribute, int xp, int workload, int contentDificulty)
        + addLive(LiveMentoring live)
        + excludeLive(LiveMentoring live)
        + removeLive(LiveMentoring live)
        + calculateXp()
    }
        class LiveMentoring {
        - String title
        - String description
        - Double hourCourse = 2.0
        - LocalDate eventDate = LocalDate.of(1970, 1,1)

        + String getTitle()
        + void setTitle(String title)
        + String getDescription()
        + void setDescription(String description)
        + Double getHourCourse()
        + void setHourCourse(Double hourCourse)
        + LocalDate getEventDate()
        + void setEventDate(LocalDate eventDate)
    }
    
    Atribute *-- Dicipline
    Atribute *-- Content
    Atribute *-- LiveMentoring
    Atribute *-- Course
    Course "1" --o "N" Dicipline
    Teacher "1" --o "N" Course
    Teacher "N" o--o "N" Student
    Dicipline "1" --o "N" Content
    Content "1" --o "N" LiveMentoring
```

<h2>Linguagens Usadas</h2>

Por hora apenas utilizei Java na sua versão 20.dire