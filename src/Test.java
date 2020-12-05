
public class Test {
    
    private int x, y;
                          //30
    public void setData(int a){     //a method to initialize x only
        x=a;
    }
                        // 30     40
    public void setData(int p, int q){  //a method to initialize x and y both.
        setData(p); //calling one arg setData to initialize x
        y=q;
    }
    public void show(){
        System.out.println(x+","+y);    //this show method will display x and y members of calling object
    }
    public static void main(String[] args) {
  
        Test t1=new Test();
        Test t2=new Test();
        t1.setData(10);
        t2.setData(30, 40);
        t1.show();
        t2.show();
        
    }
}
