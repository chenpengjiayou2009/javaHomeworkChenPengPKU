package thirdHomework;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents++] = student;
    }

    public String[] getStudents(){
        return students;
    }
    public void setStudents(String[] students){
        this.students = students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    protected Course clone(){
        Course newCourse = new Course(this.courseName);
        newCourse.setStudents(this.students.clone());
        newCourse.setNumberOfStudents(this.numberOfStudents);
        return newCourse;
    }
}
