import java.util.Scanner;

public class AppInterface {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        System.out.println("===================== GTU SEMESTER PLANNER =====================");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Print semester courses");
            System.out.println("2. Print offered semesters");
            System.out.println("3. Exit");
            System.out.print("Enter an option: ");
            String option = sc.nextLine();
            switch(option){
                case "1":{
                    System.out.print("Enter semester code: ");
                    try {
                        int semester = Integer.parseInt(sc.nextLine());
                        if(semester >= 1 && semester <= 8){
                            courseManager.printSemesterCourses(semester);
                        } else {
                            System.out.println("Invalid semester");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                }
                case "2":{
                    // TODO: Implement printing offered semesters
                    break;
                }
                case "3":{
                    System.out.println("Exiting ...");
                    sc.close();
                    return;
                }
                default:{
                    System.out.println("Invalid option.");
                    break;
                }
            }
            System.out.println("\n------------------------------------------------\n");
        }
    }
}
