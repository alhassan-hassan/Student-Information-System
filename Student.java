import java.util.LinkedList;

public class Student {

    private String firstName;
    private String lastName;
    private int ID;
    private String major;
    private String country;
    private double GPA;
    private int year;
    LinkedList<Student> students = new LinkedList<Student>();

    public Student() {
    }

    public Student(String firstName, String lastName, int ID, int yearGroup, String major, String nationality, double currentGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.country = nationality;
        this.GPA = currentGPA;
        this.year = yearGroup;
    }

    public int getID() {
        return this.ID;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName(){
        return this.getLastName()+" "+ this.getFirstName();
    }
    public String getLastName() {
        return this.lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getMajor() {
        return this.major;
    }

    public int getYear() {
        return this.year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setYear(int yearGroup){
        this.year = yearGroup;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getLastName() + "\t" + getFirstName() + "\t    ID: " + getID() + "\t   Class: " + getYear()+ "\t   GPA: " + getGPA() + "\t   Major: " + getMajor() + "\t  Nationality: " + getCountry();
    }

    public  Object registerStudent(Student student) {
        this.students.add(student);
        return this.students;
    }

    public String studentDetails(){
        return "" +
                "Student's Name: " + getLastName() + " " + getFirstName() + "\n" +
                "Student's ID: " + getID() + "\n" +
                "Student's Cummulative GPA: "+ getGPA()+"\n"+
                "Student's Major: " + getMajor() + "\n" +
                "Student's Nationality:" + getCountry() + "";
    }

    public StringBuilder allStudentsRegistered() {
        String fullList[] = new String[students.size()];
        StringBuilder allList = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            allList.append(students.get(i).toString()).append("\n");
        }
        return allList;
    }

    public StringBuilder studentsGPAGreater(double GPA){
        StringBuilder studentsGPAGreater = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() >= GPA){
                studentsGPAGreater.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPAGreater;
    }

    public StringBuilder studentsGPAEquals(double GPA){
        StringBuilder studentsGPAEquals = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() == GPA){
                studentsGPAEquals.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPAEquals;
    }

    public StringBuilder studentsGPALower(double GPA){
        StringBuilder studentsGPALower = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() <= GPA){
                studentsGPALower.append(student.getFullName()).append("\n");
            }
        }
        return studentsGPALower;
    }

    public StringBuilder deensList(){
        StringBuilder deenList = new StringBuilder();
        for (Student student: this.students){
            if (student.getGPA() >= 3.5){
                deenList.append(student.getFullName()).append("\n");
            }
        }
        return deenList;
    }

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

    public String editStudentDetails(String lastName, String firstName, int ID, double GPA, String major, String country){
        for(int i = 0; i < students.size(); i++){
            if (this.students.get(i).getID() != ID){
                continue;
            }
            else{
                this.students.get(i).setFirstName(firstName);
                this.students.get(i).setLastName(lastName);
                this.students.get(i).setID(ID);
                this.students.get(i).setGPA(GPA);
                this.students.get(i).setMajor(major);
                this.students.get(i).setCountry(country);
                return this.students.get(i).studentDetails();
            }
        }
        return "";
    }

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
}