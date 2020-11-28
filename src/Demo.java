
public class Demo {

    int a, b;           //non-static (instance)
    static int p, q;    //static  (class)
    
    
    public static void main(String[] args) {

        //instantiating Demo class thrice to create three instances
        
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        
        d1.a=10; d1.b=20;
        d2.a=30; d2.b=40;
        d3.a=50; d3.b=60;
        System.out.println(d1.a+","+d1.b);
        System.out.println(d2.a+","+d2.b);
        System.out.println(d3.a+","+d3.b);
        System.out.println("-------------------------------------------------------");
        
        d1.p=100; d1.q=200;
        d2.p=300; d2.q=400;
        d3.p=500; d3.q=600;
        System.out.println(d1.p+","+d1.q);
        System.out.println(d2.p+","+d2.q);
        System.out.println(d3.p+","+d3.q);
                
    }
}
