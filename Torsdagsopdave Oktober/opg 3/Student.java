import java.util.ArrayList;

public class Student extends Person {
    private final ArrayList<String> passedCourses;
    private final ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (!passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        System.out.println(getName() + " har allerede bestået dette kursus.");
        return false;
    }
}
