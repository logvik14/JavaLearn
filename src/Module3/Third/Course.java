package Module3.Third;
import java.util.Date;
/**
 * Created by Vladymyr on 12.11.2016.
 */
public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private String teacherName;


   public Course(Date startDate, String name) {

         this.startDate = startDate;
         this.name = name;

     }

     public Course(int hoursDuration,String name,String teacherName){

        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

}