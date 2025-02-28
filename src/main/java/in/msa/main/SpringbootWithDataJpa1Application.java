package in.msa.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.msa.main.entities.Student;
import in.msa.main.services.StudentService;
import in.msa.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringbootWithDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootWithDataJpa1Application.class, args);
		
		StudentService stdService =  context.getBean(StudentServiceImpl.class);
		
		
		//	******* Insert Operation ********	
		Student std = new Student();
		std.setName("Wasim");
		std.setRollno(20);
		std.setMarks(91.0f);
		boolean status =  stdService.addStudentDetails(std);
		if(status) {
			System.out.println("Student data Inserted successfully!");
		}else {
			System.out.println("Nhi hua bhai!");
		}
		
		// ********* Select Operation 1 *********
		List<Student> stdList = stdService.getAllStdDetails();
		for(Student std : stdList)
		{
			System.out.println("Id : "+std.getId());
			System.out.println("Nmae : "+std.getName());
			System.out.println("Rollno : "+std.getRollno());
			System.out.println("Marks : "+std.getMarks());
			
			System.out.println("-------------");
		}
		
		
		//  ********* Select Operation 2	*********
		Student std = stdService.getStdDetails(3L);
		if(std != null) {
			System.out.println("Id : "+std.getId());
			System.out.println("Nmae : "+std.getName());
			System.out.println("Rollno : "+std.getRollno());
			System.out.println("Marks : "+std.getMarks());
		}else {
			System.out.println("Student not found");
		}
		
		//	********* Update Operation *********
		boolean status = stdService.updateStdDetails(1L, 95.2f);
		if(status) {
			System.out.println("Update successfully");
		}
		else {
			System.out.println("Not updated");
		}
		
		//	******** Delete Operation ********
		boolean status = stdService.deleteStdDetails(2L);
		if(status) {
			System.out.println("Deleted successfully");
		}
		else {
			System.out.println("Not deleted");
		}
	}
}
