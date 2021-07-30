package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Teacher Anam= new Teacher(1, "Anam", 5000);
		Teacher Blessing= new Teacher(2, "Blessing", 5000);
		Teacher Cathy= new Teacher(3, "Cathy", 5000);
		List <Teacher> teachersList=new ArrayList<>();
		teachersList.add(Anam);
		teachersList.add(Blessing);
		teachersList.add(Cathy);
		
		Student Ali= new Student(1, "Ali", 1);
		Student Betty= new Student(2, "Betty", 2);
		Student Hope= new Student(3, "Hope", 3);
		
		List <Student> studentsList=new ArrayList<>();
		studentsList.add(Ali);
		studentsList.add(Betty);
		studentsList.add(Hope);
		
		School school=new School(teachersList, studentsList);	
		//System.out.println("Teresian Convent has earned $"+school.getTotalMoneyEarned());
		Ali.updateFeesPaid(5000);
		//System.out.println("Teresian Convent has earned $"+school.getTotalMoneyEarned());
		Betty.updateFeesPaid(6000);
		System.out.println("Teresian Convent has earned $"+school.getTotalMoneyEarned());
		
		/*
		 * Teresian Convent pays the teachers salary
		 * */
		Anam.receiveSalary(Anam.getSalary());
		
		System.out.println("Teresian Convent has paid salary to "+Anam.getName()+" $"+Anam.getSalary() +"and now has $"+School.getTotalMoneyEarned());
		System.out.println(Ali);
		System.out.println(Anam);
		
		Teacher Megan =new Teacher(4, "Megan", 1000);
		school.addTeacher(Megan);

	}
}
