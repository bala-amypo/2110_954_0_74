// package com.example.demo.service;

// import java.util.List;
// import java.util.Optional;

// import com.example.demo.controller.Student;
// import com.example.demo.entity.Studententity;

// public interface Studentservice{
//     Studententity saveData(Studententity st);
//     Studententity insertStudententity(Studententity newStudent);
//     List<Studententity> getAllStudententity();
//     Optional<Studententity> getOneStudent(Long id);
//     void deleteStudent(Long id);
//     Student insertStudententity(Student st);
// }


package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Student;

public interface StudentService {

    Student insertStudent(Student st);

    List<Student> getAllStudents();

    Optional<Student> getOneStudent(Long id);

    void deleteStudent(Long id);
}