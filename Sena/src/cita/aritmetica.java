package Objetos;

public class Aritmeticaapp {

    public static void main(String[] args) {
        //Crear 1er. objeto--- new intancia el objeto
        Aritmetica ob = new Aritmetica(100, 200);
        //ob.sumar();
        System.out.println("Normal:"+ob.sumar());
        ob.setX(10);
        ob.setY(15);
        System.out.println("Set:"+ob.sumar());
        
        Aritmetica ob1 = new Aritmetica();
        ob1=ob;
        //ob.sumar();
        System.out.println("Normal:"+ob1.sumar());
        ob1.setX(34);
        ob1.setY(45);
        System.out.println("Set:"+ob1.sumar());
        //restar mul divi mod valabs parimpar
    }
}
