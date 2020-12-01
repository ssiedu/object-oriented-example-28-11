
public class Student {
    //data
    private int rno;        //one copy per object
    private String name;    //one copy per object
    private int per;        //one copy per object
    private static int totalPassed;
    private static int totalFailed;
    
    //methods
      
    public static void showOverallResult(){
        System.out.println("Total Passed Candidates : "+totalPassed);
        System.out.println("Total Failed Candidates : "+totalFailed);
        System.out.println("======================================================");
    }
    public  void reportCard(){
        System.out.println("Report-Card ...... ");
        System.out.println("________________________________________________");
        System.out.println("Roll Number : "+rno);
        System.out.println("Stud Name   : "+name);
        System.out.println("Percentage  : "+per);
        if(per>=33){
            System.out.println("Student Passed ....");
            totalPassed++;
        }else{
            System.out.println("Student Failed ....");
            totalFailed++;
        }
        System.out.println("________________________________________________");
    }
    
    public  void setData(int a, String b, int c){
        rno=a;      //here we are assigning the value of parameter a to instance variable rno
        name=b;     //here we are assinging the value of parameter b to instance variable name
        per=c;      //here we are assigning the value of parameter c to class variable per
    }
}
