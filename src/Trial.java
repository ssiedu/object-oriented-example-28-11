
public class Trial {

    private int x, y;
    
    public boolean equals(Trial tmp){
        if(x==tmp.x && y==tmp.y){
            return true;
        }else{
            return false;
        }
    }
    
    public Trial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        String s1=new String("indore");
        String s2=new String("indore");
        
        boolean res1=(s1==s2);              //references compare
        System.out.println(res1);
        
        boolean res2=s1.equals(s2);         //objects compare
        System.out.println(res2);
        /*
        Trial t1=new Trial(10,20);
        Trial t2=new Trial(10,20);
        Trial t3=t1;
        boolean res1=(t1==t2);
        System.out.println(res1);
        
        boolean res2=t1.equals(t2);
        System.out.println(res2);
        
        //boolean res2=(t1==t3);
        //System.out.println(res2);
        */
    }
}
