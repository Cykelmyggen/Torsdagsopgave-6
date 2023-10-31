import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentPassedCourses = new ArrayList<>();
        studentPassedCourses.add("Math");
        ArrayList<String> teacherCanTeach = new ArrayList<>();
        teacherCanTeach.add("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Alice", studentPassedCourses));
        persons.add(new Teacher("Bob", teacherCanTeach));

        String courseToAdd = "Java 1.0";

        for (Person person : persons) {
            boolean added = person.addCourse(courseToAdd);
            if (!added && person instanceof Student) {
                System.out.println(person.getName() + " har allerede bestået dette kursus.");
            } else if (!added && person instanceof Teacher) {
                System.out.println(person.getName() + " kan ikke undervise i dette fag.");
            }
        }
    }
}
