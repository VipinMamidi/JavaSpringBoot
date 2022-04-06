package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void  addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudent(Long studentId) {
        boolean exists  = studentRepository.existsById(studentId);
        if(!exists){
            throw  new IllegalStateException(
                    "student with id "  + studentId + " Does not exists."
            );
        }
        studentRepository.deleteById(studentId);

    }

    @Transactional
    public void editStudent(Long studentId, String studentName) {
        boolean exists  = studentRepository.existsById(studentId);
        if(!exists){
            throw  new IllegalStateException(
                    "student with id "  + studentId + " Does not exists."
            );
        }
        Student std = studentRepository.getById(studentId);
        std.setName(studentName);
        studentRepository.save(std);
    }
}
