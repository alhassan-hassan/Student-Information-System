/**
 * A class that entails the courses available to stuudents
 */
public class Course{

    /**
     * Instant variables
     */
    String coursename=null;
    String coursetutor=null;
    Double creditpoint=0.0;

    /**
     * A loaded constructor to instantiate the class
     * @param coursenamep
     * @param coursetutorp
     * @param creditpointp
     */
    public Course(String coursenamep, String coursetutorp, Double creditpointp){
        this.coursename=coursenamep;
        this.coursetutor=coursetutorp;
        this.creditpoint=creditpointp;
    }

    /**
     * A method that updates the course choice
     * @param coursenamep
     */
    public void setCoursename(String coursename){
        this.coursename=coursename;
    }

    /**
     * A method that updates the course's tutor
     * @param coursetutor
     */
    public void setCoursetutor(String coursetutor){
        this.coursetutor=coursetutor;
    }

    /**
     * A method that updates the credit points attached to a course
     * @param creditpointp
     */
    public void setCreditpoint(Double creditpointp){
        this.creditpoint=creditpointp;
    }

    /**
     * A method to access the course name
     * @return coursename
     */
    public String getCoursename(){
        return this.coursename;
    }

    /**
     * A method to access the course tutor
     * @return coursetutor
     */
    public String getCoursetutor(){
        return this.coursetutor;
    }

    /**
     * A method tha accesses the credit points of a course
     * @return the credit
     */
    public double getCreditpoint(){
        return this.creditpoint;
    }

    /**
     * A method to return a course and its tutor
     * @return information about a course
     */
    @Override
    public String toString(){
        return coursename+" by "+ getCoursetutor() ;
    }

    /**
     * Outlining the details of the courses available to the student
     */
    public static Course statseng=new Course("Statistics for Engineers","Elena Rosca", 1.0);
    public static Course physics2=new Course("Physics II","Kofi-Larbi", 1.0);
    public static Course thermod=new Course("Thermodynamics","Kenobi Moris", 1.0);
    public static Course microecons=new Course("Microeconomics","Edgar Cooke",1.0);
    public static Course discrete= new Course("Discrete Mathematics","Ayawoa Dagbovie", 1.0);
    public static Course stats=new Course("Statistics","Rebecca Awuah/Joseph Mensah", 1.0);
    public static Course DSA=new Course("Data Structures and Algorithms", "David Ebo", 1.0);

    /**
     * Classing courses to majors
     */
    public Course[] E_EngineeringCourses={statseng, physics2, thermod};
    public Course[] C_EngineeringCourses={statseng, physics2, DSA};
    public Course[] M_EngineeringCourses={statseng, physics2, thermod};
    public Course[] BACourses={stats, discrete, microecons};
    public Course[] MISCourses={stats, discrete, microecons};
    public Course[] ComputerScienceCourses={stats, discrete, microecons,DSA};
}
