/// creating the hierarchy
class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person: " + name);
    }
}

// Child class 1
class Student extends Person {
    Student(String name) {
        super(name);
        System.out.println("Student: " + name);
    }
}

// Child class 2
class Teacher extends Person {
    Teacher(String name) {
        super(name);
        System.out.println("Teacher: " + name);
    }
}

// Child class 3
class Principal extends Person {
    Principal(String name) {
        super(name);
        System.out.println("Principal: " + name);
    }
}

// Main class
public class EducationalHierarchy {
    public static void main(String[] args) {
        new Student("MUKTA");
        new Teacher("PUJA");
        new Principal("SAKSHI");
    }
}
