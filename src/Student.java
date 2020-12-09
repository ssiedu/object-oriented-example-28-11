
public class Student {
    //data
    private int rno;        //one copy per object
    private String name;    //one copy per object
    private int per;        //one copy per object
    private static int totalPassed;
    private static int totalFailed;
  
    public static void showAvg(Student... s){
        //to find avg we will add the per of all students and will divide it by no of students
        int sum=0;
        //this loop will compute the sum
        for(int i=0; i<s.length; i++){
            sum=sum+s[i].per;
        }
        //now we will display avg
        System.out.println("AVG PER : "+(sum/s.length));
    }
    /*
    public static void showAvg(Student tmp1, Student tmp2, Student tmp3, Student tmp4){
        System.out.println("Avg Percentage of "+tmp1.rno+","+tmp2.rno+","+tmp3.rno+","+tmp4.rno+" is "+(tmp1.per+tmp2.per+tmp3.per+tmp4.per)/4);    
    }
    public static void showAvg(Student tmp1, Student tmp2, Student tmp3){
        System.out.println("Avg Percentage of "+tmp1.rno+","+tmp2.rno+","+tmp3.rno+" is "+(tmp1.per+tmp2.per+tmp3.per)/3);    
    }
    public static void showAvg(Student tmp1, Student tmp2){
        System.out.println("Avg Percentagre of "+tmp1.rno+","+tmp2.rno+" is "+(tmp1.per+tmp2.per)/2);    
    }
    */
    
    public static void showGrade(Student tmp){
        if(tmp.per>=90){
            System.out.println("Grade of "+tmp.rno+" is A");
        }else if(tmp.per>=80){
            System.out.println("Grade of "+tmp.rno+" is B");
        }else{
            System.out.println("Grade of "+tmp.rno+" is C");
        }
    }
            
    
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
    void f1(){
        
    }

    public Student() {
    }
    
    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    
    
    public Student(int rno, String name, int per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

    
    
    
    
    
    
     
}
