
public class ReportCard {

    public static void main(String[] args) {

        //here we are producing the report of some students.
        
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        
        s1.setData(111,"AAA",90);
        s2.setData(112,"BBB", 80);
        s3.setData(113,"CCC",30);
        s4.setData(114,"DDD",50); 
        //s1.showGrade();
        //s2.showGrade();
        //s3.showGrade();
        
        //Student.showGrade(s1);  //here we are passing an object to method's arg.
        //Student.showGrade(s2);
        //Student.showGrade(s3);
       
        Student.showAvg(s1,s2);
        Student.showAvg(s1,s2,s3);
        Student.showAvg(s1,s2,s3,s4);
        
        //Student.showAvg(s2, s3);
        //Student.showAvg(s1, s3);
        //s1.showAvg(s2);
        //s2.showAvg(s3);
        //s1.showAvg(s3);
       // s1.reportCard();
       // s2.reportCard();
       // s3.reportCard();
        
        
        //Student.showOverallResult();
    }
}
