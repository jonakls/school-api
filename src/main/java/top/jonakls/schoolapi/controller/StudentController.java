package top.jonakls.schoolapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.jonakls.schoolapi.model.StudentModel;
import top.jonakls.schoolapi.service.StudentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<StudentModel> getStudents() {
        List<StudentModel> students = this.studentService.getStudents();

        if (students.isEmpty()) {
            throw new RuntimeException("No students found");
        }

        return students;
    }

    @GetMapping(path = "/id/{id}")
    public StudentModel getStudentById(@PathVariable String id) {
        return this.studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public StudentModel addStudent(@RequestBody StudentModel student) {
        return this.studentService.addStudent(student);
    }

    @PutMapping("/update")
    public StudentModel updateStudent(@RequestBody StudentModel student) {
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        this.studentService.deleteStudent(id);
    }

    @GetMapping("/test")
    public StudentModel test() {
        final UUID uuid = UUID.randomUUID();
        final StudentModel student = new StudentModel(uuid.toString());
        student.setName("Jhon Doe");
        student.setEmail("jhon.doe@jhon.doe");
        student.setPhone("1234567890");

        this.studentService.addStudent(student);
        return student;
    }
}
