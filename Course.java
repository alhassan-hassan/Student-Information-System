
public class Course{
    String coursename=null;
    String coursetutor=null;
    Double creditpoint=0.0;

    public Course(String coursenamep, String coursetutorp, Double creditpointp){
        this.coursename=coursenamep;
        this.coursetutor=coursetutorp;
        this.creditpoint=creditpointp;
    }


    public void setCoursename(String coursenamep){
        this.coursename=coursenamep;
    }
    public void setCoursetutor(String coursetutorp){
        this.coursetutor=coursetutorp;
    }
    public void setCreditpoint(Double creditpointp){
        this.creditpoint=creditpointp;
    }


    public String getCoursename(){
        return this.coursename;
    }
    public String getCoursetutor(){
        return this.coursetutor;
    }
    public double getCreditpoint(){
        return this.creditpoint;
    }

    @Override
    public String toString(){
        return coursename+" by "+ getCoursetutor() ;
    }


    public static Course statseng=new Course("Statistics for Engineers","Elena Rosca", 1.0);
    public static Course physics2=new Course("Physics II","Kofi-Larbi", 1.0);

    public static Course thermod=new Course("Thermodynamics","Kenobi Moris", 1.0);

    public static Course microecons=new Course("Microeconomics","Edgar Cooke",1.0);
    public static Course discrete= new Course("Discrete Mathematics","Ayawoa Dagbovie", 1.0);
    public static Course stats=new Course("Statistics","Rebecca Awuah/Joseph Mensah", 1.0);

    public static Course DSA=new Course("Data Structures and Algorithms", "David Ebo", 1.0);

    public Course[] E_EngineeringCourses={statseng, physics2, thermod};
    public Course[] C_EngineeringCourses={statseng, physics2, DSA};
    public Course[] M_EngineeringCourses={statseng, physics2, thermod};
    public Course[] BACourses={stats, discrete, microecons};
    public Course[] MISCourses={stats, discrete, microecons};
    public Course[] ComputerScienceCourses={stats, discrete, microecons,DSA};
}
