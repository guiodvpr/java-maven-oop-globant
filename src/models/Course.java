package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	
	private int id;
	private String nameCourse;
	private String classroom;
	private ArrayList<Student> students;
	private Teacher teacher;
	
	
	public Course(int id, String nameCourse, String classroom, ArrayList<Student> students, Teacher teacher) {
		super();
		this.id = id;
		this.nameCourse = nameCourse;
		this.classroom = classroom;
		this.students = students;
		this.teacher = teacher;
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	

	@Override
	public String toString() {
		return "[id=" + id + ", nameCourse=" + nameCourse + ", classroom=" + classroom + ", students=" + Arrays.toString(students.toArray())
				+ ", teacher=" + teacher + "]";
	}
	
	public String toStringSimple(){
		return "[id=" + id + ", nameCourse=" + nameCourse + ", classroom=" + classroom +  "]\n";
	}



	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
		
}
