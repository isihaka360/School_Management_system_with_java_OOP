/**
 * This class is ressponsible for keeping
 * tracks of students fees , name ,fees paid and
 * grade
 */

public class Student{

    private int Id;
    private String name;
    private int grade;
    private int feespaid;
    private  int feesTotal;

    /**
     * To create new students by intitializing.
     * fees for every students is $30,000.
     * fees paid initially is 0
     * @param Id id for students : unique
     * @param name name of the student
     * @param grade grade of the student
     * Always try to initialize all the fields of class
     */
    public Student(int Id , String name, int grade){

        this.feespaid = 0;
        this.feesTotal = 30000;
        this.Id = Id;
        this.name = name;
        this.grade = grade;

}

//not going to alter the student name,student id.

    /**
     * used to update the student's grade
     *
     * @param grade new grade of student
     */
    public void setGrade(int grade){

        this.grade = grade;

    }


    /**
     * feesPaid = 10,000 + 5000 + 15000
     * keep adding the fes to the feespaid field
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){

        feespaid = feespaid + fees;
        School.updateTotalMoneyEarned(feespaid);

    }


    /**
     *
     * @return the Id of the student
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */
    public int getFeespaid() {
        return feespaid;
    }

    /**
     *
     * @return the total fees paid by the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainFess(){


        return feesTotal - feespaid;


    }

    @Override
    public String toString() {
        return "Student's name : "+ name+
                " Total fees paid so far "+feespaid+".00Tzs"+
                " The remaining fees "+getRemainFess()+".00Tzs"+
                " out of "+getFeesTotal()+".00Tzs";
    }





}