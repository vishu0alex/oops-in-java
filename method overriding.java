class parent{
    void print(){
        System.out.println("parent");
    }
}

class subclass extends parent{
    void print(){
        System.out.println("subclass");
    }
}

class Main{
    public static void main(String[]args){
        parent a;
        a=new subclass();
        a.print();
        a=new parent();
        a.print();
    }
}
