//Inheritance  

public class A {
    public int a = 45;
    public void print(){
        System.out.println(this.a);
    }


}

class B extends A{
    public static void main(String[ ] args){
        B obja = new B();
        obja.print();

        System.out.println(obja.a);
    }
}

//Output:
//        45
//        45