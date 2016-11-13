package Module3.Third;
import javax.swing.text.html.HTMLDocument;
import java.text.CollationElementIterator;
import java.util.Date;

/**
 * Created by Vladymyr on 12.11.2016.
 */
public class Solution {

    public static void main(String[] args) {

        Course course1 = new Course(new Date(111,2,18),"JavaCORE");
        Course course2 = new Course(new Date(112,3,7),"JS");
        Course course3 = new Course(new Date(110,2,4),"PHP");
        Course course4 = new Course(new Date(114,3,5),"JavaEE");
        Course course5 = new Course(new Date(109,6,17),"C++");
        Course [] coursesTaken ={course1,course2,course3,course4,course5};

        Student student1 = new Student("Vasja","Savka",103);
        Student student2 = new Student("Mov",coursesTaken);
        CollegeStudent collegeStudent1 = new CollegeStudent("MIT",10,10);
        CollegeStudent collegeStudent2 = new CollegeStudent("Vasia","Pupkin",101);
        CollegeStudent collegeStudent3 = new CollegeStudent("Petia",coursesTaken);
        SpecialStudent specialStudent1 = new SpecialStudent(123);
        SpecialStudent specialStudent2 = new SpecialStudent("Ivan","Demkin",102);
        SpecialStudent specialStudent3 = new SpecialStudent("Vova",coursesTaken);






    }
}
