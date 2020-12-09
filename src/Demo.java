
public class Demo {

    private int a, b;
    
    public Demo(int x, int y){
        a=x; b=y;
    }
 
    public void show(){
        int a=5;
        System.out.println(this.a);
        System.out.println(b);
        System.out.println("______________________");
    }
    
            
    
    public static void main(String[] args) {

        Demo d1=new Demo(10,20);
        Demo d2=new Demo(30,40);
        
        d1.show();
        d2.show();
                
        
    }
}
