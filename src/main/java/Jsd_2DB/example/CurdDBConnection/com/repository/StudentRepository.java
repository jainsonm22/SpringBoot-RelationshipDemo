package Jsd_2DB.example.CurdDBConnection.com.repository;

import Jsd_2DB.example.CurdDBConnection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

