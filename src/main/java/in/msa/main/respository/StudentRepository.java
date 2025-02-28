package in.msa.main.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.msa.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
