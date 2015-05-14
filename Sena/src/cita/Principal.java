
package cita;

public class Principal {
    
    public static void main(String[] args) {
        BufferedReader lector=new Bufferedreader (new inputStreamReader())
        
        int numero, tipo;
        double tarifa, vrfinal;
        
        Cita ob = new Cita(1,1,1.1);
        
        System.out.println("Digite el numero de cita que desea");
        
        
        System.out.println("Digite la tarifa");
        
        System.out.print("El numero de la cita es: ");
         ob.getNumero();
         
         System.out.print("Esta cita es de tipo: ");
         ob.getTipo();
         
         System.out.print ("Su tarifa normal es: ");
         ob.getTarifa();
         
         System.out.print("Pero por ser de tipo");
         ob.getTipo();
         System.out.print("queda con un valor final de ");
         ob.calcularValorFinal();
    }
}
