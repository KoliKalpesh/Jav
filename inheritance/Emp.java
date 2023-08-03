package inheritance;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);


    }
    public static void main(String args[]){
        Address a1=new Address("ak","mh","gjg");
        Address a2=new Address("dgd","dgd","dgsfs");
        Emp e1=new Emp(101,"kalpesh",a1);
        Emp e2=new Emp(102,"koli",a2);
        e1.display();
        e2.display();


    }

    
}
