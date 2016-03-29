# RosterProject
School project in Java. Creates and tests a class roster.
Scenario:
 
  Create a program that converts the array of Strings shown above to an ArrayList of Student objects. For the Student object class, do the following.
  
1.  Include the following instance variables that describe each student:
•   student ID

•   first name

•   last name

•   e-mail address

•   age

•   array of grades

2.  Include the following methods in the Student class:
  
3.  
a.  an accessor (i.e., getter) for each instance variable from part B1

b.  a mutator (i.e., setter) for each instance variable from part B1
 
Note: All access and change to the instance variables of the Student class should be through accessor and mutator methods.
 
c.  constructor using all of the input parameters

d.  print() to print specific student data (e.g., student ID, first name, last name) using accessors (i.e., getters)
 
Note: Printing out the grades is optional, not required.
 
  Create a student Roster class with the following methods that contain all ArrayList method calls:
  
a.  public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3) that sets the instance variables from part B1 and updates the roster

b.  public static void remove(String studentID) that removes students from the roster by student ID
 
Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
 
c.  public static void print_all() that prints a complete tab-separated list of student data using accessor methods
 
Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}. The print_all() method should loop through all the students in the student array list and call the print() method for each student.
 
d.  public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID

e.  public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user
 
Note: A valid e-mail should include an at sign (“@”) and period (“.”) and doesn’t include a space.
 
C.  Demonstrate the program’s required functionality by running the following scenario:
print_all();
print_invalid_emails();
//loop through the ArrayList and for each element:
print_average_grade(current_loop_student);
remove("3");
   remove("3");
//expected: this should print a message saying such a student with this ID was not found.
