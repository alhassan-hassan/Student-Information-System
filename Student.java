import java.util.LinkedList;

/***
 * The student which carries vital information about a student
 */
public class Student {

    /***\
     * Class instant variables
     */
    private String firstName;
    private String lastName;
    private int ID;
    private String major;
    private String country;
    private double GPA;
    private int year;
    LinkedList<Student> students = new LinkedList<Student>();
    LinkedList<Student> class2021 = new LinkedList<Student>();
    LinkedList<Student> class2022 = new LinkedList<Student>();
    LinkedList<Student> class2023 = new LinkedList<Student>();
    LinkedList<Student> class2024 = new LinkedList<Student>();

    /***
     * Default constructor of the class used to initialize the class
     */
    public Student() {
    }

    /**
     * Loaded constructor of the class used to instantiate the class
     * @param firstName (String)
     * @param lastName (String)
     * @param ID (int)
     * @param yearGroup (int)
     * @param major (String)
     * @param nationality (String)
     * @param currentGPA (double0
     */
    public Student(String firstName, String lastName, int ID, int yearGroup, String major, String nationality, double currentGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.country = nationality;
        this.GPA = currentGPA;
        this.year = yearGroup;
    }

    /**
     * A getter method to access the ID
     * @return ID (int)
     */
    public int getID() {
        return this.ID;
    }

    /**
     * A getter method to access the GPA
     * @return GPA (double)
     */
    public double getGPA() {
        return this.GPA;
    }

    /**
     * A getter method to access the first name
     * @return firstname (String)
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * A getter method to access the fullname
     * @return fullname (Strint)
     */
    public String getFullName(){
        return this.getLastName()+" "+ this.getFirstName();
    }

    /**
     * A getter method to access the last name
     * @return lastname (String)
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * A getter method to access the country
     * @return country(Strint)
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * A getter method to access the major
     * @return major (String)
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * A getter method to access the year group
     * @return year (int)
     */
    public int getYear() {
        return this.year;
    }

    /**
     * A setter method to update the firstname
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * A setter method to update the year
     * @param yearGroup
     */
    public void setYear(int yearGroup){
        this.year = yearGroup;
    }

    /**
     * A setter method to update the lastname
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * A setter method to update the GPA
     * @param GPA
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**
     * A setter method to update the ID
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * A setter method to update the major
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * A setter method to update the country
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * A tostring method to print the full details of a student
     * @return details of students
     */
    @Override
    public String toString() {
        return getLastName() + "\t" + getFirstName() + "\t    ID: " + getID() + "\t   Class: " + getYear()+ "\t   GPA: " + getGPA() + "\t   Major: " + getMajor() + "\t  Nationality: " + getCountry();
    }

    /**
     * This method adds a regitered student to the student list
     * @param student
     * @return the student list
     */
    public  Object registerStudent(Student student) {
        this.students.add(student);
        return this.students;
    }

    /**
     * This method provides the full information about a student
     * @return the credentials of the student
     */
    public String studentDetails(){
        return "" +
                "Student's Name: " + getLastName() + " " + getFirstName() + "\n" +
                "Student's ID: " + getID() + "\n" +
                "Student's Cummulative GPA: "+ getGPA()+"\n"+
                "Student's Major: " + getMajor() + "\n" +
                "Student's Nationality:" + getCountry() + "";
    }

    /**
     * This adds all registered students to a list
     * @return the full list of all registered students
     */
    public StringBuilder allStudentsRegistered() {
        String fullList[] = new String[students.size()];
        StringBuilder allList = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            allList.append(students.get(i).toString()).append("\n");
        }
        return allList;
    }

    /**
     * This reveals students whose GPA are greater than a certain value
     * @param GPA
     * @return the students
     */
    public StringBuilder studentsGPAGreater(double GPA){
        StringBuilder studentsGPAGreater = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() >= GPA){
                studentsGPAGreater.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPAGreater;
    }

    /**
     * This reveals students whose GPA are equal to a certain value
     * @param GPA
     * @return the students
     */
    public StringBuilder studentsGPAEquals(double GPA){
        StringBuilder studentsGPAEquals = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() == GPA){
                studentsGPAEquals.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPAEquals;
    }

    /**
     * This reveals students whose GPA are lower than a certain value
     * @param GPA
     * @return the students
     */
    public StringBuilder studentsGPALower(double GPA){
        StringBuilder studentsGPALower = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() <= GPA){
                studentsGPALower.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPALower;
    }

    /**
     * Reveals students who meet a particular GPA standards
     * @return al qualified students
     */
    public StringBuilder deensList(){
        StringBuilder deenList = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() >= 3.5){
                deenList.append(student.getFullName()).append("\n");
            }
        }
        return deenList;
    }

    /**
     * This search for a student and returns the information him or her
     * @param ID
     * @return the information of the student
     */
    public String studentInfo(int ID){
        for(int i = 0; i < students.size(); i++){
            if (this.students.get(i).getID() != ID){
                continue;
            }
            else
                return students.get(i).studentDetails();
        }
        return "";
    }

    /***
     * This helps edit the details of  student
     * @param lastName
     * @param firstName
     * @param ID
     * @param year
     * @param GPA
     * @param major
     * @param country
     * @return the student
     */
    public String editStudentDetails(String lastName, String firstName, int ID, int year, double GPA, String major, String country){
        for(int i = 0; i < students.size(); i++){
            if (this.students.get(i).getID() != ID){
                continue;
            }
            else{
                this.students.get(i).setFirstName(firstName);
                this.students.get(i).setLastName(lastName);
                this.students.get(i).setID(ID);
                this.students.get(i).setYear(year);
                this.students.get(i).setGPA(GPA);
                this.students.get(i).setMajor(major);
                this.students.get(i).setCountry(country);
                return this.students.get(i).studentDetails();
            }
        }
        return "";
    }

    /**
     * This removes a student from the list
     * @param ID
     */
    public void deleteStudent(int ID){
        for(int i = 0; i < students.size(); i++){
            if (this.students.get(i).getID() != ID){
                continue;
            }
            else{
                System.out.println(this.students.get(i).getFullName()+" with an ID of "+this.students.get(i).getID()+" has been removed from the student system.\n");
                this.students.remove(this.students.get(i));
            }
        }
    }

    /**
     * Groups all junours
     * @return all juniors
     */
    public Object getJuniors(){
        for (Student stu: this.students){
            if (stu.getYear() != 2022)
                continue;
            else {
                this.class2022.add(stu);
            }
        }
        return "JUNIORS\n"+class2022 +"\n"+"\n";
    }

    /**
     * Groups all seniors
     * @return all seniors
     */

    public Object getSeniors(){
        for (Student stu: this.students){
            if (stu.getYear() != 2021)
                continue;
            else {
                this.class2021.add(stu);
            }
        }
        return "SENIORS \n"+class2021 +"\n"+"\n";
    }

    /***
     * Group all sophomores
     * @return all sophomore
     */
    public Object getSophomores(){
        for (Student stu: this.students){
            if (stu.getYear() != 2023)
                continue;
            else {
                this.class2023.add(stu);
            }
        }
        return "SOPHOMORES\n"+class2023 +"\n"+"\n";
    }

    /**
     * Group all freshmen
     * @return all freshmen
     */
    public Object getFreshmen(){
        for (Student stu: this.students){
            if (stu.getYear() != 2024)
                continue;
            else {
                this.class2024.add(stu);
            }
        }
        return "FRESHMEN\n"+class2024 +"\n"+"\n";
    }
}
