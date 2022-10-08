import java.util.List;

public class ClassRoom extends Room {

    private List<Course> course;

    public ClassRoom(int roomId, int capacity, List<Course> course){
        this.roomId = roomId;
        this.capacity = capacity;
        this.course = course;
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

    public ClassRoom() {
    }
}
