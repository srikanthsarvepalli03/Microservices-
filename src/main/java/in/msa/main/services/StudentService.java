package in.msa.main.services;

import java.util.List;

import in.msa.main.entities.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStdDetails();
	
	public Student getStdDetails(long id);
	
	public boolean updateStdDetails(long id, float marks);
	
	public boolean deleteStdDetails(long id);
}
