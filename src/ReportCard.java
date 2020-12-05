
public class ReportCard {

    public static void main(String[] args) {

        //here we are producing the report of some students.
        Student s=new Student();
        Student s1=new Student(111,"AAA",50);
        Student s2=new Student(112,"BBB",60);
        Student s3=new Student(113,"CCC",70);
        Student s4=new Student(114,"DDD");
        
        
        //s1.showGrade();
        //s2.showGrade();
        //s3.showGrade();
        
        //Student.showGrade(s1);  //here we are passing an object to method's arg.
        //Student.showGrade(s2);
        //Student.showGrade(s3);
       
        //Student.showAvg(s1,s2);         //{s1,s2}
        //Student.showAvg(s1,s2,s3);      //{s1,s2,s3}
        //Student.showAvg(s1,s2,s3,s4);
        
        //Student.showAvg(s2, s3);
        //Student.showAvg(s1, s3);
        //s1.showAvg(s2);
        //s2.showAvg(s3);
        //s1.showAvg(s3);
        s.reportCard();
        s1.reportCard();
        s2.reportCard();
        s3.reportCard();
        s4.reportCard();
        
        //Student.showOverallResult();
    }
}
