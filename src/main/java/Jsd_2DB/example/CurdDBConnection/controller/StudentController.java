package Jsd_2DB.example.CurdDBConnection.controller;
import Jsd_2DB.example.CurdDBConnection.entity.Student;
import Jsd_2DB.example.CurdDBConnection.servics.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save-student")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        String result = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}
