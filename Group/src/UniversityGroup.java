import java.util.Scanner;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public void getGroupDescription() {
        System.out.println(groupName);
        System.out.println(startYear);
        System.out.println(endYear);
        printStudents();
    }

    private void printStudents() {
        for (String student : studentArray) {
            System.out.println(student);
        }
    }

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;

    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        endYear = startYear + 5;
    }

    public void addStudents(String[] studentArray) {
        if (this.studentArray == null) {
            this.studentArray = studentArray;
        }
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

}






