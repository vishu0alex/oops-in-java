 class product{
    int x;
    int y;
    public void  pro(){
           System.out.println("pro ="+(x*y));
    }
    product(int x,int y){
        System.out.println(x*y);
        this.x=x;
        this.y=y;
    }
   
}
public class Main{
    public static void main(String[]args){
        product obj=new product(4,6);
        product obj2=obj;
        obj2.pro();
      }
}
