
public class Demo {

    int a, b;           //non-static (instance)
    static int p, q;    //static  (class)
    
    //non-static method
    public void show(){
        System.out.println(a+","+b);    //non-static variables
        System.out.println(p+","+q);    //static variables
    }
    
    //static method
    public static void disp(){
        //System.out.println(a+","+b);    //non-static variables    (non-static var cant be directly used in static methods)
        System.out.println(p+","+q);    //static variables
    }        
    
    public static void main(String[] args) {

        Demo d1=new Demo();
        Demo d2=new Demo();
             
        d1.a=10; d1.b=20;
        d2.a=30; d2.b=40;
        
        p=50; q=60;
        
        
        
    }
}
