/***
 * Imports
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * A class that enables the enrollment of students
 */
public class Enrolled {
    /**
     * Class instance variables
     */
    private Course courseEnrolled;
    private Student student;
    private ArrayList<String> allStudents = new ArrayList<String>();
    private ArrayList<String> CS_Students = new ArrayList<String>();
    private ArrayList<String> BA_Students = new ArrayList<String>();
    private ArrayList<String> MIS_Students = new ArrayList<String>();
    private ArrayList<String> EEE_Students = new ArrayList<String>();
    private ArrayList<String> ME_Students = new ArrayList<String>();
    private ArrayList<String> CE_Students = new ArrayList<String>();


    /**
     * A loaded constructor to initialize the class
     * @param courseEnrolled
     * @param student
     */
    public Enrolled(Course courseEnrolled, Student student) {
        this.courseEnrolled = courseEnrolled;
        this.student = student;
    }

    /**
     * The default constructor to initialize the class
     */
    public Enrolled(){}

    /**
     * A method to access the couses enrolled
     * @return courses enrolled
     */
    public Course getCourseEnrolled() {
        return this.courseEnrolled;
    }

    /**
     * A method to access all the students enrolled in courses
     * @return the students enrolled in courses
     */
    public ArrayList<String> getAllStudents(){
        return this.allStudents;
    }

    /**
     * A method that returns the list of computer science students
     * @return CS students
     */
    public ArrayList<String> getCS_Students(){
        return this.CS_Students;
    }

    /**
     * A method that returns the list of Business Administration students
     * @return BA students
     */
    public ArrayList<String> getBA_Students(){
        return this.BA_Students;
    }

    /**
     * A method that returns the list of Business Administration students
     * @return BA students
     */
    public ArrayList<String> getMIS_Students(){
        return this.MIS_Students;
    }

    /**
     * A method that returns the list of Electrical and Electronoc Engineering students
     * @return EEE students
     */
    public ArrayList<String> getEEE_Students() {
        return this.EEE_Students;
    }

    /**
     * A method that returns the list of Compuer Engineering students
     * @return CE students
     */
    public ArrayList<String> getCE_Students() {
        return this.CE_Students;
    }

    /**
     * A method that returns the list of Mechanic Engineering students
     * @return BA students
     */
    public ArrayList<String> getME_Students(){
        return this.ME_Students;
    }

    /**
     * A method that updates the courses enrolled
     * @param courseEnrolled
     */
    public void setCourseEnrolled(Course courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    /**
     * A method to return the informatio of  student who enrolls in a course
     * @return information of student who enrolls in a course
     */
    public String enroolInfo(){
        return student.getFullName()+"\t"+ student.getID()+"\t"+ student.getMajor()+"\t"+student.getYear();
    }

    /**
     * A method that adds a student to the right class after enrolling in a course
     * @param student
     * @param courseEnrolled
     */
    public void enroll(Student student,Course courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
        this.student = student;

        if ((courseEnrolled.equals(Course.stats) || courseEnrolled .equals(Course.microecons))  && this.student.getMajor().equals("BA")) {
            getAllStudents().add(this.enroolInfo()+ "\t"+ "Enrolled in: "+this.courseEnrolled+"\t Credit  "+ courseEnrolled.getCreditpoint()+"\n");
            getBA_Students().add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");

        } else if ((courseEnrolled.equals(Course.stats) || courseEnrolled.equals(Course.discrete) ||
                courseEnrolled.equals(Course.microecons)  || courseEnrolled.equals(Course.DSA)) && this.student.getMajor().equals("CS")) {
            this.allStudents.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");
            this.CS_Students.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+"\t"+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");

        } else if ((courseEnrolled.equals(Course.stats)  || courseEnrolled.equals(Course.discrete)||
                courseEnrolled.equals(Course.microecons)) && this.student.getMajor().equals("MIS")) {
            this.allStudents.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");
            this.MIS_Students.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");

        } else if ((courseEnrolled.equals(Course.statseng) ||courseEnrolled.equals(Course.physics2)
                || courseEnrolled.equals(Course.thermod)) && this.student.getMajor().equals("EEE")){
            this.allStudents.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");
            this.EEE_Students.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit "+courseEnrolled.getCreditpoint()+"\n");
        }
        else if ((courseEnrolled.equals(Course.statseng) || courseEnrolled.equals(Course.physics2)
                || courseEnrolled.equals(Course.thermod)) && this.student.getMajor().equals("ME")) {
            this.allStudents.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit "+courseEnrolled.getCreditpoint()+"\n");
            this.ME_Students.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+ this.courseEnrolled+"\t Credit "+courseEnrolled.getCreditpoint()+"\n");
        }

        else if ((courseEnrolled.equals(Course.statseng) || courseEnrolled.equals(Course.DSA)
                ||courseEnrolled.equals(Course.physics2) ) && this.student.getMajor().equals("CE")) {
            this.allStudents.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+"\t"+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");
            this.CE_Students.add(this.enroolInfo()+ "\t"+ "Enrolled in: "+"\t"+ this.courseEnrolled+"\t Credit  "+courseEnrolled.getCreditpoint()+"\n");
        }

        else
            System.out.println("Make sure you enter the name of the course correctly!");
    }

    /**
     * The method returns the all students enrolled in the courses
     * @return all student's information
     */
    public String studentList() {
        String info = "";
        for (int i = 0; i < this.allStudents.size(); i++) {
            info += getAllStudents().get(i)+"\n";
        }
        return info;
    }

    /**
     * Method that returns all the CS students
     * @return information of all students
     */
    public String CSStudents() {
        String info = "";
        for (int i = 0; i < this.CS_Students.size(); i++) {
            info += getCS_Students().get(i)+"\n";
        }
        return info;
    }

    /**
     * A method that returns that returns all MIS students
     * @return all MIS students list
     */
    public String MISStudents() {
        String info = "";
        for (int i = 0; i < this.MIS_Students.size(); i++) {
            info += getMIS_Students().get(i)+"\n";
        }
        return info;
    }

    /**
     * A method that returns all BA students
     * @return all MIS students list
     */
    public String BAStudents() {
        String info = "";
        for (int i = 0; i < this.BA_Students.size(); i++) {
            info += getBA_Students().get(i)+"\n";
        }
        return info;
    }

    /**
     * A method that returns all EEE students
     * @return all EEE students list
     */
    public String EEEStudents() {
        String info = "";
        for (int i = 0; i < this.EEE_Students.size(); i++) {
            info += getEEE_Students().get(i)+"\n";
        }
        return info;
    }

    /**
     * A method that returns all CE students
     * @return all CE students list
     */
    public String CEStudents() {
        String info = "";
        for (int i = 0; i < this.CE_Students.size(); i++) {
            info += getCE_Students().get(i)+"\n";
        }
        return info;
    }

    /**
     * A method that returns all ME students
     * @return all ME students list
     */
    public String MEStudents() {
        String info = "";
        for (int i = 0; i < this.ME_Students.size(); i++) {
            info += getME_Students().get(i)+"\n";
        }
        return info;
    }

    /***
     * A method that returns the list of all students in ascending order
     * @return all students in ascending order
     */
    public String allStudentsAscendingOrder(){
        String alphaBet = "";
        String alphaOrder [] = new String[getAllStudents().size()];
        for (int i = 0; i < this.getAllStudents().size(); i++) {
            alphaOrder[i] = getAllStudents().get(i);
        }
        Arrays.sort(alphaOrder);
        for (int i = 0; i < alphaOrder.length; i++) {
            alphaBet += alphaOrder[i] +"\n";
        }
        return alphaBet;
    }

}
