package inheritance;
class Employee{
    float salary=40000;
}

public class programmer extends Employee {
    int bonus=10000;
    public static void main(String args[]){
        programmer p1=new programmer();
        System.out.println("programmer salary is "+p1.salary);
        System.out.println("programmer bonus is "+p1.bonus);



    }



}
