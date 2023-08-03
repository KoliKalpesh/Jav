package objectandclasses;

class Rectangle{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void area(){
        System.out.println("Area of rectangle "+length*width);
    }
}

public class TestRectangle {
    public static void main(String args[]){
        Rectangle r1= new Rectangle();
        Rectangle r2=new Rectangle();
        r1.insert(4,8);
        r2.insert(6,4);
        r1.area();
        r2.area();
    }
    
}
