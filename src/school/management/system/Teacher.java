package school.management.system;
/*
 * This class is responsible for tracking a teacher's details, id, name. salary
 * */
public class Teacher {
	int id;
	String name;
	int salary;
	
	/*
	 * 
	 * creates a new teacher object*/
	public Teacher(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;		
	}
//returns id of the current teacher
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

/*
 * adds to salary
 * deducts from money earned
 * */
	public void receiveSalary(int salary) {
		int salaryEarned=0; 
		salaryEarned+= salary;
		School.updateTotalMoneySpent(salary);
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	}
