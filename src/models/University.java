package models;

import java.util.ArrayList;
import java.util.Arrays;

public class University {
	private ArrayList<Student> studentList;
	private ArrayList<Teacher> teacherList;
	private ArrayList<Course> courseList;
	
	public University(ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Course> courseList) {
		super();
		this.studentList = studentList;
		this.teacherList = teacherList;
		this.courseList = courseList;
	}

	
	public static void printCourses(ArrayList<Course> courses) {
		for (Course course : courses) {
			System.out.print(course.toStringSimple());
		}
	}
	
	
	public ArrayList<Course> getCoursesByStudent(int id) {
		ArrayList<Course> coursesResult = new ArrayList();
		
		for (Course course : courseList) {
			for (Student student : course.getStudents()) {
				if(student.getId() == id) {
					coursesResult.add(course);
				}
				
			}
		}
		
		return  coursesResult ;
	}
	
	public Course getCourseById(int id) {
		for (Course course : courseList) {
				if(course.getId() == id) {
					return course;
				}
				
			}
		return null;
	}
	
	public Teacher getTeacherById(int id) {
		for (Teacher teacher : teacherList) {
				if(teacher.getId() == id) {
					return teacher;
				}
				
			}
		return null;
	}
	
	public Student getStudentById(int id) {
		for (Student student : studentList) {
				if(student.getId() == id) {
					return student;
				}
				
			}
		return null;
	}
	
	
	
	
	
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(ArrayList<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	
	
	
}
