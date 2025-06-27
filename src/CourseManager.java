import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
/*
* GTU CSE course package.
* Checks needed : The correctness of the current data.
* TO-DO : add all elective courses.
* */
public class CourseManager {
    private Course.Semester semester;
    private final List<Course> semesterOneCourses;
    private final List<Course> semesterTwoCourses;
    private final List<Course> semesterThreeCourses;
    private final List<Course> semesterFourCourses;
    private final List<Course> semesterFiveCourses;
    private final List<Course> semesterSixCourses;
    private final List<Course> semesterSevenCourses;
    private final List<Course> semesterEightCourses;

    private final Map<String, Course> courseMap = new HashMap<>();

    //Semester one courses
    private final Course CSE101 = new Course("CSE101", "Introduction to Computer Engineering and Career Planning", 3.5F, 8, Course.Semester.FALL, true, null);
    private final Course CSE107 = new Course("CSE107", "Introduction to Computer Science Laboratory", 1.0F, 2, Course.Semester.FALL, true, null);
    private final Course ENG151 = new Course("ENG151", "Science and Technology", 2.0F, 2, Course.Semester.FALL, true, null);
    private final Course MATH101 = new Course("MATH101", "Calculus I", 5.0F, 7, Course.Semester.FALL, true, null);
    private final Course PHYS121 = new Course("PHYS121", "Physics I", 4.0F, 6, Course.Semester.FALL, true, null);
    private final Course PHYS151 = new Course("PHYS151", "Physics Laboratory I", 1.0F, 1, Course.Semester.FALL, true, null);
    private final Course HIS101 = new Course("HIS101", "Principles of Atatürk and the History of Turkish Revolution I", 2.0F, 2, Course.Semester.FALL, true, null);
    private final Course TUR101 = new Course("TUR101", "Turkish I", 2.0F, 2, Course.Semester.FALL, true, null);
    //Semester two courses
    private final Course CSE102 = new Course("CSE102", "Computer Programming", 4.5F, 8, Course.Semester.BOTH, true, null);
    private final Course CSE108 = new Course("CSE108", "Computer Programming Laboratory", 1.0F, 2, Course.Semester.SPRING, true, null);
    private final Course ENG152 = new Course("ENG152", "Culture of Science and Computation", 2.0F, 2, Course.Semester.SPRING, true, null);
    private final Course MATH102 = new Course("MATH102", "Calculus II", 5.0F, 7, Course.Semester.SPRING, true, List.of("MATH101"));
    private final Course PHYS122 = new Course("PHYS122", "Physics II", 4.0F, 6, Course.Semester.SPRING, true, null);
    private final Course PHYS152 = new Course("PHYS152", "Physics Laboratory II", 1.0F, 1, Course.Semester.SPRING, true, null);
    private final Course HIS102 = new Course("HIS102", "Principles Of Atatürk And The History Of Turkish Revolution II", 2.0F, 2, Course.Semester.SPRING, true, null);
    private final Course TUR102 = new Course("TUR102", "Turkish II", 2.0F, 2, Course.Semester.SPRING, true, null);
    //Semester three courses
    private final Course CSE211 = new Course("CSE211", "Discrete Mathematics", 3.0F, 6, Course.Semester.FALL, true, null);
    private final Course CSE231 = new Course("CSE231", "Circuits And Electronics", 4.0F, 8, Course.Semester.FALL, true, null);
    private final Course CSE233 = new Course("CSE233", "Circuits And Electronics Laboratory", 1.0F, 2, Course.Semester.FALL, true, null);
    private final Course CSE241 = new Course("CSE241", "Object Oriented Programming", 5.0F, 9, Course.Semester.BOTH, true, List.of("CSE102"));
    private final Course ENGL111 = new Course("ENGL111", "Business English", 2.0F, 2, Course.Semester.FALL, true, null);
    private final Course NonTElec3 = new Course("NonTElec3", "Nontechnical Elective I", 2.0F, 3, Course.Semester.FALL, false, null);
    //Semester four courses
    private final Course CSE222 = new Course("CSE222", "Data Structures and Algorithms", 5.0F, 9, Course.Semester.SPRING, true, List.of("CSE241"));
    private final Course CSE232 = new Course("CSE232", "Logic Circuits And Design", 3.0F, 6, Course.Semester.SPRING, true, null);
    private final Course CSE234 = new Course("CSE234", "Logic Circuits And Design Laboratory", 1.0F, 2, Course.Semester.SPRING, true, null);
    private final Course MATH217 = new Course("MATH217", "Linear Algebra and Differantial Equations", 5.0F, 8, Course.Semester.SPRING, true, null);
    private final Course ENGL112 = new Course("ENGL112", "Academic English", 2.0F, 2, Course.Semester.SPRING, true, null);
    private final Course NonTElec4 = new Course("NonTElec4", "Nontechnical Elective II", 2.0F, 3, Course.Semester.SPRING, false, null);
    //Semester five courses
    private final Course CSE321 = new Course("CSE321", "Introduction to Algorithm Design", 3.0F, 6, Course.Semester.FALL, true, List.of("CSE222","CSE211"));
    private final Course CSE331 = new Course("CSE331", "Computer Organization", 4.0F, 7, Course.Semester.FALL, true, List.of("CSE232"));
    private final Course CSE341 = new Course("CSE341", "Programming Languages", 3.0F, 6, Course.Semester.FALL, true, List.of("CSE102"));
    private final Course CSE343 = new Course("CSE343", "Software Engineering", 4.0F, 8, Course.Semester.FALL, true, List.of("CSE241"));
    private final Course ENG300 = new Course("ENG300", "Summer Practice I", 0.5F, 1, Course.Semester.FALL, true, null);
    private final Course NonTElec5 = new Course("NonTElec5", "Nontechnical Elective III", 2.0F, 3, Course.Semester.FALL, false, null);
    //Semester six courses
    private final Course CSE312 = new Course("CSE312", "Operating Systems", 3.0F, 6, Course.Semester.SPRING, true, List.of("CSE102","CSE331"));
    private final Course CSE344 = new Course("CSE344", "Systems Programming", 2.0F, 3, Course.Semester.SPRING, true, List.of("CSE102"));
    private final Course CSE351 = new Course("CSE351", "Signals and Systems", 3.0F, 6, Course.Semester.SPRING, true, List.of("MATH217"));
    private final Course CSE396 = new Course("CSE396", "Computer Engineering Project", 2.0F, 5, Course.Semester.SPRING, true, List.of("CSE343"));
    private final Course MATH118 = new Course("MATH118", "Probability and Statistics", 3.0F, 6, Course.Semester.SPRING, true, null);
    private final Course NonTElec6 = new Course("NonTElec6", "Nontechnical Elective IV", 2.0F, 3, Course.Semester.SPRING, false, null);
    private final Course FElec6 = new Course("FElec6", "Free Elective", 2.0F, 3, Course.Semester.SPRING, false, null);
    //Semester seven courses
    private final Course CSE495 = new Course("CSE495", "Graduation Project I", 1.0F, 6, Course.Semester.FALL, true, null);
    private final Course ENG400 = new Course("ENG400", "Summer Practice II", 0.5F, 1, Course.Semester.FALL, true, null);
    private final Course ENG401 = new Course("ENG401", "Occupational Health and Safety I", 1.0F, 1, Course.Semester.FALL, true, null);
    private final Course DElec7 = new Course("DElec7", "Departmental Elective I", 3.0F, 6, Course.Semester.FALL, false, null);
    private final Course NonTElec7 = new Course("NonTElec7", "Nontechnical Elective V", 2.0F, 3, Course.Semester.FALL, false, null);
    //Semester eight courses
    private final Course CSE496 = new Course("CSE496", "Graduation Project II", 1.0F, 6, Course.Semester.SPRING, true, null);
    private final Course ENG402 = new Course("ENG402", "Occupational Health and Safety II", 1.0F, 1, Course.Semester.SPRING, true, null);
    private final Course DElec8 = new Course("DElec8", "Departmental Elective II", 3.0F, 6, Course.Semester.SPRING, false, null);
    private final Course NonTElec8 = new Course("NonTElec8", "Nontechnical Elective", 2.0F, 3, Course.Semester.SPRING, false, null);


    public CourseManager() {
        semesterOneCourses = new ArrayList<>();
        semesterTwoCourses = new ArrayList<>();
        semesterThreeCourses = new ArrayList<>();
        semesterFourCourses = new ArrayList<>();
        semesterFiveCourses = new ArrayList<>();
        semesterSixCourses = new ArrayList<>();
        semesterSevenCourses = new ArrayList<>();
        semesterEightCourses = new ArrayList<>();

        // Semester 1
        semesterOneCourses.add(CSE101); courseMap.put(CSE101.getCourseCode(), CSE101);
        semesterOneCourses.add(CSE107); courseMap.put(CSE107.getCourseCode(), CSE107);
        semesterOneCourses.add(ENG151); courseMap.put(ENG151.getCourseCode(), ENG151);
        semesterOneCourses.add(MATH101); courseMap.put(MATH101.getCourseCode(), MATH101);
        semesterOneCourses.add(PHYS121); courseMap.put(PHYS121.getCourseCode(), PHYS121);
        semesterOneCourses.add(PHYS151); courseMap.put(PHYS151.getCourseCode(), PHYS151);
        semesterOneCourses.add(HIS101); courseMap.put(HIS101.getCourseCode(), HIS101);
        semesterOneCourses.add(TUR101); courseMap.put(TUR101.getCourseCode(), TUR101);

        // Semester 2
        semesterTwoCourses.add(CSE102); courseMap.put(CSE102.getCourseCode(), CSE102);
        semesterTwoCourses.add(CSE108); courseMap.put(CSE108.getCourseCode(), CSE108);
        semesterTwoCourses.add(ENG152); courseMap.put(ENG152.getCourseCode(), ENG152);
        semesterTwoCourses.add(MATH102); courseMap.put(MATH102.getCourseCode(), MATH102);
        semesterTwoCourses.add(PHYS122); courseMap.put(PHYS122.getCourseCode(), PHYS122);
        semesterTwoCourses.add(PHYS152); courseMap.put(PHYS152.getCourseCode(), PHYS152);
        semesterTwoCourses.add(HIS102); courseMap.put(HIS102.getCourseCode(), HIS102);
        semesterTwoCourses.add(TUR102); courseMap.put(TUR102.getCourseCode(), TUR102);

        // Semester 3
        semesterThreeCourses.add(CSE211); courseMap.put(CSE211.getCourseCode(), CSE211);
        semesterThreeCourses.add(CSE231); courseMap.put(CSE231.getCourseCode(), CSE231);
        semesterThreeCourses.add(CSE233); courseMap.put(CSE233.getCourseCode(), CSE233);
        semesterThreeCourses.add(CSE241); courseMap.put(CSE241.getCourseCode(), CSE241);
        semesterThreeCourses.add(ENGL111); courseMap.put(ENGL111.getCourseCode(), ENGL111);
        semesterThreeCourses.add(NonTElec3); courseMap.put(NonTElec3.getCourseCode(), NonTElec3);

        // Semester 4
        semesterFourCourses.add(CSE222); courseMap.put(CSE222.getCourseCode(), CSE222);
        semesterFourCourses.add(CSE232); courseMap.put(CSE232.getCourseCode(), CSE232);
        semesterFourCourses.add(CSE234); courseMap.put(CSE234.getCourseCode(), CSE234);
        semesterFourCourses.add(MATH217); courseMap.put(MATH217.getCourseCode(), MATH217);
        semesterFourCourses.add(ENGL112); courseMap.put(ENGL112.getCourseCode(), ENGL112);
        semesterFourCourses.add(NonTElec4); courseMap.put(NonTElec4.getCourseCode(), NonTElec4);

        // Semester 5
        semesterFiveCourses.add(CSE321); courseMap.put(CSE321.getCourseCode(), CSE321);
        semesterFiveCourses.add(CSE331); courseMap.put(CSE331.getCourseCode(), CSE331);
        semesterFiveCourses.add(CSE341); courseMap.put(CSE341.getCourseCode(), CSE341);
        semesterFiveCourses.add(CSE343); courseMap.put(CSE343.getCourseCode(), CSE343);
        semesterFiveCourses.add(ENG300); courseMap.put(ENG300.getCourseCode(), ENG300);
        semesterFiveCourses.add(NonTElec5); courseMap.put(NonTElec5.getCourseCode(), NonTElec5);

        // Semester 6
        semesterSixCourses.add(CSE312); courseMap.put(CSE312.getCourseCode(), CSE312);
        semesterSixCourses.add(CSE344); courseMap.put(CSE344.getCourseCode(), CSE344);
        semesterSixCourses.add(CSE351); courseMap.put(CSE351.getCourseCode(), CSE351);
        semesterSixCourses.add(CSE396); courseMap.put(CSE396.getCourseCode(), CSE396);
        semesterSixCourses.add(MATH118); courseMap.put(MATH118.getCourseCode(), MATH118);
        semesterSixCourses.add(NonTElec6); courseMap.put(NonTElec6.getCourseCode(), NonTElec6);
        semesterSixCourses.add(FElec6); courseMap.put(FElec6.getCourseCode(), FElec6);

        // Semester 7
        semesterSevenCourses.add(CSE495); courseMap.put(CSE495.getCourseCode(), CSE495);
        semesterSevenCourses.add(ENG400); courseMap.put(ENG400.getCourseCode(), ENG400);
        semesterSevenCourses.add(ENG401); courseMap.put(ENG401.getCourseCode(), ENG401);
        semesterSevenCourses.add(DElec7); courseMap.put(DElec7.getCourseCode(), DElec7);
        semesterSevenCourses.add(NonTElec7); courseMap.put(NonTElec7.getCourseCode(), NonTElec7);

        // Semester 8
        semesterEightCourses.add(CSE496); courseMap.put(CSE496.getCourseCode(), CSE496);
        semesterEightCourses.add(ENG402); courseMap.put(ENG402.getCourseCode(), ENG402);
        semesterEightCourses.add(DElec8); courseMap.put(DElec8.getCourseCode(), DElec8);
        semesterEightCourses.add(NonTElec8); courseMap.put(NonTElec8.getCourseCode(), NonTElec8);
    }
    public Course getCourseByCode(String code) {
        return courseMap.get(code);
    }
    public void printCourseByCode(String code) {
        Course course = courseMap.get(code);
        if (course != null)
            System.out.println(course);
        else
            System.out.println("Course not found: " + code);
    }
    public void printSemesterCourses(int semester) {
        if (semester < 1 || semester > 8)
            throw new IllegalArgumentException("Semester must be between 1 and 8");

        List<Course> selectedCourses = switch (semester) {
            case 1 -> semesterOneCourses;
            case 2 -> semesterTwoCourses;
            case 3 -> semesterThreeCourses;
            case 4 -> semesterFourCourses;
            case 5 -> semesterFiveCourses;
            case 6 -> semesterSixCourses;
            case 7 -> semesterSevenCourses;
            case 8 -> semesterEightCourses;
            default -> new ArrayList<>();
        };
        for (Course c : selectedCourses) {
            System.out.println(c);
        }
    }
    public void printAllCourses(){
        for(int i = 1; i <= 8; ++i)
            printSemesterCourses(i);
    }
}
