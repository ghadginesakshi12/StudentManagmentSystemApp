package edu.cjc.smsapp.app.serviceimpl;

import java.util.List;

import edu.cjc.smsapp.app.model.Student;

public interface StudentService {

	public void saveStudent(Student s);
	public List<Student> getAllStudents();
	public List<Student> searchBatch(String batchNumber);
	public Student getSingleStudent(int id);
	public void updateStudentfees(int studentId, double ammount);
	public void removeStudent(int studentId);
	public void updateStudentBatch(int studentId, String batchNumber);

}
