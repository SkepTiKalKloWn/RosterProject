import java.util.Arrays;

public class Student {
	private String studentID;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String studentAge;
	private int[] grades = new int[3];
	
	public Student(String id,String fName,String lName,String email,String age, String g1, String g2, String g3)
	{
		setStudentID(id);
		setFirstName(fName);
		setLastName(lName);
		setEmailAddress(email);
		setStudentAge(age);
		grades[0] = Integer.parseInt(g1);
		grades[1] = Integer.parseInt(g2);
		grades[2] = Integer.parseInt(g3);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public void printStudentID(){
		System.out.println(getStudentID());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void printFirstName(){
		System.out.println(getFirstName());
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void printLastName(){
		System.out.println(getLastName());
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void printEmailAddress(){
		System.out.println(getEmailAddress());
	}
	
	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	
	public void printStudentAge(){
		System.out.println(getStudentAge());
	}
	
	public int[] getStudentGrades() {
		return grades;
	}
	
	public void setStudentGrades(int g1,int g2,int g3){
		grades[0] = g1;
		grades[1] = g1;
		grades[2] = g1;
	}
	
	public void printStudentGrades(){
		System.out.println(Arrays.toString(grades));
	}
	
	public void printStudent(){
		System.out.println(String.format("%-2s\t%-11s\t%-11s\t%-25s\t%-3s\t%-10s", getStudentID(),getFirstName(),getLastName(),getEmailAddress(),getStudentAge(),Arrays.toString(grades)));
	}
	
	public void printAverage() {
		System.out.println(String.format("%-2s\t%-10s\t%-10s\t%-3s%%",getStudentID(),getFirstName(),getLastName(),((grades[0]+grades[1]+grades[2])/3)));
	}
}
