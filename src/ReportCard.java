
public class ReportCard {

    public static void main(String[] args) {

        //here we are producing the report of some students.
        
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        s1.setData(111,"AAA",50);
        s2.setData(112,"BBB", 60);
        s3.setData(113,"CCC",30);
        
        s1.reportCard();
        s2.reportCard();
        s3.reportCard();
        
        
        Student.showOverallResult();
    }
}
