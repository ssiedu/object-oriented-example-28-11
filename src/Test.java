
public class Test {
    
    private int x, y;
    
    public Test(int a, int b){
        x=a; y=b;
    }
    public void show(){
        System.out.println(x+","+y);    
    }
    public static void main(String[] args) {
  
        Test t1;
        new Test(10,20);
        Test t2=new Test(30,40);
        Test t3=t2;
        t1=t2;
        t1.show();
        t2.show();
        t3.show();
        System.out.println("_____________________________________");
        t3=new Test(50,60);
        t2=t3;
        t1=new Test(70,80);
        t1.show();
        t2.show();
        t3.show();
    }
}
