public class Course {
    private int courseId;
    private String courseName;
    private String professorName;

    public Course() {
    }

    public Course(int courseId, String courseName, String professorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professorName = professorName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public boolean isThisCourseComputerScienceRelated(){
        if(this.courseName.contains("CS")){
            return true;
        }
        return false;
    }

    public boolean isCourseValid(){
        if(this.courseId == -1){
            return false;
        }
        return true;
    }

    public void makeCourseInValid(){
        this.courseId = -1;
    }



}
