import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher isihaka = new Teacher(001,"IS-HAKA A.MUHUNZI",8000);
        Teacher raheem = new Teacher(002,"RAHEEM M.KIPOYO",1200);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(isihaka);
        teacherList.add(raheem);
        


        Student hawa = new Student(1,"AMINA ALLY",2);
        Student juma = new Student(2,"JUMA HABIBU",12);
        Student nsiah = new Student(2,"Nsiah chang'ambo",1);

        List <Student> studentList = new ArrayList<>();
        studentList.add(hawa);
        studentList.add(juma);
        studentList.add(nsiah);



        School chalinzeSec = new School(teacherList,studentList);


        hawa.payFees(50000);
        juma.payFees(4000);
        nsiah.payFees(8000);

        System.out.println("The Chalinze secondary has earned "+chalinzeSec.getTotalMoneyEarned()+".00Tzs");


        System.out.println("-----Making THE SCHOOL PAY SALARY------");
        isihaka.receiveSalary(isihaka.getSalaryEarned());
        System.out.println("The Chalinze Secondary has spent for salary to "+isihaka.getName()
        +" and now has "+ chalinzeSec.getTotalMoneyEarned()+".00Tzs");


        raheem.receiveSalary(raheem.getSalaryEarned());
        System.out.println("The Chalinze Secondary has spent for the salary to "+ raheem.getName()
        +" and now has "+chalinzeSec.getTotalMoneyEarned()+".00Tzs");


        System.out.println(hawa);
        System.out.println(juma);
        System.out.println(nsiah);

        



    }
}
