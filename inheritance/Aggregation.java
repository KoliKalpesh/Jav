package inheritance;
class Operation{
    int Square(int n){
        return n*n;
    }
}


public class Aggregation {
    Operation op;//aggregation
    double pi=3.14;

    double area(int radius){
        op=new Operation();
        int rsquare=op.Square(radius);//code reusability (i.e. delegates the method call).
        return pi*rsquare;

    }
    public static void main(String args[]){
        Aggregation a=new Aggregation();
        double result=a.area(5);
        System.out.println(result);
    }

    
    
}
