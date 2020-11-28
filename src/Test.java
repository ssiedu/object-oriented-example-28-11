public class Test {
    public static void main(String[] args) {
   
        int step=72;
        String str="its  a java code java is object oriented programming language and every object oriented programming language is powerful. this is text to be splitted into multiple lines and that is just for testing the code for demo purpose and this is just a test";
        int len=str.length();
        System.out.println(len);
        while(len>step){
            String tmp=str.substring(0, step-1);
            System.out.println(tmp);
            str=str.substring(tmp.length());
            //str=str.substring(0, str.substring(0, step).lastIndexOf(" ",step));
            len=str.length();
        }
        System.out.println(str);
}
}
