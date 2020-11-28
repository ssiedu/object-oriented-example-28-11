
//by creating a circle class, we are creating blueprint of a circle.
public class Circle {

    //data-members (to define the properties of an object)
    private double radius, area, circumference;
    
    //member-functions (methods) (to perform the operations on the object
    
    public void setRadius(double r){
        radius=r;
    }
    
    public void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area  : "+area);
    }
    
    public void computeCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circumference  : "+circumference);
    }
    
}
