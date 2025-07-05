import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Float kredi;
    private Integer AKTS;
    private List<String> prerequisites;
    private Semester offeredSemester;
    private Boolean IsCompulsory;
    public enum Semester {
        FALL, SPRING, BOTH
    }
    public Course(String courseCode, String courseName, Float kredi,Integer akts, Semester offeredSemester,Boolean IsCompulsory, List<String> prerequisites) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.kredi = kredi;
        this.AKTS = akts;
        this.offeredSemester = offeredSemester;
        this.prerequisites = prerequisites;
        this.IsCompulsory = IsCompulsory;
    }
    /* Getters */
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public Float getCredits() { return kredi; }
    public Integer getAKTS() { return AKTS; }
    public Boolean getIsCompulsory() { return IsCompulsory; }
    public Semester getOfferedSemester() { return offeredSemester; }
    public List<String> getPrerequisites() { return prerequisites; }
    @Override
    public String toString() {
        return courseCode + ": " + courseName + " (" + (IsCompulsory ? "Z, " : "S, ") + kredi + " kredi, " + AKTS + " AKTS, Offered in " + offeredSemester + ", prerequests: "+ getPrerequisites().toString() +  ")";
    }
}