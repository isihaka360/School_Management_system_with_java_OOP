/**
 * This class is responsible for keeping the track
 * of Teacher's name ,Id and salary
 */
public class Teacher {
    private String name;
    private int salaryEarned;
    int salary;
    
    /**
     *Create new teacher's object
     * @param Id Id for a teacher
     * @param name name of a teacher
     * @param salary salary of a teacher
     */
    public Teacher(int Id , String name , int salary){
        this.name = name;
        this.salaryEarned = 0;

}
    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the salaryEarned
     */
    public int getSalaryEarned() {
        return salaryEarned;
    }

    /**
     * @param salaryEarned the salaryEarned to set
     */
    public void setSalaryEarned(int salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    /**
     * adds to salaryEarned 
     * @param salary
     */

    public  void receiveSalary(int salary) {

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    public String getName() {
        return name;
    }

}




