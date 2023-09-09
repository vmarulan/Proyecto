import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Iris", "811007729", "6040222","Cr43a 7 50");
        Empleado empleado1 = new Empleado( "Felipe", "fb1036@gmail.com", empresa, "administrador");
        MovimientoDinero movimientoDinero = new MovimientoDinero(5000, "Caja Menor", empleado1 );

        System.out.println("El movimiento generado fue por el empleado " + empleado1.getNombre() +  " por concepto de " + movimientoDinero.getConcepto() + " por un valor de " + movimientoDinero.getMonto());
    }


}
