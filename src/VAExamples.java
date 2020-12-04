
public class VAExamples {

    public static void show(String... items){
        for(String item:items){
            System.out.println(item);
        }
        System.out.println("______________________________________________");
    }
    
    public static void add(int a, int b){
        System.out.println("Sum of "+a+","+b+" = "+(a+b));
    }
    //this method is having a parameter of int-varargs (here we can pass 0 to n no of int values)
    public static void add(int... v){   
        int sum=0;
        
        for(int num:v){
            sum=sum+num;
        }
        
        System.out.println("Sum of Integer Values : "+sum);
    }

    public static void add(double...v){
        double sum=0;
        for(double d:v){
            sum=sum+d;
        }
        System.out.println("Sum Of Double Values : "+sum);
    }
    
    public static void main(String[] args) {
        
        
        //add(10,20);     //its matching with two add(int,int) and add(int...) , pref will be given to exact match.
        add(10,20,30);
        add(10,20,30,40);
        add(10,20);
        add(10,20,30,40,50);

        //add(2.5,3.5,4.5);
        //show("java","python");
        //show("indore","bhopal","delhi");
        //show("india","australia","canada","america");

    }
}
