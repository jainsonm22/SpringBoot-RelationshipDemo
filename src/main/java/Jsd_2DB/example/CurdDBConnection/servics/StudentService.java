package Jsd_2DB.example.CurdDBConnection.servics;

import Jsd_2DB.example.CurdDBConnection.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Jsd_2DB.example.CurdDBConnection.com.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "Student saved successfully";
    }
}
