import java.util.Scanner;

class Person{
    String Name,Peraddress;

}
class Student extends Person{
    public void Display(){
        Name ="Amarendra";
        Peraddress="Bhadrak";
        System.out.println("Name is "+Name);
        System.out.println("Address is "+Peraddress);
    }
}
class Teacher extends Person{
    public void Display(){
        Name ="Sanu";
        Peraddress="Balasore";
        System.out.println("Name is "+Name);
        System.out.println("Address is "+Peraddress);
    }
}
public class Inheritance {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Student Information");
        // String empname=sc.nextLine();
        Teacher obj=new Teacher();
        obj.Display();
        Student obj2=new Student();
        obj2.Display();
    }
}