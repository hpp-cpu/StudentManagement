package StudentManagement.demo.Repository;

import StudentManagement.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
