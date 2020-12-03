
public class VAExamples {

    public static void show(String... items){
        for(String item:items){
            System.out.println(item);
        }
        System.out.println("______________________________________________");
    }
    //this method is having a parameter of int-varargs (here we can pass 0 to n no of int values)
    public static void add(int... v){   
        int sum=0;
        
        for(int num:v){
            sum=sum+num;
        }
        
        System.out.println(sum);
    }

    
    public static void main(String[] args) {
        show("ssi");
        show("java","python");
        show("indore","bhopal","delhi");
        show("india","australia","canada","america");
        
        add(10,20); 
        add(10,20,30);
        add(10,20,30,40);
        
    }
}
