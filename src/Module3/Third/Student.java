package Module3.Third;
import java.util.Arrays;
import java.util.Date;
/**
 * Created by Vladymyr on 12.11.2016.
 */
public class Student {
   private String firstName;
   private String lastName;
   private int group;

   // Course course1 = new Course(new Date("17.10.2016"),"Java Core");
   // Course course2 = new Course(new Date("02.02.2016"),"JavaScript");
    private Course[] coursesTaken ;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstName, String lastName, int group){

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
     public Student(String lastName,Course... coursesTaken){

        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }
     public  Student(){

    }
}
