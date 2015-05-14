
package cita;

public class Cita {

    int numero, tipo;
    double tarifa, vrfinal;
    
    public Cita (int numero, int tipo, double tarifa) {
      this.numero=numero;  
      this.tipo=tipo;
      this.tarifa=tarifa;
    }

      
    public int getNumero () {
    return numero;    
    }
    
    public String getTipo() {
        
        if (numero >= 1 && numero <= 3) {
            return "General";
                }
            else
            if (numero >=4 && numero <=5) {
               return "Especialista";
            }
        else
                return "Numero de cita incorrecta";
    }
    
    public double getTarifa () {
        return tarifa;
    }
    
    public double calcularValorFinal () {
        if (numero >= 1 && numero <= 3) {
            vrfinal=tarifa-(tarifa*0.50);
        }
        else {
        vrfinal=tarifa+(tarifa*0.50);
        }
        return vrfinal;
    }
    
}
