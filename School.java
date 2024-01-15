import java.util.List;

/**
 * Many teachers , many students
 * implements Teachers and students by
 * using an Arraylist
 */
public class School {
    private List <Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of the students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {

        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *add the teacher to the school
//     * @param teacher the teacher to be added
     */
    public void addTeachers(Teacher teacher) {

        teachers.add(teacher);



    }

    /**
     *
     * @return the list of the  students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *add the student in the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {

        students.add(student);

    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *adds the total money earned by the school
     * @param MoneyEarned money that is supposed to be added to school
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {

        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spends by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *update the money that is spent by school which
     * is the salary given by school to its teachers
     * @param moneySpent the money spent by school
     */
    public static void updateTotalMoneySpent(int moneySpent) {

        totalMoneySpent -= moneySpent;
    }

   
}
