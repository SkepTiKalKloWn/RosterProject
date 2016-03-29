import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
public class Roster {
	
	private static ArrayList<Student> classRoster = new ArrayList<Student>();

	public Roster (String [] cRoster){
		for(int i=0;i<cRoster.length;i++){
			ArrayList<String> nStudentInfo= new ArrayList<String>(Arrays.asList(cRoster[i].split(",")));
			String studentID = nStudentInfo.get(0);
			String firstName = nStudentInfo.get(1);
			String lastName = nStudentInfo.get(2);
			String emailAddress = nStudentInfo.get(3);
			String studentAge = nStudentInfo.get(4);
			String grade1 = nStudentInfo.get(5);
			String grade2 = nStudentInfo.get(6);
			String grade3 = nStudentInfo.get(7);
			Student nStudent = new Student(studentID,firstName,lastName,emailAddress,studentAge,grade1,grade2,grade3);
			classRoster.add(nStudent);
		}
	}
	public static void add(String studentID, String firstname, String lastname, String emailaddress, String age, String grade1, String grade2, String grade3){
		Student nStudent = new Student(studentID,firstname,lastname,emailaddress,age,grade1,grade2,grade3);
		classRoster.add(nStudent);
	}
	
	public static void removeStudent(String studentID){
		Boolean found = false;
			for(int i = 0;i<classRoster.size();i++){
				if (classRoster.get(i).getStudentID().equals(studentID)){
					classRoster.remove(i);
					found = true;
					System.out.println("Student record removed");
				}
				if (i==(classRoster.size()-1)&&found==false){
					System.out.println("Student not found");
			}	
		}
	}
	public static void printAll(){
		System.out.println(String.format("%-2s\t%-11s\t%-11s\t%-25s\t%-3s\t%-10s", "ID","First Name","Last Name","Email Address","Age","Grades"));
		for(int i = 0;i<classRoster.size();i++){
			classRoster.get(i).printStudent();
			}
	}
	public static void printAverageGrades(){
		System.out.println(String.format("%-2s\t%-11s\t%-11s\t%-3s","ID","First Name","Last Name","Average Grades"));
		for(int i = 0;i<classRoster.size();i++){
			classRoster.get(i).printAverage();
		}
	}
	public static void printInvalidEmails(){
		Boolean found = false;
		System.out.println("Searching for incorrect Emails: ");
		for(int i = 0;i<classRoster.size();i++){
			
			if (!Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",classRoster.get(i).getEmailAddress())){
				classRoster.get(i).printEmailAddress();
				found = true;
			}
			if (i==(classRoster.size()-1)&&found==false){
				System.out.println("All Emails are correct");
			}
		}
	}
}
