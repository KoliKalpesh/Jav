package object_class;
class Student{
    String name;
    int rollno;
    static String college="ITS";
    //constructor
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    //method
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class staticVariable1 {
    public static void main(String args[]){
        Student s1=new Student(111,"kalpesh");
        Student s2=new Student(222,"varun");
        //Student.college="nmm";
        s1.display();
        s2.display();

    }
    
}
