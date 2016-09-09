package com.niitimpl;

import java.util.ArrayList;
import java.util.List;

import com.niitDao.StudentDao;
import com.niitcontroller.Student;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   public void deleteStudent1(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //Retrieve list of students from the database
   public List<Student> getAllStudents() {
      return students;
   }

   public Student getStudent1(int rollNo) {
      return students.get(rollNo);
   }

   public void updateStudent1(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
public Student getStudent(int rollNo) {
	// TODO Auto-generated method stub
	return null;
}
public void updateStudent(Student student) {
	// TODO Auto-generated method stub
	
}
public void deleteStudent(Student student) {
	// TODO Auto-generated method stub
	
}
}