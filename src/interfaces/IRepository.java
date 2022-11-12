package interfaces;

import entities.Student;

import java.util.ArrayList;

public interface IRepository {
    ArrayList<Student> all();
    Boolean create(Student s);
    Boolean update(Student s);
    Boolean delete(Student s);
    Student find(int id);
}
