package cl.monitor.DemoConsola;

import java.text.DecimalFormat;
import java.util.Random;

public class DemoConsola {

	public static void main(String[] args) {
		ValidadorMargenSimple validadorMargenSimple = new ValidadorMargenSimple();
		ValidadorMargenComplejo validadorMargenComplejo = new ValidadorMargenComplejo();
		
		
		DecimalFormat f = new DecimalFormat("0.00");
		
		System.out.println("-------------------------------------------------");
		System.out.println("Demostración Algoritmo Verificación Margen");
		System.out.println("-------------------------------------------------");
	
		for (int x =1; x < 6; x++) {
			double PrecioVenta =  getRandom(200.00, 2000.00);
			double Costo = getRandom(200.00, 2000.00);
			System.out.println(x+". Precio "+(f.format(PrecioVenta))+" y Costo "+(f.format(Costo)));
			System.out.println("Algoritmo Simple: "+ validadorMargenSimple.Validador(PrecioVenta, Costo));
			System.out.println("Algoritmo Complejo: "+ validadorMargenComplejo.Validador(PrecioVenta, Costo));
			
			System.out.println(" ");
		}
	}
	
	public static double getRandom(Double valorMinimo, Double valorMaximo) {
        Random rand = new Random();
        return  valorMinimo + ( valorMaximo - valorMinimo ) * rand.nextDouble();
    }

}
