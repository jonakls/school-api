package top.jonakls.schoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jonakls.schoolapi.model.StudentModel;
import top.jonakls.schoolapi.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<StudentModel> getStudents() {
        return this.repository.findAll();
    }

    public StudentModel getStudentById(String id) {
        return this.repository.findById(id).orElse(null);
    }

    public StudentModel addStudent(StudentModel student) {
        return this.repository.save(student);
    }

    public StudentModel updateStudent(StudentModel student) {
        return this.repository.save(student);
    }

    public void deleteStudent(String id) {
        this.repository.deleteById(id);
    }
}
