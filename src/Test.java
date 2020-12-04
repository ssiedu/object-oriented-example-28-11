
public class Test {
    
    public Test(){
        System.out.println("Zero-Arg");
    }
    public Test(int i){
        System.out.println("One-Int-Arg");
    }
    public Test(String s){
        System.out.println("One-String-Arg");
    }
    public Test(int a, int b){
        System.out.println("Two-Int-Arg");
    }
    
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test(10);
        Test t3=new Test(10,20);
        Test t4=new Test("indore");
        
        
    }
}
