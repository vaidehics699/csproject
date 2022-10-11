import java.util.ArrayList;
import java.util.List;

public class ClassRoom extends Room {

    private List<Course> course;

    public ClassRoom(int roomId, int capacity, List<Course> course){
        this.roomId = roomId;
        this.capacity = capacity;
        this.course = course;
    }

    public ClassRoom(int roomId, int capacity, List<Course> course, int doors){
        this.roomId = roomId;
        this.capacity = capacity;
        this.course = course;
        this.noOfDoors = doors;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "course=" + course +
                ", capacity=" + capacity +
                ", roomId=" + roomId +
                '}';
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }


    public Course searchCourse(String name){
        for(Course course1 : course){
            if(course1.getCourseName().equals(name)){
                return course1;
            }
        }
        return null;
    }


    public int totalNumberOfCourses(){
        return course.size();
    }

    public List<Course> getAllComputerScienceCourses(){
        List<Course> courses = new ArrayList<>();
        for(Course course1 : course){
            if(course1.getCourseName().contains("CS")){
                courses.add(course1);
            }
        }
        return courses;
    }

    public void removeCourse(int courseId){
        List<Course> courseList = new ArrayList<>();
        for(Course course1 : course){
            if(course1.getCourseId() != courseId){
               courseList.add(course1);
            }
        }
        this.course = courseList;
    }


    public ClassRoom() {
    }
}
