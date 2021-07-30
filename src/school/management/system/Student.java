package school.management.system;


/*
 * This class will keep track of a Student's name, id,  grade,fees paid
 * */

public class Student {
	
	private int id;
	private String studentName;
	private int studentGrade;
	private int feesPaid;
	private int feesTotal;

	
	/*
	 * fees for each student per year= $30,000
	 * fees paid initially is 0
	 * create a  new student object by initialising id, name , grade
	 * */

	Student(int id, String name, int grade){
		this.id=id;
		this.studentName=name;
		this.studentGrade=grade;
		this.feesPaid=0;
		this.feesTotal=30000;	
		
	}
	//not altering student id and student name

	public String getStudentName() {
		return studentName;
	}

	public int getStudentGrade() {
		return studentGrade;
	}


	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}


	public int getFeesPaid() {
		return feesPaid;
	}

	/*
	 * The feesPaid is updated with the total amount of fees paid until now
	 */
	public void updateFeesPaid(int feesPaid) {
		this.feesPaid += feesPaid;
		School.updateTotalMoneyEarned(feesPaid);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentGrade=" + studentGrade + ", feesPaid="
				+ feesPaid + ", feesTotal=" + feesTotal + "]";
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	public int getId() {
		return id;
	}
	
	/*
	 * Remaining fees to be paid
	 * */
	public int remainingFees()
	{
		return  feesTotal-feesPaid;		
	}
}
