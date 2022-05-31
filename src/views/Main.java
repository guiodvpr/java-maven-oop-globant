package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Course;
import models.Student;
import models.Teacher;
import models.University;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Guio", 1997));
		students.add(new Student(2, "David", 1998));
		students.add(new Student(3, "Jesus", 2000));
		students.add(new Student(4, "Maria", 2001));
		students.add(new Student(5, "Nicolas", 2002));
		students.add(new Student(6, "Santiago", 2003));
		
		
		ArrayList<Student> studentsPython = new ArrayList<Student>();
		studentsPython.add(students.get(0));
		studentsPython.add(students.get(1));
		
		
		ArrayList<Student> studentsJava = new ArrayList<Student>();
		studentsJava.add(students.get(2));
		studentsJava.add(students.get(3));
		
		ArrayList<Student> studentsCalculus = new ArrayList<Student>();
		studentsCalculus.add(students.get(4));
		studentsCalculus.add(students.get(5));
		
		ArrayList<Student> studentsDesign = new ArrayList<Student>();
		studentsDesign.add(students.get(1));
		studentsDesign.add(students.get(4));
		
		
		
		
		
		ArrayList<Teacher> teachers = new ArrayList();

		Teacher teacher = new Teacher(1, "Elber", true, 5); // Full Time
		Teacher teacher1 = new Teacher(2, "Felipe", false,2,10); // Part Time
		Teacher teacher2 = new Teacher(1, "Carmen", true, 5); // Full Time
		Teacher teacher3 = new Teacher(2, "Oscar", false,3,32); // Part Time
		
		teachers.add(teacher);
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		ArrayList<Course> courses = new ArrayList();
		
		Course courseJava = new Course(1," Java Programming", "C204", studentsJava, teacher);
		Course coursePython = new Course(2,"Python Programming", "C205", studentsPython, teacher1);
		Course courseCalculus = new Course(3,"Calculus Programming", "C206", studentsCalculus, teacher2);
		Course courseDesign= new Course(4,"Design", "C207", studentsDesign, teacher3);
		
		
		courses.add(courseJava);
		courses.add(coursePython);
		courses.add(courseCalculus);
		courses.add(courseDesign);
		
				
		University university = new University(students,teachers,courses);
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("\n Menu: \n"
					+ "a. Print all the professors with its data\r\n"
					+ "b. Print all the classes and a submenu to select a class in order to print the class data including its\r\n"
					+ "teacher and students\r\n"
					+ "c. Create a new student and add it to an existing class\r\n"
					+ "d. Create a new class and add an existing teacher, existing students and its relevant data\r\n"
					+ "e. List all the classes in which a given student is included (hint: search by id)\r\n"
					+ "f. Exit");
		Scanner scanner = new Scanner(System.in);
		
		char option = scanner.nextLine().charAt(0);
		
		switch (option) {
		case 'a':
			System.out.println("Teacher List: ");
			System.out.println( university.getTeacherList().toString());
			break;
			
		case 'b':
			
			System.out.println("Courses List: ");
			University.printCourses(university.getCourseList());
			
			System.out.println("Buscar por ID: ");
			int optionb = scanner.nextInt();
			Course course = university.getCourseById(optionb);
			
			if(course == null)System.out.println("Curso no encontrado");
			else System.out.println(course);
			
						
			
			
			break;
			
		case 'c':
			
			System.out.println("ID: ");
			int id = scanner.nextInt();
			
			System.out.println("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.println("birthDate: ");
			int birth = scanner.nextInt();
			
			Student student = new Student(id, name, birth);
			university.addStudent(student);
			
			System.out.println("Id of the course to register: ");
			int courseId = scanner.nextInt();
			
			university.getCourseById(courseId).addStudent(student);
			
			System.out.println("Student succesfully registered ");
			System.out.println("Student assigned to the course " +university.getCourseById(courseId).getNameCourse() );
			
			
			break;
	
		case 'd':
			
			System.out.println("Id for the new course:");
			int newCourseId= scanner.nextInt();
			
			System.out.println("Name for the new course:");
			scanner.nextLine();
			String newCourseName= scanner.nextLine();
			
			System.out.println("Classroom for the new course:");
			String newClassRoom = scanner.nextLine();
			
			System.out.println("Id of the teacher to assign: ");
			int newTeacherId= scanner.nextInt();
			
			System.out.println("Id of the student to assign: ");
			int newStudentId= scanner.nextInt();
			
			Student studentD = university.getStudentById(newStudentId);
			Teacher teacherD = university.getTeacherById(newTeacherId);
			
			Course courseD = new Course(newCourseId, newCourseName, newClassRoom, new ArrayList() , teacherD);
			courseD.addStudent(studentD);
			
			university.getCourseList().add(courseD);
			
			System.out.println("Course successfully created");
	
	break;
	
		case 'e':
			
			System.out.println("Enter the id for the student :");
			int studentId =  scanner.nextInt();
			
			
			
			System.out.println(university.getCoursesByStudent(studentId));
	
	break;
	
	
		case 'f':
	
				exit = true;
				System.out.println("Good Bye!");
	break;

		default:
			break;
		}
		
		
		}
		
		
		
	}

}
