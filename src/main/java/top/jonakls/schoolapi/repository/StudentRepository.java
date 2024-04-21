package top.jonakls.schoolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.jonakls.schoolapi.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, String> {
}
