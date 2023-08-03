package objectandclasses;
class Account{
    int acc_no;
    String name;
    float amount;

    void insert(int ac,String n,float amt){
        acc_no=ac;
        name=n;
        amount=amt;

    }
    void deposit(float amt){
        amount=amount+amt;System.out.println(amt+"deposited");

    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient balance");
        }
        else{

        amount=amount-amt;
        System.out.println(amt+" withdrawn");
        }
    }
    void checkbalance(){
        System.out.println("balance is "+amount);
    }
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}


public class TestAccount {
    public static void main(String args[]){
        Account a1= new Account();
        a1.insert(12345,"kalpesh",10000);
        a1.display();
        a1.checkbalance();
        a1.deposit(5000);
        a1.checkbalance();
        a1.withdraw(6000);
        a1.checkbalance();
    }
    
}
