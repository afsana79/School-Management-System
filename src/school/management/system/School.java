package school.management.system;
/*
 * School has multiple teachers and students, total money earned and total money spent.
 * Teacher and student objects implemented using ArrayList
 * 
 * Student
 * id
 * name
 * grade
 * fees paid
 * total fees
 * 
 * Teacher
 * id
 * name
 * salary
 * 
 * School
 * Students
 * Teachers
 * total money earned
 * total money spent
 * */

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	//creating a new school object	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
//adds a new teacher to the school 
	public void addTeacher(Teacher teacher) {
		teachers.add( teacher);
	}

	public List<Student> getStudents() {
		return students;
	}
	//adds a new student to the school 

	public void addStudents(Student student) {
		this.students.add( student);
	}
// total money earned by the school
	public static  int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
/*
 * money spent by the school 
 * */
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
		
	}
}
