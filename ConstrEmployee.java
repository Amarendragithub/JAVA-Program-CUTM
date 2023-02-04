import java.util.Scanner;

public class ConstrEmployee {
    private int empid, empsal, empinc;
    private String empname;
    public ConstrEmployee(){

    }
    public ConstrEmployee(int empid, int empsal, int empinc, String empname){
        this.empname=empname;
        this.empid=empid;
        this.empsal=empsal;
        this.empinc=empinc;
    }
    public void calSalary(){
        empsal=(empsal*empinc/100)+empsal;
    }
    public void display(){
        System.out.println("Emp Name "+empname);
        System.out.println("Emp Id "+empid);
        System.out.println("Emp Sal "+empsal);
        System.out.println("Emp Inc "+empinc);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String empname=sc.nextLine();
        System.out.println("Enter empid");
        int empid=sc.nextInt();
        System.out.println("Enter empsal");
        int empsal=sc.nextInt();
        System.out.println("Enter increment");
        int empinc=sc.nextInt();
        ConstrEmployee e=new ConstrEmployee(empid,empsal,empinc,empname);
        // ConstrEmployee(empid,empsal,empinc,empname);
        e.calSalary();
        e.display();
        sc.close();
    } 
}