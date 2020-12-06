
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test{
    public static void main(String[] args) throws FileNotFoundException {

        Student allStduents = new Student();

        Enrolled enrollStudent = new Enrolled();

        Student newS1 = new Student("Hassan","Alhassan",50622023,2023,"CS","Ghana",4.0);
        Student newS2 = new Student("Sadia","Alhassan",50642023,2022,"MIS","Ghana",3.0);
        Student newS3 = new Student("Mumin","Alhassan",50612023,2024,"CS","Ghana",3.0);
        Student newS4 = new Student("Jalil","Alhassan",50662023,2020,"EEE","Ghana",3.6);
        Student newS5 = new Student("Bintu","Alhassan",50622023,2021,"ME","Ghana",4.0);
        Student newS6 = new Student("Hadijah","Alhassan",50602023,2024,"CE","Ghana",3.50);
        Student newS7 = new Student("Maliba","Alhassan",50672023,2020,"BA","Ghana",4.0);
        Student newS8 = new Student("Yussif","Alhassan",50682023,2021,"EEE","Ghana",4.0);
        Student newS9 = new Student("Husein","Alhassan",50692023,2023,"CS","Ghana",4.0);

        allStduents.registerStudent(newS1);
        allStduents.registerStudent(newS2);
        allStduents.registerStudent(newS3);
        allStduents.registerStudent(newS4);
        allStduents.registerStudent(newS5);
        allStduents.registerStudent(newS6);
        allStduents.registerStudent(newS7);
        allStduents.registerStudent(newS8);
        allStduents.registerStudent(newS9);

        System.out.println(allStduents.allStudentsRegistered() );
        System.out.println(allStduents.deensList());
        System.out.println(allStduents.studentInfo(50642023));
        System.out.println(allStduents.eleteStudent(50692023));

        enrollStudent.enroll(newS1,Course.discrete);
        enrollStudent.enroll(newS2,Course.stats);
        enrollStudent.enroll(newS3,Course.DSA);
        enrollStudent.enroll(newS4,Course.physics2);
        enrollStudent.enroll(newS5,Course.statseng);
        enrollStudent.enroll(newS6,Course.DSA);
        enrollStudent.enroll(newS7,Course.microecons);
        enrollStudent.enroll(newS8,Course.thermod);
        enrollStudent.enroll(newS9,Course.microecons);

        System.out.println(enrollStudent.BAStudents());

    }
}
import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;
        import javax.swing.JTextArea;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {

        Student allStduents = new Student();

        Enrolled enrollStudent = new Enrolled();

        Student newS1 = new Student("Hassan","Alhassan",50622023,2024,"CS","Ghana",4.0);
        Student newS2 = new Student("Sadia","Alhassan",50642023,2022,"MIS","Ghana",3.0);
        Student newS3 = new Student("Mumin","Alhassan",50612023,2024,"CS","Ghana",3.0);
        Student newS4 = new Student("Jalil","Alhassan",50662023,2020,"EEE","Ghana",3.6);
        Student newS5 = new Student("Bintu","Alhassan",50622023,2021,"ME","Ghana",4.0);
        Student newS6 = new Student("Hadijah","Alhassan",50602023,2024,"CE","Ghana",3.50);
        Student newS7 = new Student("Maliba","Alhassan",50672023,2020,"BA","Ghana",4.0);
        Student newS8 = new Student("Yussif","Alhassan",50682023,2021,"EEE","Ghana",4.0);
        Student newS9 = new Student("Husein","Alhassan",50692023,2023,"CS","Ghana",4.0);

        allStduents.registerStudent(newS1);
        allStduents.registerStudent(newS2);
        allStduents.registerStudent(newS3);
        allStduents.registerStudent(newS4);
        allStduents.registerStudent(newS5);
        allStduents.registerStudent(newS6);
        allStduents.registerStudent(newS7);
        allStduents.registerStudent(newS8);
        allStduents.registerStudent(newS9);

        YearGroup group = new YearGroup();
        group.root = new YearGroup.Node("");

        group.root.left = new YearGroup.Node("");
        group.root.left.left = new YearGroup.Node(allStduents.getSeniors());
        group.root.left.right = new YearGroup.Node(allStduents.getJuniors());

        group.root.right = new YearGroup.Node("");
        group.root.right.left = new YearGroup.Node(allStduents.getSophomores());
        group.root.right.right = new YearGroup.Node(allStduents.getFreshmen());
        group.PrintLeafLeftToRight(group.root);

//        enrollStudent.enroll(newS1,Course.discrete);
//        enrollStudent.enroll(newS2,Course.stats);
//        enrollStudent.enroll(newS3,Course.DSA);
//        enrollStudent.enroll(newS4,Course.physics2);
//        enrollStudent.enroll(newS5,Course.statseng);
//        enrollStudent.enroll(newS6,Course.DSA);
//        enrollStudent.enroll(newS7,Course.microecons);
//        enrollStudent.enroll(newS8,Course.thermod);
//        enrollStudent.enroll(newS9,Course.microecons);
//
//        System.out.println(enrollStudent.BAStudents());

    }
}




