import java.util.Date;

class Student {

    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }
}


 class Instructor {

    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
}
 class Course {

    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title,
                  String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getId() {
        return id;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public String getTitle() {
        return title;
    }

    public String getCredits() {
        return credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }
}


 class CourseOffering {

    private Student student;
    private Instructor instructor;
    private Course course;

    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(Student student,
                           Instructor instructor,
                           Course course,
                           Date time,
                           int sectionNo,
                           int roomId,
                           int year,
                           String semester) {

        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Course getCourse() {
        return course;
    }
}
public class page113 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", "Computer Science");
        Instructor i1 = new Instructor(10, "Dr. Smith", "CSE", "Professor");
        Course c1 = new Course(100, "OOP, Java", "OOP", "3", "None");

        CourseOffering offering = new CourseOffering(
                s1,
                i1,
                c1,
                new Date(),
                1,
                205,
                2026,
                "SP"
        );

        System.out.println("Student: " + offering.getStudent().getName());
        System.out.println("Instructor: " + offering.getInstructor().getName());
        System.out.println("Course: " + offering.getCourse().getTitle());
    }
}